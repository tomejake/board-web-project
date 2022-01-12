<template>
  <body>
    <div id="wrap">
          <div id="header"></div>
          <div id="nav"></div>
          <div id="left"></div>
          <div id="contents"></div>
          <div id="right"></div>
          <div id="footer"></div>
      </div>
  </body>
</template>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
 * {
        margin: 0; padding: 0;
    }
    body {
        background-color: #fff;
    }
    #wrap {
        width: 500px;
        margin: 0 auto;
    }
    #header {
        width: 500px;
        height: 50px;
        background-color: #222;
    }
    #nav {
        width: 500px;
        height: 30px;
        background-color: #333;
    }
    #left {
        width: 50px;
        height: 300px;
        background-color: #777;
        float: left;
    }
    #contents {
        width: 400px;
        height: 300px;
        background-color: #555;
        float: left;
    }
    #right {
        width: 50px;
        height: 300px;
        background-color: #777;
        float: left;
    }
    #footer {
        width: 500px;
        height: 50px;
        background-color: #666;
        clear: both;
    }
</style>
