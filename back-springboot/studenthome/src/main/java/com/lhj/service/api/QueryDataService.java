package com.lhj.service.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.*;
import com.lhj.sql.service.*;
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
@WebServlet(name = "QueryDataService", urlPatterns={"/api/QueryDataService"})
public class QueryDataService extends HttpServlet {
    @Autowired
    private XueshenglistService xueshenglistService;
    @Autowired
    private SushelistService sushelistService;
    @Autowired
    private ShiwulistService shiwulistService;
    @Autowired
    private WanguilistService wanguilistService;
    @Autowired
    private BaoxiulistService baoxiulistService;

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
                long xueshenglist=xueshenglistService.getCountByExample(new XueshenglistExample());
                long sushelist=sushelistService.getCountByExample(new SushelistExample());
                long shiwulist=shiwulistService.getCountByExample(new ShiwulistExample());
                long wanguilist=wanguilistService.getCountByExample(new WanguilistExample());
                long baoxiulist=baoxiulistService.getCountByExample(new BaoxiulistExample());
                JsonObject json=new JsonObject();
                json.addProperty("xueshenglist",xueshenglist);
                json.addProperty("sushelist",sushelist);
                json.addProperty("shiwulist",shiwulist);
                json.addProperty("wanguilist",wanguilist);
                json.addProperty("baoxiulist",baoxiulist);
                dataJson.add(json);
                code=200;
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
