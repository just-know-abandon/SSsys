package com.lhj.service.api.baoxiulist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Baoxiulist;
import com.lhj.sql.model.BaoxiulistExample;
import com.lhj.sql.service.BaoxiulistService;
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
@WebServlet(name = "QueryLikeBaoxiulistService", urlPatterns={"/api/QueryLikeBaoxiulistService"})
public class QueryLikeBaoxiulistService extends HttpServlet {
    @Autowired
    private BaoxiulistService baoxiulistService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String QueryValue = request.getParameter("QueryValue");
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
                BaoxiulistExample baoxiulistExample=new BaoxiulistExample();
                BaoxiulistExample.Criteria baoxiulistCriteria=baoxiulistExample.createCriteria();
                baoxiulistCriteria.andSushehaoLike(QueryValue);
                List<Baoxiulist> baoxiulists=baoxiulistService.getBaoxiulistByExample(baoxiulistExample);
                for (int i=0;i<baoxiulists.size();i++){
                    Baoxiulist baoxiulist=baoxiulists.get(i);
                    JsonObject json=new JsonObject();
                    json.addProperty("baoxiulistId",baoxiulist.getId());
                    json.addProperty("baoxiulistxiuxinxi",baoxiulist.getBaoxiuxinxi());
                    json.addProperty("baoxiulistSushehao",baoxiulist.getSushehao());
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
