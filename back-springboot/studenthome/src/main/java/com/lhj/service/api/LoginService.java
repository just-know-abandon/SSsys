package com.lhj.service.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Denglu;
import com.lhj.sql.model.DengluExample;
import com.lhj.sql.model.WanguilistKey;
import com.lhj.sql.service.DengluService;
import com.lhj.sql.service.XueshenglistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@WebServlet(name = "LoginService", urlPatterns={"/api/LoginService"})
public class LoginService extends HttpServlet {
    @Autowired
    private DengluService dengluService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        strList1.add(userName);
        strList2.add("userName");
        strList1.add(password);
        strList2.add("password");
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                DengluExample dengluExample=new DengluExample();
                DengluExample.Criteria dengluCriteria=dengluExample.createCriteria();
                dengluCriteria.andUsernameEqualTo(userName);
                List<Denglu> dengluList=dengluService.getDengluByExample(dengluExample);
                if(dengluList.size()>0){
                    code = 200;
                }else {
                    code=201;
                    message="账号或密码错误";
                }
            } else {
                //参数验证失败
                code = 300;
            }
        } catch (Exception e) {
            e.printStackTrace();
            code = 500;
        }
        out.println(ApiUtils.apiFoot(code, parameter, message, dataJson, result));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
