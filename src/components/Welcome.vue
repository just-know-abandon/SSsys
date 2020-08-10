<template>
  <div class="big">
    <div class="huanying">欢迎进入广东科技学院宿舍管理系统<span> (南苑3栋)</span></div>
    <el-row :gutter="0">
      <el-col :span="16">
        <div class="leftcon">
          <div class="h"></div>
          <el-row class="little-elrow" :gutter="0">
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">本栋学生人数</div>
                <div class="li-two">{{xueshenglist}}</div>
              </div>
            </el-col>
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">楼层</div>
                <div class="li-two">{{louceng}}</div>
              </div>
            </el-col>
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">总宿舍数</div>
                <div class="li-two">{{sushelist}}</div>
              </div>
            </el-col>
          </el-row>
          <el-row class="little-elrow" :gutter="0">
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">物品遗失</div>
                <div class="li-two">{{shiwulist}}</div>
              </div>
            </el-col>
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">晚归人数</div>
                <div class="li-two">{{wanguilist}}</div>
              </div>
            </el-col>
            <el-col :span="7">
              <div class="grid-content bg-purple">
                <div class="li-one">报修统计</div>
                <div class="li-two">{{baoxiulist}}</div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-col>
      <el-col :span="8">
        <el-calendar class="rili" v-model="value"></el-calendar>
      </el-col>
    </el-row>
    <div class="footer">宿管办公室电话：88899999</div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      louceng: '8',
      xueshenglist: '',
      sushelist: '',
      shiwulist: '',
      wanguilist: '',
      baoxiulist: '',
      value: new Date()
    }
  },
  created () {
    this.getData()
  },
  methods: {
    getData () {
      this.$api.QueryDataService().then(res => {
        console.log(res)
        // console.log(res.data[0].baoxiulist)
        this.xueshenglist = res.data[0].xueshenglist
        this.sushelist = res.data[0].sushelist
        this.shiwulist = res.data[0].shiwulist
        this.wanguilist = res.data[0].wanguilist
        this.baoxiulist = res.data[0].baoxiulist
      })
    }
  }
}
</script>

<style lang="less" scoped>
.big{
  min-height: 86vh;
  // padding-bottom: 30px;
  background-color: white;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px;
  border-bottom-left-radius: 40px;
  border-bottom-right-radius: 40px;
}
.leftcon{
  height: 622px;
  // background-color: skyblue;
}
.huanying{
  text-align: center;
  font-size: 40px;
  line-height: 100px;
  width: 100%;
  height: 100px;
  span{
    font-size: 20px;
  }
}
.h{
  width: 100%;
  height: 170px;
  background: url('../assets/sushelou.jpg') no-repeat;
  background-size: 100% 100%;
  margin-bottom: 20px;
}
.little-elrow{
  .el-col{
    border: 1px solid pink;
    margin-left: 35px;
    margin-top: 15px;
  }
}
.el-row {
  // background-color: yellow;
  // margin: 0 20px;
  &:last-child {
    margin-bottom: 0;
  }
}
.el-col {
  padding: 0 !important;
  border-radius: 4px;
  // margin: 5px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background:white;
}
.bg-purple-light {
  background: white;
}
.grid-content {
  border-radius: 4px;
  min-height: 200px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
.li-one{
  width: 100%;
  height: 60px;
  border-bottom: 1px solid pink;
  line-height: 60px;
  text-align: center;
  font-size: 24px;
}
.li-two{
  font-size: 50px;
  text-align: center;
  margin-top: 30px;
}
.footer{
  float: right;
  display: block;
  width: 300px;
  text-align: center;
  font-size: 18px;
}
</style>
