<template>
  <el-container class="home-container">
    <!-- 头部区域 -->
    <el-header height="80px">
      <div>
        <img src="../assets/xiaobiao.jpg" alt="" @click="towelcome">
        <span>广东科技学院宿舍管理系统</span>
      </div>
      <el-button type="info" @click="logout">退出</el-button>
    </el-header>
    <!-- 页面主题区域 -->
    <el-container>
      <!-- 侧边栏 -->
      <el-aside :width="isCollapse ? '64px' : '200px'">
        <div class="tpggle-button" @click="toggleCollapse">{{anniu}}</div>
        <el-menu background-color="#333744" text-color="#fff"
          active-text-color="#409EFF" unique-opened
          :collapse="isCollapse" :collapse-transition="false" router
          :default-active="activePath">
          <!-- 一级菜单 -->
          <el-submenu :index="item.id + ''" v-for="item in menulist" :key="item.id">
            <!-- 一级菜单的模板区域 -->
            <template slot="title">
              <!-- 图标 -->
              <i :class="iconsObj[item.id]"></i>
              <!-- 文本 -->
              <span>{{item.authName}}</span>
            </template>
            <!-- 二级菜单 -->
            <el-menu-item :index="'/' + subItem.path" v-for="subItem in item.children"
              :key="subItem.id" @click="saveNavState('/' + subItem.path)">
              <!-- 二级菜单的模板区域 -->
              <template slot="title">
              <!-- 图标 -->
              <i class="el-icon-menu"></i>
              <!-- 文本 -->
              <span>{{subItem.authName}}</span>
            </template>
            </el-menu-item>
          </el-submenu>
    </el-menu>
      </el-aside>
      <!-- 右侧内容主体 -->
      <el-main>
        <!-- 路由占位符 -->
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
  data () {
    return {
      anniu: '|||',
      menulist: [
        {
          id: 111,
          authName: '首页',
          children: [
            { id: 100, authName: '首页', path: 'welcome' }
          ]
        },
        {
          id: 1,
          authName: '宿舍信息',
          children: [
            { id: 101, authName: '宿舍列表', path: 'sushelist' },
            { id: 102, authName: '学生列表', path: 'xueshenglist' }
          ]
        },
        {
          id: 2,
          authName: '宿舍管理',
          children: [
            { id: 201, authName: '失物登记', path: 'shiwulist' },
            { id: 202, authName: '晚归登记', path: 'wanguilist' },
            { id: 203, authName: '报修登记', path: 'baoxiulist' }
          ]
        }
      ],
      iconsObj: {
        1: 'iconfont icon-user',
        2: 'iconfont icon-tijikongjian',
        3: 'iconfont icon-shangpin',
        4: 'iconfont icon-danju',
        5: 'iconfont icon-baobiao',
        111: 'el-icon-menu'
      },
      isCollapse: false,
      // 被激活的连接地址
      activePath: ''
    }
  },
  created () {
    // this.getMenuList()
    this.activePath = window.sessionStorage.getItem('activePath')
  },
  methods: {
    towelcome () {
      this.$router.push('/welcome')
    },
    logout () {
      this.$message({
        message: '退出登录',
        duration: 2000
      })
      this.$router.push('/login')
    },
    // 点击按钮，切换菜单的折叠与展开
    toggleCollapse () {
      this.isCollapse = !this.isCollapse
    },
    // 保存连接的激活状态
    saveNavState (activePath) {
      window.sessionStorage.setItem('activePath', activePath)
      this.activePath = activePath
    }
  }
}
</script>

<style lang="less" scoped>
.home-container{
  height: 100%;
}
.el-header{
  background-color: #373d41;
  display: flex;
  justify-content: space-between;
  padding-left: 50 !important;
  align-items: center;
  color: #fff;
  font-size: 24px;
  div{
    display: flex;
    align-items: center;
    span{
      margin-left: 15px;
    }
    img{
      display: block;
      width: 60px;
      height: 60px;
      border-radius: 50%;
    }
  }
}
.el-aside{
  background-color: #333744;
  .el-menu{
    border-right: none;
  }
}
.el-main{
  background-color: #EAEDF1;
}
.iconfont{
  margin-right: 10px;
}
.tpggle-button{
  background-color: #4A5064;
  font-size: 10px;
  line-height: 24px;
  color: #fff;
  text-align: center;
  letter-spacing: 0.2em;
  cursor: pointer;
}
</style>
