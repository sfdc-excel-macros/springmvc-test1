package com.example;

public class BasicBean {
    private String val1, val2, val3;
    public BasicBean() {
        this("default1", "default2", "default3");
    }
    public BasicBean(String val1, String val2, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public String getVal1() {
        return this.val1;
    }
    public String getVal2() {
        return this.val2;
    }
    public String getVal3() {
        return this.val3;
    }
    public void setVal1(String nv) {
        this.val1 = nv;
    }
    public void setVal2(String nv) {
        this.val2 = nv;
    }
    public void setVal3(String nv) {
        this.val3 = nv;
    }
}
