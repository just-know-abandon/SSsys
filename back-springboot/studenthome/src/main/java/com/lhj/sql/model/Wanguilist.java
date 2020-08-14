package com.lhj.sql.model;

public class Wanguilist extends WanguilistKey {
    private String sushehao;

    private String name;

    private String riqi;

    public String getSushehao() {
        return sushehao;
    }

    public void setSushehao(String sushehao) {
        this.sushehao = sushehao == null ? null : sushehao.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi == null ? null : riqi.trim();
    }
}