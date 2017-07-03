package com.gms.core.domain;

/**
 * Created by tianye on 2017/7/3.
 */
public enum FieldType {
    INT(1,"int型"),
    STRING(2,"String型");
    public int type;
    public String name;
    FieldType(int type,String name){
        this.type=type;
        this.name=name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
