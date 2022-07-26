# <span style="background-color:#45a9c8;color:#f5f6f7">날다  ✈</span>

당신의 여행에 <span style="color:#45a9c8">날</span>개를 달<span style="color:#45a9c8">다.</span> 

## 1. TEAM NALDA👥

### FRONT-END🖥️
- 김정아
- 정형진
### BACK-END💽
- 김상현
- 박명규
### EMBEDDED🤖
- 김혜수
- 곽영후

## 2. 프로젝트 기획 및 설계📋

### 기획

외국에서 다녀온 후 돌아오는 길, 세관신고서를 매번 수기로 작성해야 하는 불편함이 있습니다. 이에 기내에서 미리 세관신고서를 작성할 수 있는 서비스를 제공하고, 이와 더불어 기내에서 필요한 다른 서비스들을 제공하는 "날다" 를 기획했습니다.

### 요구사항 정의서
- [요구사항정의서](/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)

## 3. 디자인🎨

### 로고
- [Logo1](/logo/1.png)
- [Logo2](/logo/2.png)
- [Logo3](/logo/3.png)
- [Logo4](/logo/4.png)

### 색상
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

### 폰트
#### TwayFly
![twayfly](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ff1bc795-4c5c-4b53-8451-b2ca15a6e1d1/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220726%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220726T020125Z&X-Amz-Expires=86400&X-Amz-Signature=3f94db7232eb7f1dc32fe2bfc9ffb94c1ea6f3923a6af587932565d654b2c650&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 아이콘
#### Material Design Icon
![Material Design Icon](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/955a0d81-c567-4a6e-850e-36ecbbd02262/google-material-icons.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220726%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220726T020400Z&X-Amz-Expires=86400&X-Amz-Signature=02daccfde9af06c4963df7329abc732cfc39205b56fae49228d32ff2fe538c49&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22google-material-icons.png%22&x-id=GetObject)

## 4. Our Convention
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

        ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/107f0c4b-d465-46d9-a8aa-afbc99635c6a/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220726%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220726T020731Z&X-Amz-Expires=86400&X-Amz-Signature=8ad76db16031b54a11a7a6b9c0eb95048e3803e6571956e5b1524eb8c2f24e6f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
        
    - mutation: LIKE_THIS
        - LIKE_THIS_BABE
    - state / getter / mutation 각 1씩 만들어
        - getter: 원하는 모양 가공시 사용
    - store 폴더에 하위 단위로 묶어서 분리
