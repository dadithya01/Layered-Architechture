package com.example.layeredarchitecture.view.tdm;

public class ItemIdTm {

    public String code;

    public ItemIdTm(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ItemIdTm{" +
                "code='" + code + '\'' +
                '}';
    }
}
