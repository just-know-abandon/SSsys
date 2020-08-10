import Vue from 'vue'
import Router from 'vue-router'
import Login from '../components/Login.vue'
import Home from '../components/Home.vue'
import Welcome from '../components/Welcome.vue'
import XueshengList from '../components/sushe/XueshengList.vue'
import SusheList from '../components/sushe/SusheList.vue'
import Shiwu from '../components/guanli/Shiwu.vue'
import Wangui from '../components/guanli/Wangui.vue'
import Baoxiu from '../components/guanli/Baoxiu.vue'

Vue.use(Router)

const router = new Router({
  routes: [
    { path: '/', redirect: '/login' },
    { path: '/login', component: Login },
    {
      path: '/home',
      component: Home,
      redirect: '/welcome',
      children: [
        { path: '/welcome', component: Welcome },
        { path: '/sushelist', component: SusheList },
        { path: '/xueshenglist', component: XueshengList },
        { path: '/shiwulist', component: Shiwu },
        { path: '/baoxiulist', component: Baoxiu },
        { path: '/wanguilist', component: Wangui }
      ]
    }
  ]
})

export default router
