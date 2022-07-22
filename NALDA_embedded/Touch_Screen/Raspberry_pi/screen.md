# 1. 제품명

10.1 Inch Touch Screen for Raspberry Pi

# 2. 제품 정보

- 10.1 인치 모니터 10-point capacitive touch screen
- 1280x800
- 사용 가능 운영 체제 : Raspbian, Ubuntu, Ubuntu Mate, Windows, Android, and Chrome OS(USB 확장 케이블 필요)
- Features
    - Resolution: 1280x800
    - Size: 10.1"
    - LCD Type: IPS
    - Power: DC12V/2A
    - Consumption: 5W
    - Capacitive touch
    - 10-point touch screen

# 3. 기능 설명

## 1. 메인보드 정보

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled.png)

- 메인 보드에 2개 LED 존재
- 스크린 전원이 켜지면 2개 LED 즉각적으로 켜짐
- 만약 HDMI 신호가 없으면 초록 LED만 들어온다.
- HDMI 신호 있으면 빨간 LED도 들어옴
- 버튼 누르면 디스플레이 화면 들어오고, LED 두 개 켜짐
- 만약 디바이스 끄면 붉은색 LED만 들어온다.

## 2. 메인보드 버튼

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%201.png)

1. Power
- 기기를 키고 끄는데 사용
1. Menu
- 메뉴 보여줌, 확인버튼
1. V- 
- 메뉴 인터페이스로 돌아감
- 다른 인터페이스의 볼륨 내리기
1. V+
- 메뉴 인터페이스를 올림
- 다른 인터페이스의 볼륨 높이기
1. Exit
- 나가기

## 3. 메인보드 핀 정보

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%202.png)

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%203.png)

# 4. 설치

## 1. 메인보드 스크린에 고정하기

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%204.png)

- 메인 보드를 후면 케이스에 사전 설치된 4 2.5*6 구리 스탠드오프에 놓고 버튼을 케이스 가장자리로 향하게 하고 보드의 구멍과 스탠드오프를 정렬한다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%205.png)

- 2.5*14.4 스탠드오프를 구멍에 삽입하고 조인다.

## 2. 라즈베리파이를 스크린에 고정

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%206.png)

- 화면 뒷면에는 수직 슬롯과 수평 슬롯이 있으므로 작은 렌치로 너트와 2.5 * 6 스탠드 오프를 이동하여 크기가 다른 보드를 수정할 수 있다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%207.png)

- 라즈베리 파이를 화면과 함께 사용하려면 미리 설정되어 있으므로 스탠드 오프를 조정할 필요가 없다. RPi에 구멍이 있고 스탠드오프가 정렬된 케이스에 보드를 올려놓고 2.5*14.4 스탠드오프를 삽입하고 고정하기만 하면 된다.

## 3. 화면 균형 유지

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%208.png)

- 두 개의 2.5*22 스탠드오프를 뒷면의 구멍에 삽입하여 화면의 균형을 유지한다.

## 4. 배선

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%209.png)

- 6핀 backlight 컨트롤 케이블을 LED BS 포트에 꽃는다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2010.png)

- 30핀 LVDS 리본 케이블을 30핀 헤더에 꽃는다. (위의 빨간 선이 button과 가깝게 위치해야 한다.)

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2011.png)

- power 포트를 USB 포트에 꽃는다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2012.png)

- HDMI 케이블을 통해 RPi의 HDMI 포트와 화면을 연결한다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2013.png)

- 라즈베리파이의 USB 포트와 스크린 4핀 USB 케이블을 연결한다.

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2014.png)

- 공급 장치의 전원 케이블을 연결하여 화면의 메인 보드에 전원을 공급한다.

# 5. 가상 키보드 설치

## 1. 설치 명령어

```kotlin
$sudo apt-get install matchbox-keyboard
```

## 2. 설치 완료 화면

![Untitled](/NALDA_embedded/Touch_Screen/Raspberry_pi/Manual_img/Untitled%2015.png)