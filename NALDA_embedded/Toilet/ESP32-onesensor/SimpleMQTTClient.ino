#include "EspMQTTClient.h"
#define led_green 23
#define led_red 22
#define button 21
#define BAUD_RATE 9600


EspMQTTClient client(
  "SK_WiFiGIGA4676",
  "1606051756",
  "192.168.35.242",  // MQTT Broker server ip
  "MQTTUsername",   // Can be omitted if not needed
  "MQTTPassword",   // Can be omitted if not needed
  "TestClient",     // Client name that uniquely identify your device
  1883              // The MQTT port, default to 1883. this line can be omitted
);

int button_push=0;
String buttonString;
char *topic = "toilet/777-200ER-1/HR01";
void tx(){
  client.publish(topic,buttonString);
}

void setup()
{
  Serial.begin(115200);
  pinMode(led_green,OUTPUT);
  pinMode(led_red,OUTPUT);
  pinMode(button,INPUT);
  
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
  button_push= digitalRead(button);
  buttonString = String(button_push);
  if(button_push==1){
    Serial.println(button_push);
    digitalWrite(led_green,HIGH);
    digitalWrite(led_red,LOW);
  }
  else {
    Serial.println(button_push);
    digitalWrite(led_green,LOW);
    digitalWrite(led_red,HIGH);
  }
  tx();
  delay(500);
  client.loop();
}
