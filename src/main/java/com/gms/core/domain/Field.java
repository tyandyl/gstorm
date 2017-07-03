package com.gms.core.domain;

/**
 * Created by tianye on 2017/7/3.
 */
public class Field {
    public String name;
    public FieldType type;
    public String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
