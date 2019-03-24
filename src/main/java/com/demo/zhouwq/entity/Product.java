package com.demo.zhouwq.entity;

import javax.persistence.*;

public class Product {
    private Integer id;

    private String code;

    private String name;

    private Integer num;

    private String prodesc;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return prodesc
     */
    public String getProdesc() {
        return prodesc;
    }

    /**
     * @param prodesc
     */
    public void setProdesc(String prodesc) {
        this.prodesc = prodesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", prodesc='" + prodesc + '\'' +
                '}';
    }
}