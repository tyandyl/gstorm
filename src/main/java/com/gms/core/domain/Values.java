package com.gms.core.domain;

/**
 * Created by tianye on 2017/6/28.
 */
public enum Values {
    Global(1),Ramdom(2),Group(3);
    public int i;
    Values(int i){
        this.i=i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
