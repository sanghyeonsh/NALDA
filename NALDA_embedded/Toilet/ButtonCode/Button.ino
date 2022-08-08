#include <SoftwareSerial.h> 
#define BT_RXD 2 
#define BT_TXD 3 
SoftwareSerial ESP_wifi(BT_RXD, BT_TXD); //라즈베리파이와 wifi 통신

const int buttonPin = 5;     // the number of the pushbutton pin
int redled = 6;
int greenled = 7;
//const int ledPin = 13;      // the number of the LED pin

// variables will change:
int buttonState = 0;         // variable for reading the pushbutton status

void setup() {
  // initialize the LED pin as an output:
  //pinMode(ledPin, OUTPUT);
  // initialize the pushbutton pin as an input:
  Serial.begin(9600);
  ESP_wifi.begin(9600); //아두이노<->모듈 간의 통신 속도
  ESP_wifi.setTimeout(5000); 
  delay(1000);
  pinMode(buttonPin,INPUT_PULLUP);
  pinMode(redled,OUTPUT);
  pinMode(greenled,OUTPUT);
}

void loop() {
  if (Serial.available()){
  ESP_wifi.write(Serial.read()); 
  } 
  if (ESP_wifi.available()) { 
  Serial.write(ESP_wifi.read()); 
  }
  // read the state of the pushbutton value
  buttonState = digitalRead(buttonPin);
  Serial.println(buttonState);
  
  if(buttonState==HIGH) {
    digitalWrite(greenled,HIGH);
    digitalWrite(redled,LOW);
    delay(500);
  }
  
  else{
    digitalWrite(redled,HIGH);
    digitalWrite(greenled,LOW);
    delay(500);
  }
  //delay(5000);

  // check if the pushbutton is pressed. If it is, the buttonState is HIGH:
 /* if (buttonState == HIGH) {
    // turn LED on:
    digitalWrite(ledPin, HIGH);
  } else {
    // turn LED off:
    digitalWrite(ledPin, LOW);
  }*/
}
