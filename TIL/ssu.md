### TIL(Today I Learned)

#### 김혜수

# Nginx 설치 및 방화벽 설정

## Nginx 설치

### Nginx Repository 사용을 위한 구성 요소 설치

```bash
$ sudo apt install curl gnupg2 ca-certificates lsb-release ubuntu-keyring
```

### nginx 서명 키 가져오기

```bash
$ curl https://nginx.org/keys/nginx_signing.key | gpg --dearmor \
    | sudo tee /usr/share/keyrings/nginx-archive-keyring.gpg >/dev/null
```

- 다운로드한 파일에 적절한 키가 포함되어 있는지 확인

```bash
$ gpg --dry-run --quiet --import --import-options import-show /usr/share/keyrings/nginx-archive-keyring.gpg
```

- 출력 결과

```
pub   rsa2048 2011-08-19 [SC] [expires: 2024-06-14]
      573BFD6B3D8FBC641079A6ABABF5BD827BD9BF62
uid                      nginx signing key <signing-key@nginx.com>
```

### Nginx 안정 버전

- LTS Nginx 패키지에 대한 apt 저장소 설정

```bash
$ echo "deb [signed-by=/usr/share/keyrings/nginx-archive-keyring.gpg] \
http://nginx.org/packages/ubuntu `lsb_release -cs` nginx" \
    | sudo tee /etc/apt/sources.list.d/nginx.list
```

### Nginx Main line

- 안정 버전을 설치했다면 메인 라인은 설치하면 안된다.

```bash
$ echo "deb [signed-by=/usr/share/keyrings/nginx-archive-keyring.gpg] \
http://nginx.org/packages/mainline/ubuntu `lsb_release -cs` nginx" \
    | sudo tee /etc/apt/sources.list.d/nginx.list
```

### Nginx 패키지 저장소 고정

- 배포판에서 제공하는 패키지보다 Nginx Repository 패키지를 선호하도록 고정

```bash
$ echo -e "Package: *\nPin: origin nginx.org\nPin: release o=nginx\nPin-Priority: 900\n" \
    | sudo tee /etc/apt/preferences.d/99nginx
```

### Ubuntu(20.04) Nginx 최신 버전 설치

```bash
$ sudo apt install nginx
$ sudo apt install nginx-full
```

- 버전 확인

```bash
$ sudo nginx -v
```

## 2. 방화벽 설정

### 우분투 서버 방화벽 설정 iptables

- iptables-persistent 설치하기

```bash
$ sudo apt install iptables-persistent netfilter-persistent
```

- 설치 확인 명령어

```bash
$ dpkg -l | grep iptables-persistent
```

### 포트 개방하기

```bash
# 80번 포트 개방 http
$ sudo iptables -I INPUT 1 -p tcp --dport 80 -j ACCEPT
# 443번 포트 개방 https
$ sudo iptables -I INPUT 1 -p tcp --dport 443 -j ACCEPT
# 재부팅시에도 적용 되도록 저장
sudo netfilter-persistent save
# 리로드
sudo netfilter-persistent reload
```

### 개방된 포트 확인

```bash
$ sudo iptables -L
```

# Nginx 명령어

## Nginx 실행

```bash
$ service nginx start
$ sudo service nginx start
$ sudo systemctl start nginx
```

## Nginx 재실행

```bash
$ service nginx restart
$ sudo service nginx restart
$ sudo systemctl restart nginx
```

## Nginx 중단

```bash
$ service nginx stop
$ sudo service nginx stop
$ sudo systemctl stop nginx
```

## Nginx 상태보기

```bash
$ service nginx status
$ sudo service nginx status
$ ps -ef | grep nginx
```

# Nginx 완전 삭제

## 1. 완전 삭제

```bash
$ sudo apt-get remove nginx nginx-common # config files을 제외하고 삭제
$ sudo apt-get purge nginx nginx-common # 전체다 삭제
$ sudo apt-get autoremove #종속성 관련 페키지 삭제
$ sudo rm -rf /etc/nginx
```

## 2. 폴더를 잘못 삭제한 경우 재설치

```bash
$ sudo dpkg --force-confmiss -i /var/cache/apt/archives/nginx-common_*.deb
```
<br>

