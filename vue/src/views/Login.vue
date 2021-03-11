<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In:</h1>
      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >
        Thank you for registering, please sign in.
      </div>
      <label for="username" class="sr-only">Username</label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <router-link :to="{ name: 'register' }">Create New Account</router-link>
      <button class="btn" type="submit">
        Sign in
      </button>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>

<style scoped>

.form-signin {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  margin: 0 auto;
  color: #0072ce;
}

h1{
  padding: 12px;
  margin: auto;
}

.text-center .sr-only {
  border: 0px;
  font-weight: bold;
  color: #0072ce;
  width: 240;
  height: 10px;
padding: 0px 0px 0px 0px;
  margin: 10px;
}

input.form-control {
  border: 1px solid black;
  border-radius: 8px;
  width: 240;
  height: 40px;
  margin: 20px;
}
router-link {
  border: 1px solid black;
  border-radius: 8px;
  width: 240;
  height: 40px;
  padding: 20px 0px 0px 0px;
  margin: 20px;
}

.btn {
  padding: 10px 20px;
  max-width: 200px;
  border: 10px solid #fff;
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}
</style>
