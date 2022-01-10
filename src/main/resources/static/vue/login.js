export default {    
    template: 
  `
  <div class="protected" v-if="loginSuccess">
          <h1>
              <p>보안 사이트에 대한 액세스가 허용되었습니다</p>
          </h1>
          <h5>로그인 성공!</h5>
      </div>
      <div class="unprotected" v-else-if="loginError">
          <h1>
              <p>이 페이지에 대한 접근 권한이 없습니다.</p>
          </h1>
          <h5>로그인 실패!</h5>
      </div>
      <div class="unprotected" v-else>



    <div class="wrapper">
        <div class="container">
            <h1>Welcome To m.. Sdfsd</h1>
            
            <form @submit.prevent="login()" name="form" class="form" > 
                <input type="text" name="username" placeholder="Username" v-model="user">
                <input type="password" name="password" placeholder="Password" v-model="password">
                <button type="submit" id="login-button">Login</button>
            </form>
        </div>
        
        <ul class="bg-bubbles">	
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div> 


    </div> 
  `,
  name: 'login',
  data() {
      return {
          loginSuccess: false,
          loginError: false,
          user: 'admin',
          password: '1234',
          error: false
      }
  },
  methods: {
      async login() {
          try {
              const result = await axios.get('/em', {
                  auth: {
                      username: this.user,
                      password: this.password
                  }
              });
              if (result.status === 200) {
                  this.loginSuccess = true
              }
          } catch (err) {
              this.loginError = true;
              throw new Error(err)
          }
      }
  }
}