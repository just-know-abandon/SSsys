package com.lhj.service.api.sushelist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Sushelist;
import com.lhj.sql.service.SushelistService;
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
@WebServlet(name = "InsertSushelistService", urlPatterns = {"/api/InsertSushelistService"})
public class InsertSushelistService extends HttpServlet {
    @Autowired
    private SushelistService sushelistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String sushelistPhone = request.getParameter("sushelistPhone");
        String sushelistSushehao = request.getParameter("sushelistSushehao");
        String sushelistRenshu = request.getParameter("sushelistRenshu");
        String sushelistShezhang = request.getParameter("sushelistShezhang");
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        strList1.add(sushelistPhone);
        strList2.add("sushelistPhone");
        strList1.add(sushelistSushehao);
        strList2.add("sushelistSushehao");
        strList1.add(sushelistRenshu);
        strList2.add("sushelistRenshu");
        strList1.add(sushelistShezhang);
        strList2.add("sushelistShezhang");
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                Sushelist sushelist = new Sushelist();
                sushelist.setSushehao(sushelistSushehao);
                sushelist.setPhone(sushelistPhone);
                sushelist.setRenshu(sushelistRenshu);
                sushelist.setShezhang(sushelistShezhang);
                sushelistService.save(sushelist);
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
