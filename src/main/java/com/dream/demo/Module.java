package com.dream.demo;

/**
 * Created by sunzhiqiang on 2016/8/26.
 */

public class Module extends BaseEntity {

    private String name;

    private String value;

    private int count;

    private Integer delFlag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", count=" + count +
                ", delFlag=" + delFlag +
                '}';
    }
}
