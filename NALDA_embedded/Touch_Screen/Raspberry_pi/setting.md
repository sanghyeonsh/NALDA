# 1. SD카드 포맷하기

### 1. SD카드 포맷 프로그램 주소 :

- [SD Memory Card Formatter for Windows Download | SD Association](https://www.sdcard.org/downloads/formatter/sd-memory-card-formatter-for-windows-download/)

### 2. SD카드 리더기에 삽입 후 포맷 실행

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7eb5c13e-b35c-4a6f-8676-a34ae5b3519b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220722%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220722T093619Z&X-Amz-Expires=86400&X-Amz-Signature=df63ee1076ee205731cfb708f94846f2c1d7b01be3295cf1f24cb1d9deb9bc89&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

# 2. Pi imager 설치

- [Raspberry Pi OS - Raspberry Pi](https://www.raspberrypi.com/software/)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5a2d033d-3ca5-42a7-a39a-78af2f811565/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220722%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220722T093639Z&X-Amz-Expires=86400&X-Amz-Signature=b13afea35d48d6e012db0e54951f215bec6d562f341eb16b60c7c84468583c8f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

# 3. Wifi 및 SSH 설정

- 라즈비안 OS가 설치된 SD카드 폴더에서 설정
- 폴더 내에 텍스트 문서 2개 만들기
    - ssh.bin
    - 위 파일은 빈 파일로 둔다,
    - wpa_supplicant.conf
- wpa_supplicant.conf 파일에 다음과 같이 설정한다.

```
country=US
ctrl_interface=DIR=/var/run/wpa_supplicant GROUP=netdev
update_config=1

network={
	scan_ssid=1
	ssid="와이파이 ID"
	psk="와이파이 비밀번호"
}
```

- SD카드를 라즈베리파이에 넣는다.

# 4. 라즈베리파이 VNC 연결하는법

### 1. 모니터로 간단하게 연결

- 아래와 같이 GUI로 간단하게 설정할 수 있다.

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5498a917-b6dd-45b8-a53e-e7e042c7195e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220722%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220722T093709Z&X-Amz-Expires=86400&X-Amz-Signature=99d86b7999ce9238380086436735e732f80ad64c5f0d7bcd7f8d6c06f4090883&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 2. 모니터가 없는 경우

1. ip scanner로 와이파이가 연결된 라즈베리파이의 ip를 찾는다.
2. mobaxterm으로 라즈베리파이에 연결
3. raspi-config로 설정창 열기

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4421eb87-b37d-4e6e-9e15-385864ba8936/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220722%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220722T093723Z&X-Amz-Expires=86400&X-Amz-Signature=fe2767f01c5146194736747c993c4e510f873b7464e3a210640c17513f057017&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. interface option에서 설정 완료

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/897b6791-b861-4790-8561-0ae79e51044b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220722%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220722T093732Z&X-Amz-Expires=86400&X-Amz-Signature=d06994a04862f829f7f1b1061ea40f3dab033eed78c5616a8c475941b2a412ec&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)