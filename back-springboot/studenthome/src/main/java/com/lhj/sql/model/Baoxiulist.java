package com.lhj.sql.model;

public class Baoxiulist extends BaoxiulistKey {
    private String sushehao;

    private String baoxiuxinxi;

    public String getSushehao() {
        return sushehao;
    }

    public void setSushehao(String sushehao) {
        this.sushehao = sushehao == null ? null : sushehao.trim();
    }

    public String getBaoxiuxinxi() {
        return baoxiuxinxi;
    }

    public void setBaoxiuxinxi(String baoxiuxinxi) {
        this.baoxiuxinxi = baoxiuxinxi == null ? null : baoxiuxinxi.trim();
    }
}