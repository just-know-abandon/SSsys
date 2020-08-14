package com.lhj.service.api.shiwulist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Shiwulist;
import com.lhj.sql.model.ShiwulistExample;
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
@WebServlet(name = "QueryShiwulistService", urlPatterns={"/api/QueryShiwulistService"})
public class QueryShiwulistService extends HttpServlet {
    @Autowired
    private ShiwulistService shiwulistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        List<String> strList1 = new ArrayList();
        List<String> strList2 = new ArrayList();
        JsonArray dataJson = new JsonArray();
        JsonObject result = new JsonObject();
        String parameter = "";
        int code = 0;//状态码
        String message = "";//返回说明（默认200：成功；500：失败）
        try {
            //判断参数是否正确
            parameter = ApiUtils.apiHead(strList1, strList2);
            if (parameter.equals("1")) {
                List<Shiwulist> shiwulists=shiwulistService.getShiwulistByExample(new ShiwulistExample());
                for (int i=0;i<shiwulists.size();i++){
                    Shiwulist shiwulist=shiwulists.get(i);
                    JsonObject json=new JsonObject();
                    json.addProperty("shiwulistId",shiwulist.getId());
                    json.addProperty("shiwulistxiuxinxi",shiwulist.getShiwuxinxi());
                    json.addProperty("shiwulistSushehao",shiwulist.getSushehao());
                    dataJson.add(json);
                }
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
