package com.gms.core.impl;

import com.gms.core.domain.Strategy;

/**
 * Created by tianye on 2017/6/28.
 */
public class OutputCollector {
    public String src;
    public Strategy strategy;
    public OutputCollector(String src, Strategy strategy){
        this.src=src;
        this.strategy=strategy;
    }
    public void Emit(Strategy strategy){}
}
