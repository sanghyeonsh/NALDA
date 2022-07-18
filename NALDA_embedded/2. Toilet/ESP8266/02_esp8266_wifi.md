# 02. ESP8266 AT-통신 모드

# 1. 소프트웨어 시리얼 통신

- AT통신모드에서는 하드웨어 시리얼이 아닌 소프트웨어 시리얼 통신을 이용해야 한다.
- 아두이노의 0번,1번 핀에 연결된 것을 2번, 3번 등 다른 디지털 핀으로 연결
- GPIO0번이 GND에 연결된 것을 제거
- ESP-01은 3.3V로 동작되는 것이 원칙이므로 Rx 수신 단자에 수신되는 신호도 3.3V로 수신될 수 있도록 저항을 이용
- 1kohm 3개 연결 후 1kohm 2개 연결된 쪽에 Rx 연결하면 5v x (2/3) = 3.333V 레벨 인가가능

![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled.png)

- 만약 AT통신 안될경우 CH_RD 단자 + 전원 단자 사이에 10kohm 저항 추가

![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%201.png)

- 코드 예제

```arduino
#include <SoftwareSerial.h>
#define BT_RXD 2
#define BT_TXD 3
SoftwareSerial ESP_wifi(BT_RXD,BT_TXD);
void setup(){
	Serial.begin(9600);
	ESP_wifi.begin(9600);
	ESP_wifi.setTimeout(5000);
	delay(1000);
}
void loop(){
	if(Serial.available()){
		ESP_wifi.write(Serial.read());
	}
	if(ESP_wifi.available()){
		Serial.write(ESP_wifi.read());
	}
}
```

- 아두이노의 Rx와 Tx를 ESP-01 모듈의 Rx와 Tx와 교차해서 연결해주어야 한다.

# 2. AT(명령어) 통신 테스트 및 설정

1. AT : 기본적으로 “OK”라는 응답을 통해 통신을 확인하는 명령어
2. AT+GMR : ESP-01 wifi 모듈의 버전을 확인하는 명령어
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%202.png)
    
3. AT+CWMODE? : Wifi 모드 확인 및 설정 명령
    1. 1번(State Mode, AP(Wifi 공유기)에 접속할 수 있는 기기로 설정)
    2. 2번(AP Mode, Access Point(Wifi 공유기) 기능으로 설정)
    3. 3번(AP + Station Mode, 접속기기 + AP, 복합 모드 설정)
    4. 모드 설정 방법 : AT+CWMODE=번호
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%203.png)
    
4. AT+CWLAP : 주별 AP(Wifi 공유기) 리스트를 시리얼 모니터 창에 출력 명령

![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%204.png)

1. AT+CWJAP=”SSID”,”비번” : 특정 AP에 연결 (명령어 사이 공백 없어야함)
    - 비번 없을 시 AT+CWJAP=”SSID”,””로 입력
2. AT+CWSAP=”SSID”,”비번”,”채널 id”,”보안방식” : AP 모드 사용시, SSID, 비번, 채널, 보안방식 설정
3. AT+CWJAP? : 연결된 AP 확인
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%205.png)
    
4. AT+CWQAP : AP 접속 해제 명령
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%206.png)
    
5. AT+CIFSR : 할당 받은 IP 주소 확인
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%207.png)
    
6. AT+CIPSTATUS : TCP/IP 연결 상태 확인 (만약, status:2이면 IP 주소를 획득한 상태)
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%208.png)
    
7. AT+CIPSTART=”종류”,”주소”,”포트” : TCP/UDP 연결
    
    ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%209.png)
    
    1. AT+CIPSEND=크기, > 표시후 데이터 입력 후 엔터 : 특정 바이트 크기의 데이터를 보내기 위한 명령어
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2010.png)
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2011.png)
        
    2. AT+CIPCLOSE : TCP/UDP 연결 해제
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2012.png)
        
    3. AT+CIPMUX=모드 : 다중 접속 설정(서버코드를 돌리기 위해서는 다중 접속설정이 필요)
        - 예) esp-01 모듈에 연결된 led를 wifi공유기로 연결된 PC나 핫스팟으로 연결된 스마트폰으로 켜거나 끄려고 할 때, 다중 접속 모드를 멀티서버(1)로 설정되어 있어야함
        - AT+CIPMUX=0 : Single 클라이언드
        - AT+CIPMUX=1 : Multiple 서버
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2013.png)
        
    4. AT+CIPSERVER=모드,포트 : TCP 서버 모드로 설정 (AT+CIPMUX=1, 다중접속모드인 상태에서 실행)
        - 모드 0은 서버를 의미하므로 항상 1로 고정함. HTTP 접속인 경우 80포트로 고정
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2014.png)
        
    5. AT+CWLIF : 모듈의 SoftAP에 접속된 station 리스트를 보여준다.
    6. AT+CWDHCP : DHCP 활성/비활성 설정(AP mode)
    7. AT+CIPSTAMAC : Station Mode의 MAC 주소 설정(Station Mode)
    8. AT+CIPAPMAC : AP Mode의 MAC 주소 설정(AP Mode)
    9. AT+CIPSTA : Station Mode의 IP 주소를 설정(고정 IP)
    10. AT+CIPAP : AP Mode의 IP 주소를 설정
    11. AT+RST : 새로 Restart 시킨다. 
        
        ![Untitled](/NALDA_embedded/2.%20Toilet/ESP8266/02_esp8266_wifi_img/Untitled%2015.png)