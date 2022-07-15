<template>
  <div class="signup">
    <body style="background-color: #f5f6f7">
      <div class="wrapper">
        <div class="title">
          <h1 style="color: #4e4e4e">회원가입</h1>
        </div>

        <div class="name">
          <h3>성명</h3>
          <input type="text" placeholder="first name" />
          <input type="text" placeholder="middle name" />
          <input type="text" placeholder="last name" />
        </div>

        <div class="email">
          <h3>이메일</h3>
          <input id="email" type="text" placeholder="이메일을 입력해 주세요." />
          @
          <input id="email" type="text" placeholder="이메일을 입력해 주세요." />
          <select id="pet-select" name="pets">
            <option value="">직접 입력</option>
            <option value="dog">Dog</option>
            <option value="cat">Cat</option>
            <option value="hamster">Hamster</option>
          </select>
        </div>

        <div id="birthday">
          <h3>생년월일</h3>
          <select id="year-select" name="years">
            <option value="">YY</option>
            <option value="">2020</option>
            <option value="">2019</option>
            <option value="">2018</option>
          </select>
          <select id="month-select" name="months">
            <option value="">MM</option>
            <option value="">01</option>
            <option value="">02</option>
            <option value="">03</option>
          </select>
          <select id="day-select" name="days">
            <option value="">DD</option>
            <option value="">01</option>
            <option value="">02</option>
            <option value="">03</option>
          </select>
        </div>

        <div id="phone-number">
          <h3>전화번호</h3>

          <input type="text" />
          -
          <input type="text" />
          -
          <input type="text" />
        </div>

        <div id="address">
          <h3>주소</h3>
          <input type="text" />
          <button>주소검색</button>
        </div>
        <div>
          <input type="text" />
        </div>
        <div>
          <input type="text" />
        </div>

        <div id="userid">
          <h3>아이디</h3>
          <input type="text" />
          <button>중복확인</button>
        </div>

        <div>
          <h3>비밀번호</h3>
          <input type="text" />
        </div>

        <div>
          <h3>비밀번호 확인</h3>
          <input type="text" />
        </div>

        <div>
          <h3>직업</h3>
          <select id="job-select" name="jobs">
            <option value="">선택</option>
            <option value="">학생</option>
            <option value="">02</option>
            <option value="">03</option>
          </select>
        </div>
      </div>

      <div class="signup-button">
        <button type="submit">Sign in</button>
      </div>
    </body>
  </div>
</template>

<script>
export default {
  name: 'SignUp',
}
</script>

<style>
.signup {
  display: flex;
  justify-content: center;
}
.signup-button {
  text-align: right;
}
.title {
  text-align: center;
}

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --naver-green-color: #206e95;
  --naver-green-border-color: #88c0c5;
}

h3 {
  color: #4e4e4e;
}

button {
  border: 1px solid skyblue;
  background-color: rgba(0, 0, 0, 0);
  color: skyblue;
  padding: 5px;
  border-top-left-radius: 5px;
  border-top-right-radius: 5px;
  border-bottom-left-radius: 5px;
  border-bottom-right-radius: 5px;
}
button:hover {
  color: white;
  background-color: skyblue;
}
</style>
