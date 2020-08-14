package com.lhj.service.api.wanguilist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Wanguilist;
import com.lhj.sql.service.WanguilistService;
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
@WebServlet(name = "InsertWangguilistService", urlPatterns={"/api/InsertWangguilistService"})
public class InsertWangguilistService extends HttpServlet {
    @Autowired
    private WanguilistService wanguilistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String wanguilistName = request.getParameter("wanguilistName");
        String wanguilistSushehao = request.getParameter("wanguilistSushehao");
        String wanguilistRiqi = request.getParameter("wanguilistRiqi");
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        strList1.add(wanguilistName);
        strList2.add("wanguilistName");
        strList1.add(wanguilistSushehao);
        strList2.add("wanguilistSushehao");
        strList1.add(wanguilistRiqi);
        strList2.add("wanguilistRiqi");
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                Wanguilist wanguilist=new Wanguilist();
                wanguilist.setSushehao(wanguilistSushehao);
                wanguilist.setName(wanguilistName);
                wanguilist.setRiqi(wanguilistRiqi);
                wanguilistService.save(wanguilist);
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
