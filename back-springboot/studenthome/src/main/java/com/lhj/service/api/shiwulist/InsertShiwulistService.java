package com.lhj.service.api.shiwulist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Shiwulist;
import com.lhj.sql.service.ShiwulistService;
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
@WebServlet(name = "InsertShiwulistService", urlPatterns={"/api/InsertShiwulistService"})
public class InsertShiwulistService extends HttpServlet {
    @Autowired
    private ShiwulistService shiwulistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String shiwulistxiuxinxi = request.getParameter("shiwulistxiuxinxi");
        String shiwulistSushehao = request.getParameter("shiwulistSushehao");
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        strList1.add(shiwulistxiuxinxi);
        strList2.add("shiwulistxiuxinxi");
        strList1.add(shiwulistSushehao);
        strList2.add("shiwulistSushehao");
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                Shiwulist shiwulist=new Shiwulist();
                shiwulist.setShiwuxinxi(shiwulistxiuxinxi);
                shiwulist.setSushehao(shiwulistSushehao);
                shiwulistService.save(shiwulist);
                code = 200;
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
