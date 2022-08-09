# <span style="background-color:#45a9c8;color:#f5f6f7">날다 ✈</span>

## SLOGAN: 당신의 여행에 <span style="color:#45a9c8">날</span>개를 달<span style="color:#45a9c8">다.</span>

# 1. TEAM NALDA👥

## FRONT-END🖥️

- 김정아
- 정형진

## BACK-END💽

- 김상현
- 박명규

## EMBEDDED🤖

- 김혜수
- 곽영후

# 2. 프로젝트 기획 및 설계📋

### 기획

해외 여행 후 돌아오는 길, 매번 세관신고서를 수기로 작성해야 하는 불편함이 있습니다. 이에 기내에서 IoT Device를 이용해 미리 세관신고서를 작성하고 제출할 수 있는 서비스를 제공하고, 이와 더불어 기내에서 필요한 다른 서비스들을 인포테인먼트적으로 제공하는 "날다" 를 기획했습니다.

### 요구사항 정의서는 아래 링크를 참고해주세요.

- [요구사항정의서](/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)

# 3. 디자인🎨

### 날다의 Main 로고입니다.

- [Logo1](/logo/1.png)
- [Logo2](/logo/2.png)
- [Logo3](/logo/3.png)
- [Logo4](/logo/4.png)

### 날다의 색상표입니다.

#### 기본 팔레트

- <span style="background-color:#45a9c8;color:white">nalda-background-blue: #45a9c8</span>
- <span style="background-color:#88c0c5;color:white">nalda-blue: #88c0c5</span>
- <span style="background-color:#206e95;color:white">nalda-navy: #206e95</span>
- <span style="background-color:#f5f6f7">nalda-background-white: #f5f6f7</span>

#### 보조 팔레트

- <span style="background-color:#dadada">nalda-grey: #dadada</span>
- <span style="background-color:#4e4e4e;color:white">icon-grey: #4e4e4e</span>

#### 알림 팔레트

- <span style="background-color:#85d3c4;color:white">lavatory-can-use: #85d3c4</span>
- <span style="background-color:#f8a392;color:white">lavatory-cannot-use: #f8a392</span>
- <span style="background-color:#FAC710;color:white">navs-on-click: #FAC710</span>

### 날다의 폰트입니다.

#### TwayFly

![twayfly](https://noonnucc-production.sfo2.cdn.digitaloceanspaces.com/noonnu7109c68d82ab78bdaf7b37b3fb82c3e41641514318)

### 날다가 사용하는 아이콘입니다.

#### Material Design Icon

![Material Design Icon](https://lh3.googleusercontent.com/64GWPJbpSJKB2hejLK02GLHjflv2B8cCr7SJUQI7cHXO0Qakc28U-ZRw7IRL3WadD8Stugb1HB4GgpqEkRydsEaR9AC4SqrTeRlCDlo=w1064-v0)

## 4. 컨밴션

### 1. Commit Convention

- `feat` : 새로운 기능 추가
  - ex) [Jira issue number] feat : domain create
- `fix` : 버그 수정
- `docs` : 문서 수정
- `style` : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
- `refactor` : 코드 리펙토링
- `test` : 테스트 코드, 리펙토링 테스트 코드 추가
- `chore` : 빌드 업무 수정, 패키지 매니저 수정

### 2. Naming Convention

#### **BE**

- 변수명 : **camelCase**
  - 카멜케이스
- 클래스명 : **PascalCase**
  - 카멜케이스 & 첫글자 대문자

#### **DB**

- column: **snake_case**
  - 소문자&스네이크케이스

#### **FE**

- 파일명: 소문자
- CSS : **kebab-case**
  - 케밥케이스
- Vuex Store:
  - Store file: camelCase
  - store 구조
