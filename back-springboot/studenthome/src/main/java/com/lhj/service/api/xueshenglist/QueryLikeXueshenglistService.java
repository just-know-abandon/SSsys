package com.lhj.service.api.xueshenglist;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lhj.service.utils.ApiUtils;
import com.lhj.sql.model.Xueshenglist;
import com.lhj.sql.model.XueshenglistExample;
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
@WebServlet(name = "QueryLikeXueshenglistService", urlPatterns={"/api/QueryLikeXueshenglistService"})
public class QueryLikeXueshenglistService extends HttpServlet {
    @Autowired
    private XueshenglistService xueshenglistService;

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
                XueshenglistExample xueshenglistExample=new XueshenglistExample();
                XueshenglistExample.Criteria xueshenglistCriteria=xueshenglistExample.createCriteria();
                xueshenglistCriteria.andSushehaoLike(QueryValue);
                List<Xueshenglist> xueshenglists=xueshenglistService.getXueshenglistByExample(xueshenglistExample);
                for (int i=0;i<xueshenglists.size();i++){
                    Xueshenglist xueshenglist=xueshenglists.get(i);
                    JsonObject json=new JsonObject();
                    json.addProperty("xueshenglistId",xueshenglist.getId());
                    json.addProperty("xueshenglistSushehao",xueshenglist.getSushehao());
                    json.addProperty("xueshenglistName",xueshenglist.getName());
                    json.addProperty("xueshenglistPhone",xueshenglist.getPhone());
                    json.addProperty("xueshenglistXuehao",xueshenglist.getXuehao());
                    json.addProperty("xueshenglistZhuanye",xueshenglist.getZhuanye());
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
