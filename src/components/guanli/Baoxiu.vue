<template>
  <div>
    <!-- 面包屑 -->
    <el-breadcrumb separator-class="el-icon-arrow-right">
      <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item>
      <el-breadcrumb-item>宿舍管理</el-breadcrumb-item>
      <el-breadcrumb-item>报修登记</el-breadcrumb-item>
    </el-breadcrumb>
    <!-- Card卡片 -->
    <el-card>
      <!-- 搜索与添加区域 -->
      <el-row :gutter="20">
        <el-col :span="8">
          <el-input clearable placeholder="请输入内容" v-model="queryInfo.query" v-on:input="returndata">
             <!-- //@click="hetUserList"  直接调用接口更新数据实现搜索 -->
            <el-button slot="append" icon="el-icon-search" @click="search"></el-button>
          </el-input>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="addDialogVisible = true">报修登记</el-button>
        </el-col>
      </el-row>
      <!-- 用户列表区域(表格) -->
      <el-table :data="tableData" border stripe>
        <el-table-column type="index" label="#"></el-table-column>
        <el-table-column prop="sushehao" label="宿舍号"></el-table-column>
        <el-table-column prop="baoxiu" label="报修信息"></el-table-column>
        <el-table-column prop="address" label="操作">
          <template slot-scope="scope">
            <!-- {{scope.row}} -->
            <!-- 修改按钮 -->
            <el-tooltip :enterable="false" effect="dark" content="编辑" placement="top">
              <el-button @click="showEditDialog(scope.row)" type="primary" icon="el-icon-edit" size="mini"></el-button>
            </el-tooltip>
            <!-- 删除按钮 -->
            <el-tooltip :enterable="false" effect="dark" content="删除角色" placement="top">
              <el-button @click="removeUserById(scope.row.id)" type="danger" icon="el-icon-delete" size="mini"></el-button>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
      <!-- 分页区域 -->
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="queryInfo.pagenum"
        :page-sizes="[1, 2, 5]"
        :page-size="queryInfo.pagesize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total">
      </el-pagination>
    </el-card>
    <!-- 添加用户的对话框 -->
    <el-dialog
      title="报修登记信息"
      :visible.sync="addDialogVisible"
      width="50%"
      @close="addDialogClosed">
      <!-- 内容主体区域 -->
      <!-- addForm数据表单 addFormRules表单验证 addFormRef引用 -->
      <el-form
      :model="addForm"
      :rules="addFormRules"
      ref="addFormRef"
      label-width="100px">
        <el-form-item label="宿舍号" prop="sushehao">
          <el-input v-model="addForm.sushehao"></el-input>
        </el-form-item>
        <el-form-item label="报修信息" prop="baoxiu">
          <el-input v-model="addForm.baoxiu"></el-input>
        </el-form-item>
      </el-form>
      <!-- 底部区域 -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="addDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addUser">确 定</el-button>
      </span>
    </el-dialog>
    <!-- 修改用户的对话框 -->
    <el-dialog
      title="修改报修信息"
      :visible.sync="editDialogVisible"
      width="50%"
      @close="editDialogClosed">
      <el-form
      :model="editForm"
      :rules="editFormRules"
      ref="editFormRef"
      label-width="100px">
        <el-form-item label="宿舍号" prop="sushehao">
          <el-input v-model="editForm.sushehao"></el-input>
        </el-form-item>
        <el-form-item label="报修信息" prop="baoxiu">
          <el-input v-model="editForm.baoxiu"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="editDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="editUserInfo">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data () {
    return {
      // 获取用户列表的参数对象
      queryInfo: {
        query: '',
        // 当前的页数
        pagenum: 1,
        pagesize: 1
      },
      total: 6,
      // 控制添加用户对话框的显示与隐藏
      addDialogVisible: false,
      // 添加用户的表单数据
      addForm: {
        id: '',
        sushehao: '',
        baoxiu: ''
      },
      // 添加表单的验证规则对象
      addFormRules: {
        sushehao: [
          { required: true, message: '请输入宿舍号', trigger: 'blur' },
          { min: 3, max: 3, message: '长度在 3 个字符', trigger: 'blur' }
        ],
        baoxiu: [
          { required: true, message: '请输入报修信息', trigger: 'blur' },
          { min: 2, max: 100, message: '长度在 2 到 100 个字符', trigger: 'blur' }
        ]
      },
      // 控制修改用户对话框的显示与隐藏
      editDialogVisible: false,
      // 查询到的用户信息对象
      editForm: {
        id: '',
        sushehao: '',
        baoxiu: ''
      },
      // 修改表单验证规则
      editFormRules: {
        sushehao: [
          { required: true, message: '请输入宿舍号', trigger: 'blur' },
          { min: 3, max: 3, message: '长度在 3 个字符', trigger: 'blur' }
        ],
        baoxiu: [
          { required: true, message: '请输入报修信息', trigger: 'blur' },
          { min: 2, max: 100, message: '长度在 2 到 100 个字符', trigger: 'blur' }
        ]
      },
      // 表单数据
      tableData: []
    }
  },
  created () {
    this.getData()
  },
  methods: {
    getData () {
      this.$api.QueryBaoxiulistService().then(res => {
        console.log(res)
        if (res.code === 200) {
          const _table = []
          res.data.forEach(item => {
            const tableitem = {
              id: item.baoxiulistId,
              sushehao: item.baoxiulistSushehao,
              baoxiu: item.baoxiulistxiuxinxi
            }
            _table.push(tableitem)
          })
          this.tableData = _table
        }
      })
    },
    // 鉴听 pagesize 改变的事件
    handleSizeChange (newSize) {
      console.log(newSize)
      this.queryInfo.pagesize = newSize
      // 调用接口更新
    },
    // 鉴听 pagenum 改变的事件
    handleCurrentChange (newPage) {
      console.log(newPage)
      this.queryInfo.pagenum = newPage
      // 调用接口更新
    },
    // 监听添加用户对话框的关闭事件
    addDialogClosed () {
      this.$refs.addFormRef.resetFields()
    },
    // 点击按钮添加新用户
    addUser () {
      this.$api.InsertBaoxiulistService({
        baoxiulistId: this.addForm.id,
        baoxiulistSushehao: this.addForm.sushehao,
        baoxiulistxiuxinxi: this.addForm.baoxiu
      }).then(res => {
        console.log(res)
        if (res.code !== 200) {
          return this.$message.error('添加用户信息失败')
        }
        // 关闭对话框
        this.addDialogVisible = false
        // 刷新数据列表
        this.getData()
        // 提示修改成功
        this.$message.success('添加用户信息成功！')
      })
    },
    // 展示编辑用户的对话框  async
    showEditDialog (data) {
      // const { data: res } = await this.$http.get('users/' + id)
      // if (res.meta.status !== 200) {
      //   return this.$message.error('修改用户信息失败')
      // }
      // this.editForm = res.data
      // this.$message.success('修改用户信息成功！')
      console.log(data)
      Object.assign(this.editForm, data)
      this.editDialogVisible = true
    },
    // 监听修改用户对话框的关闭事件
    editDialogClosed () {
      this.$refs.editFormRef.resetFields()
    },
    // 修改用户信息并提交
    editUserInfo (id) {
      this.$api.UpdateBaoxiulistService({
        baoxiulistId: this.editForm.id,
        baoxiulistxiuxinxi: this.editForm.baoxiu,
        baoxiulistSushehao: this.editForm.sushehao
      }).then(res => {
        console.log(res)
        if (res.code !== 200) {
          return this.$message.error('修改用户信息失败')
        }
        // 关闭对话框
        this.editDialogVisible = false
        // 刷新数据列表
        this.getData()
        // 提示修改成功
        this.$message.success('修改用户信息成功！')
      })
    },
    // 根据id删除对应的用户信息
    async removeUserById (id) {
      console.log(id)
      // 弹框询问用户是否删除数据
      const confirmResult = await this.$confirm('此操作将永久删除该用户, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).catch(err => err)
      // .catch(err => {
      //   return err
      // })     如果只有一行代码可以简写成.catch(err => err)
      // 因为返回值为Promise 可以使用async/await进行优化
      // 如果用户点击确认，则返回值为字符串 confirm
      // 如果用户点击取消，则返回值为字符串 cancel
      console.log(confirmResult)
      if (confirmResult !== 'confirm') {
        return this.$message.info('已取消删除')
      } else {
        this.$api.DeleteBaoxiulistService({
          baoxiulistId: id
        }).then(res => {
          console.log(res)
          if (res.code !== 200) {
            return this.$message.error('删除用户失败')
          }
          this.$message.success('删除用户成功')
          this.getData()
        })
      }
    },
    search () {
      this.$api.QueryLikeBaoxiulistService({
        QueryValue: this.queryInfo.query
      }).then(res => {
        console.log(res)
        if (res.code === 200) {
          const _table = []
          res.data.forEach(item => {
            const tableitem = {
              id: item.baoxiulistId,
              sushehao: item.baoxiulistSushehao,
              baoxiu: item.baoxiulistxiuxinxi
            }
            _table.push(tableitem)
          })
          this.tableData = _table
          if (res.data.length === 0) {
            this.getData()
          }
        }
      })
      // console.log(this.queryInfo.query)
    },
    returndata () {
      if (this.queryInfo.query === '') {
        this.getData()
      }
    }
  }
}
</script>

<style lang="less" scoped>
</style>
