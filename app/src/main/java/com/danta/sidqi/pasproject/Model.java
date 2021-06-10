package com.danta.sidqi.pasproject;

public class Model {
    private String rcpname, diff, info, ingri, steps;
    private int img;

    public Model(String ttl, String dificult, String ingri, String steps, String info, int img){
        this.rcpname = ttl;
        this.diff = dificult;
        this.info = info;
        this.ingri = ingri;
        this.steps = steps;
        this.img = img;
    }

    public String getRcpname() {
        return rcpname;
    }

    public void setRcpname(String rcpname) {
        this.rcpname = rcpname;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getIngri() {
        return ingri;
    }

    public void setIngri(String ingri) {
        this.ingri = ingri;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
