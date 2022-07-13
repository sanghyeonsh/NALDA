# 01. ESP8266 초기설정

# 1. ESP8266(ESP-01) 모듈

## 1. WIFI ESP8266 모듈의 핀배열

![Untitled](/NALDA_embedded/1.%20Toilet/ESP8266/Manual_img/Untitled.png)

- ESP8266(ESP-01)은 시리얼 통신을 통해 AT명령으로 설정 변경이 가능하며, 3.3V에서 동작한다.

| Module | Espressif ESP8266 |
| --- | --- |
| ESP8266 Version | ESP-01 |
| 동작 명령 | UART AT command |
| 안테나 구성(Antenna config uration) | On-boad ceramic antenna |
| 통신방식 | 802.11 b/g/n 지원 |
| 통신 속도(Baud rate) | 9600 |
| 플래쉬 메모리(Flash Memory) | 16M Byte |
| 프로세서 스피드(Processor Speed) | 80-160Mhz |
| 크기(Size) | 14.5 x 24.8mm |
| 동작 전압 | 3.3.V(최소 300mA 이상)로만 동작 |

# 2. 아두이노와 ESP8266 통신하기

## 1. ESP8266 초기 설정

- 아두이노 우노 보드와 WIFI ESP8266 모듈의 연결은 시리얼 통신을 이용
- 우노 보드는 시리얼 통신핀 1개만 가지고 있음 이 시리얼 통신핀을 PC와 통신
- 따라서, 우노 보드와 WIFI ESP8266 모듈의 통신을 위해 우노 보드의 디지털 핀을 시리얼 통신핀으로 변경해 사용하는 SoftwareSerial 방식 사용해야 한다.
- ESP8266 모듈은 초기 통신 속도가 115200bps
- SoftwareSerial은 57600bps까지만 지원
- 따라서, ESP8266 모듈의 통신 속도를 9600bps로 변경해서 사용 (통신 속도 변경은 초기 한 번만 적용)

| 아두이노 우노(Uno) | Wifi ESP8266 |
| --- | --- |
| GND | GND & GPIO0 (GPIO0는 펌웨어 업데이트시 사용) |
| 3.3V | CH_PD & 3.3V(VCC) |
| Tx | Tx |
| Rx | RX |

## 2. 초기 설정 결선도

![Untitled](/NALDA_embedded/1.%20Toilet/ESP8266/Manual_img/Untitled%201.png)

![Untitled](/NALDA_embedded/1.%20Toilet/ESP8266/Manual_img/Untitled%202.png)

- CH_PD와 3.3V는 아두이노의 3.3V 구멍에 연결, GND와 *GPIO0*은 아두이노의 GND 구멍에 연결
- Tx와 Rx는 그대로 연결
- *GPIO0*은 eps8266을 플래시 모드로 진입하게 한다.(펌웨어를 업데이트하는데 필요)

## 3. 펌웨어 업데이트

1. 펌웨어 업데이트 툴 다운로드 후 C:\ 루트 드라이버에서 압축 풀기
2. 실행
    
    ![Untitled](/NALDA_embedded/1.%20Toilet/ESP8266/Manual_img/Untitled%203.png)
    
    ![Untitled](/NALDA_embedded/1.%20Toilet/ESP8266/Manual_img//Untitled%204.png)
    
    - Bin 버튼에서 업데이트용 펌웨어 파일 불러오기
    - v0.9.2.2 AT Firmware.bin 파일
    - 포트 번호 적기(장치관리자 확인)