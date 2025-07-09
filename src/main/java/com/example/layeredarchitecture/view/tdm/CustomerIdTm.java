package com.example.layeredarchitecture.view.tdm;

public class CustomerIdTm {

    private String id;

    public CustomerIdTm(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomerIdTm{" +
                "id='" + id + '\'' +
                '}';
    }
}
