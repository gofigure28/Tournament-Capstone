
<template>
    <div class="dropdown">
      <input
        v-if="Object.keys(selected.Item).length === 0"
        ref="dropdowninput"
        v-model.trim="inputValue"
        class="dropdown-input"
        type="text"
        placeholder="Select Player"
      />
      <div v-else @click="resetSelection" class="dropdown-selected">
        {{ selectedItem.name }}
      </div>
      <div
        v-show="inputValue && apiLoaded"
        v-for="item in userList"
        :key="item.name"
        class="dropdown-list"
      >
        {{ item.name }}
      </div>
    </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      inputValue: "",
      userList: [],
      apiLoaded: false,
      apiUrl: "http://localhost:8080/all-users",
      selectedItem: {},
    };
  },
  mounted() {
    this.getList();
  },
  methods: {
    getList() {
      axios.get(this.apiUrl).then((response) => {
        this.userList = response.data;
        this.apiLoaded = true;
      });
    },
    itemVisible(item) {
      let currentName = item.username.toLowerCase();
      let currentInput = this.inputValue.toLowerCase();
      return currentName.includes(currentInput);
    },
    addPlayer() {
      this.$store.commit("SET_USER", this.user);
      this.userList = {
        users: "",
      };
      this.$router.push({ path: "createTeam" });
    },
    createTeam() {
      {
        teamID: Number(this.$route.params.teamID);
        teamName: this.teamname.title;
        teamList: this.userList.users;
      }
    },
    selectItem(theItem) {
      this.selectedItem = theItem;
      this.inputValue = "";
      this.$emit("on-item-sleected", theItem);
    },
    resetSelection() {
      this.selectedItem = {};
      this.$nextTick ( () => this.$refs.dropdowninput.focus() );
      this.$emit('on-item-reset');
    }
  },
};
</script>

<style>
.dropdown {
  position: relative;
  width: 100%;
  max-width: 400px;
  margin: 0 auto;
  border-radius: 8px;
}
.dropdown-input,
.dropdown-selected {
  width: 100%;
  padding: 10px 16px;
  border: 1px solid transparent;
  background: #edf2f7;
  line-height: 1.5em;
  outline: none;
  border-radius: 8px;
}
.dropdown-input:focus,
.dropdown-selected:hover {
  background: #fff;
  border-color: #e2e8f0;
}
.dropdown-input::placeholder {
  opacity: 0.7;
}
.dropdown-selected {
  font-weight: bold;
  cursor: pointer;
}
.dropdown-list {
  position: absolute;
  width: 100%;
  max-height: 500px;
  margin-top: 4px;
  overflow-y: auto;
  background: #ffffff;
  box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1),
    0 4px 6px -2px rgba(0, 0, 0, 0.05);
  border-radius: 8px;
}
.dropdown-item {
  display: flex;
  width: 100%;
  padding: 11px 16px;
  cursor: pointer;
}
.dropdown-item:hover {
  background: #0072ce;
}

.button {
  width: 80px;
  padding: 10px 0px 10px 0px;
  margin: 20px;
  border: 1px solid #ddd;
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}
</style>
