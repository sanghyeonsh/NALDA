#include "EspMQTTClient.h"
#define led_green 23 // green led GPIO23
#define led_red 22 // red led GPIO22
#define button 21 // button GPIO21
#define BAUD_RATE 115200 


EspMQTTClient client(
  "SK_WiFiGIGA4676", // My wifi 
  "1606051756", // My wifi password
  "192.168.35.242",  // MQTT Broker server ip
  "MQTTUsername",   // MQTT user name, Not use
  "MQTTPassword",   // MQTT password, Not use
  "TestClient",     // Client1
  1883              // The MQTT port, default to 1883. 
);

int button_push=0; // button push var
String buttonString; // change button value to string, to publish topic
char *topic = "toilet/777-200ER-1/HL01"; // topic1, toilet, plane_id=777-200ER-1, toilet_location = Head/Left/01
void tx(){
  client.publish(topic,buttonString); // publish topic 
}

void setup()
{
  Serial.begin(BAUD_RATE); // Serial Baud rate
  pinMode(led_green,OUTPUT); // set led_green output
  pinMode(led_red,OUTPUT); // set led_red output
  pinMode(button,INPUT); // set button input
  
  // Optional functionalities of EspMQTTClient
  client.enableDebuggingMessages(); // Enable debugging messages sent to serial output
  client.enableHTTPWebUpdater(); // Enable the web updater. User and password default to values of MQTTUsername and MQTTPassword. These can be overridded with enableHTTPWebUpdater("user", "password").
  client.enableOTA(); // Enable OTA (Over The Air) updates. Password defaults to MQTTPassword. Port is the default OTA port. Can be overridden with enableOTA("password", port).
  client.enableLastWillMessage("TestClient/lastwill", "I am going offline");  // You can activate the retain flag by setting the third parameter to true
}

// This function is called once everything is connected (Wifi and MQTT)
// WARNING : YOU MUST IMPLEMENT IT IF YOU USE EspMQTTClient
void onConnectionEstablished()
{
  // Subscribe to "mytopic/test" and display received message to Serial
  client.subscribe(topic, [](const String & payload) {
    Serial.println(payload);
  });

}

void loop()
{
  button_push= digitalRead(button); // read button input and store
  buttonString = String(button_push); // change int to string
  if(button_push==1){ // it means nobody use toilet (pull up circuit)
    Serial.println(button_push); 
    digitalWrite(led_green,HIGH); // green led on
    digitalWrite(led_red,LOW); // red led off
  }
  else { // it means someone use toilet
    Serial.println(button_push);  
    digitalWrite(led_green,LOW); // green led off
    digitalWrite(led_red,HIGH); // red led on
  }
  tx(); // public topic
  delay(5000); // delay 5sec
  client.loop();
}
