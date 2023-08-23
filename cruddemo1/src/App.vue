<template>
  <div id="app">
    <nav class="large-nav">
      <a class="nav-link" id="home"><router-link to="/" class="nav-link" exact>Home</router-link></a>
      <a class="nav-link" id="about"><router-link to="/about" class="nav-link">About</router-link></a>
      <a class="nav-link" id="hdk"><router-link to="hdk" class="nav-link">Hdk</router-link></a>
    </nav>
    <router-view/>
  </div>
</template>

<style lang="stylus">
#app
  font-family Avenir, Helvetica, Arial, sans-serif
  -webkit-font-smoothing antialiased
  -moz-osx-font-smoothing grayscale
  text-align center
  margin-top 60px


  .large-nav
    background-color #447cc4
    padding 0px 0
  .nav-link
    font-size 34px
    text-decoration none
    color white
    margin 0 5px
    transition color 0.3s ease-in-out

    //hovering
  //.nav-link:hover,
  .nav-link:hover,
  .router-link-active
    background-color #5c94e4
    color black
</style>
