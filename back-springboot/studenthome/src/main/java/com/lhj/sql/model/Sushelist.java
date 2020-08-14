package com.lhj.sql.model;

public class Sushelist extends SushelistKey {
    private String sushehao;

    private String renshu;

    private String shezhang;

    private String phone;

    public String getSushehao() {
        return sushehao;
    }

    public void setSushehao(String sushehao) {
        this.sushehao = sushehao == null ? null : sushehao.trim();
    }

    public String getRenshu() {
        return renshu;
    }

    public void setRenshu(String renshu) {
        this.renshu = renshu == null ? null : renshu.trim();
    }

    public String getShezhang() {
        return shezhang;
    }

    public void setShezhang(String shezhang) {
        this.shezhang = shezhang == null ? null : shezhang.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}