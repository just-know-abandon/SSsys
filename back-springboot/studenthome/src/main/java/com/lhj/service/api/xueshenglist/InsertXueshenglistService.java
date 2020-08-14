package com.lhj.service.api.xueshenglist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Xueshenglist;
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
@WebServlet(name = "InsertXueshenglistService", urlPatterns={"/api/InsertXueshenglistService"})
public class InsertXueshenglistService extends HttpServlet {
    @Autowired
    private XueshenglistService xueshenglistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String xueshenglistSushehao = request.getParameter("xueshenglistSushehao");
        String xueshenglistName = request.getParameter("xueshenglistName");
        String xueshenglistPhone = request.getParameter("xueshenglistPhone");
        String xueshenglistZhuanye = request.getParameter("xueshenglistZhuanye");
        String xueshenglistXuehao = request.getParameter("xueshenglistXuehao");
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        strList1.add(xueshenglistSushehao);
        strList2.add("xueshenglistSushehao");
        strList1.add(xueshenglistName);
        strList2.add("xueshenglistName");
        strList1.add(xueshenglistPhone);
        strList2.add("xueshenglistPhone");
        strList1.add(xueshenglistZhuanye);
        strList2.add("xueshenglistZhuanye");
        strList1.add(xueshenglistXuehao);
        strList2.add("xueshenglistXuehao");
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                Xueshenglist xueshenglist = new Xueshenglist();
                xueshenglist.setSushehao(xueshenglistSushehao);
                xueshenglist.setName(xueshenglistName);
                xueshenglist.setPhone(xueshenglistPhone);
                xueshenglist.setXuehao(xueshenglistXuehao);
                xueshenglist.setZhuanye(xueshenglistZhuanye);
                xueshenglistService.save(xueshenglist);
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
