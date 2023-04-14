const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
      // eslint-disable-next-line no-mixed-spaces-and-tabs
	  port: 3001,
      // eslint-disable-next-line no-mixed-spaces-and-tabs
	  open: true
  }
})
