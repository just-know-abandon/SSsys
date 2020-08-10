import api from './http.js'
const system = {
  // 首页
  QueryDataService (data) {
    return api.post('api/QueryDataService', data)
  },
  // 晚归列表
  QueryWanguilistService (data) {
    return api.post('api/QueryWanguilistService', data)
  },
  // 晚归添加
  InsertWangguilistService (data) {
    return api.post('api/InsertWangguilistService', data)
  },
  // 晚归修改
  UpdateWanguilistService (data) {
    return api.post('api/UpdateWanguilistService', data)
  },
  // 晚归删除
  DeleteWanguilistService (data) {
    return api.post('api/DeleteWanguilistService', data)
  },
  // 晚归模糊搜索
  QueryLikeWanguilistService (data) {
    return api.post('api/QueryLikeWanguilistService', data)
  },
  // 报修列表
  QueryBaoxiulistService (data) {
    return api.post('api/QueryBaoxiulistService', data)
  },
  // 报修添加
  InsertBaoxiulistService (data) {
    return api.post('api/InsertBaoxiulistService', data)
  },
  // 报修修改
  UpdateBaoxiulistService (data) {
    return api.post('api/UpdateBaoxiulistService', data)
  },
  // 报修删除
  DeleteBaoxiulistService (data) {
    return api.post('api/DeleteBaoxiulistService', data)
  },
  // 报修模糊查询
  QueryLikeBaoxiulistService (data) {
    return api.post('api/QueryLikeBaoxiulistService', data)
  },
  // 失物列表
  QueryShiwulistService (data) {
    return api.post('api/QueryShiwulistService', data)
  },
  // 失物添加
  InsertShiwulistService (data) {
    return api.post('api/InsertShiwulistService', data)
  },
  // 失物修改
  UpdateShiwulistService (data) {
    return api.post('api/UpdateShiwulistService', data)
  },
  // 失物修改
  DeleteShiwulistService (data) {
    return api.post('api/DeleteShiwulistService', data)
  },
  // 失物模糊查询
  QueryLikeShiwulistService (data) {
    return api.post('api/QueryLikeShiwulistService', data)
  },
  // 学生列表
  QueryXueshenglistService (data) {
    return api.post('api/QueryXueshenglistService', data)
  },
  // 学生添加
  InsertXueshenglistService (data) {
    return api.post('api/InsertXueshenglistService', data)
  },
  // 学生修改
  UpdateXueshenglistService (data) {
    return api.post('api/UpdateXueshenglistService', data)
  },
  // 学生修改
  DeleteXueshenglistService (data) {
    return api.post('api/DeleteXueshenglistService', data)
  },
  // 学生模糊查询
  QueryLikeXueshenglistService (data) {
    return api.post('api/QueryLikeXueshenglistService', data)
  },
  // 宿舍列表
  QuerySushelistService (data) {
    return api.post('api/QuerySushelistService', data)
  },
  // 宿舍添加
  InsertSushelistService (data) {
    return api.post('api/InsertSushelistService', data)
  },
  // 宿舍修改
  UpdateSushelistService (data) {
    return api.post('api/UpdateSushelistService', data)
  },
  // 宿舍删除
  DeleteSushelistService (data) {
    return api.post('api/DeleteSushelistService', data)
  },
  // 宿舍删除
  QueryLikeSushelistService (data) {
    return api.post('api/QueryLikeSushelistService', data)
  }

}

export default system
