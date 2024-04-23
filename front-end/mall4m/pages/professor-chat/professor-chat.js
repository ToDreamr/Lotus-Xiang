Page({
  data: {
    inputValue: '', // 输入框的值
    messages: [], // 消息列表
    scrollIntoView: '', // 滚动视图到指定位置
  },
  onLoad: function () {
    // 初始化消息列表
    this.setData({
      messages: [
        '请问有什么农业技术问题我可以帮助您呢？'
      ]
    })
     // 连接 WebSocket
     this.socket = wx.connectSocket({
      url: 'wss://127.0.0.1:7902/chat'
    })
 
    // 监听 WebSocket 打开事件
    this.socket.onOpen(() => {
      console.log('WebSocket 已连接')
    })
 
    // 监听 WebSocket 接收消息事件
    this.socket.onMessage((res) => {
      const { data } = res
      this.setData({
        messages: [...this.data.messages, data]
      })
    })
  },
  onInput: function (e) {
    // 监听输入框的变化
    this.setData({
      inputValue: e.detail.value
    })
  },
  onSend: function () {
    // 发送消息
    const { inputValue, messages } = this.data
    if (inputValue.trim() !== '') {
      messages.push(inputValue)
      this.setData({
        messages,
        inputValue: '',
        scrollIntoView: `message-${messages.length - 1}`
      })
    }
      // 发送消息到 WebSocket 服务器
      this.socket.send({
        data: inputValue
      })
  },
    onUnload: function () {
      // 关闭 WebSocket 连接
      this.socket.close()
    },
})