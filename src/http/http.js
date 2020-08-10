import axios from 'axios'
// import qs from 'qs';// 引入qs模块，用来序列化post类型的数据
// import { baseUrl } from './env' // 导入环境
// import { message } from 'ant-design-vue';
import qs from 'qs'

/**
 * 提示函数
 * */
const tip = (msg) => {
  throw new Error(msg)
  // this.$message.info(msg);
}

/**
 * 请求失败后的错误统一处理
 * @param {Number} status 请求失败的状态码
*/
const errorHandle = (status, other) => {
  // 状态码判断
  switch (status) {
    // 401: 未登录状态，跳转登录页
    // case 401:
    //     toLogin();
    //     break;
    // 403 token过期
    // 清除token并跳转登录页
    // case 403:
    //     tip('登录过期，请重新登录');
    //     localStorage.removeItem('token');
    //     store.commit('loginSuccess', null);
    //     setTimeout(() => {
    //         toLogin();
    //     }, 1000);
    //     break;
    // 404请求不存在
    case 404:
      tip('请求的资源不存在')
      break
    default:
      throw new Error(other)
    // console.log(other);
  }
}

// 创建axios实例
// var instance = axios.create({ timeout: 1000 * 12 });
// // 设置post请求头
// instance.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
// 创建axios实例
const service = axios.create({
  baseURL: 'http://localhost:8080/', // api的base_url
  timeout: 30000,
  headers: {
    'Content-Type': 'application/x-www-form-urlencoded'
    // "Content-Type":"application/x-www-form-urlencoded;charset=utf-8"
  }
})

service.interceptors.request.use(
  // config => config,
  config => {
    config.data = qs.stringify(config.data) // 转为formdata数据格式
    return config
  },
  // {
  //   // 登录流程控制中，根据本地是否存在token判断用户的登录情况
  //   // 但是即使token存在，也有可能token是过期的，所以在每次的请求头中携带token
  //   // 后台根据携带的token判断用户的登录情况，并返回给我们对应的状态码
  //   // 而后我们可以在响应拦截器中，根据状态码进行一些统一的操作。
  //   // const token = store.state.token;
  //   // token && (config.headers.Authorization = token);
  //   return config;
  // },
  error => Promise.error(error))

// 响应拦截器
service.interceptors.response.use(
  // 请求成功
  res => (res.status === 200 ? Promise.resolve(res.data) : Promise.reject(res)),
  // 请求失败
  (error) => {
    const { response } = error
    if (response) {
      // 请求已发出，但是不在2xx的范围
      errorHandle(response.status, response.data.message)
      return Promise.reject(response)
    }
    return Promise.reject(error)
    // else {
    //   // 处理断网的情况
    //   // eg:请求超时或断网时，更新state的network状态
    //   // network状态在app.vue中控制着一个全局的断网提示组件的显示隐藏
    //   // 关于断网组件中的刷新重新获取数据，会在断网组件中说明
    //   if (!window.navigator.onLine) {
    //     //  store.commit('changeNetwork', false);
    //   } else {
    //     return Promise.reject(error);
    //   }
    // }
  })

export default service
