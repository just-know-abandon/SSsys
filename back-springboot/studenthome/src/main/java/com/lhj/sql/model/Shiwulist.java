package com.lhj.sql.model;

public class Shiwulist extends ShiwulistKey {
    private String sushehao;

    private String shiwuxinxi;

    public String getSushehao() {
        return sushehao;
    }

    public void setSushehao(String sushehao) {
        this.sushehao = sushehao == null ? null : sushehao.trim();
    }

    public String getShiwuxinxi() {
        return shiwuxinxi;
    }

    public void setShiwuxinxi(String shiwuxinxi) {
        this.shiwuxinxi = shiwuxinxi == null ? null : shiwuxinxi.trim();
    }
}