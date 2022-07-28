#include "EspMQTTClient.h"

EspMQTTClient client(
  "mincoding2G",
  "333666999",
  "192.168.0.125",  // PC windows ip address
  "MQTTUsername",   // Can be omitted if not needed
  "MQTTPassword",   // Can be omitted if not needed
  "TestClient",     // Client name that uniquely identify your device
  1883              // The MQTT port, default to 1883. this line can be omitted
);

char *topic1 = "home/first/temp";
char *topic2 = "home/first/humid";

void setup()
{
  Serial.begin(115200);
  pinMode(LED_BUILTIN, OUTPUT);
  client.enableDebuggingMessages(); // Enable debugging messages sent to serial output
  client.enableHTTPWebUpdater(); // Enable the web updater. User and password default to values of MQTTUsername and MQTTPassword. These can be overridded with enableHTTPWebUpdater("user", "password").
  client.enableOTA(); // Enable OTA (Over The Air) updates. Password defaults to MQTTPassword. Port is the default OTA port. Can be overridden with enableOTA("password", port).
  client.enableLastWillMessage("TestClient/lastwill", "I am going offline");  // You can activate the retain flag by setting the third parameter to true
}

void onConnectionEstablished()
{
  client.subscribe(topic1, [](const String & payload) {
    Serial.println(payload);
    if( payload=="1" ){
        Serial.println("LED ON");
        digitalWrite(LED_BUILTIN, HIGH);
    }
    else if( payload.toInt()==0 ){
        Serial.println("LED OFF");
        digitalWrite(LED_BUILTIN, LOW);
    }
  });
  client.subscribe(topic2, [](const String & payload) {
    Serial.print("humid : ");
    Serial.println(payload);
  });
}
void loop()
{
  //tx();
  delay(20);
  client.loop();
}
