package com.gms.core.inter;

import com.gms.core.domain.Fields;
import com.gms.core.impl.OutputCollector;

/**
 * Created by tianye on 2017/6/28.
 * 消息源的作用是产生消息，将元组发送到拓扑结构中
 */
public interface ISpout extends ITask{

    /**
     * open 负责打开并初始化一个新的消息源
     * outputCollector 是数据收集器，负责收集数据并将数据传到其他的Bolt节点，是对网络层的封装
     * @param outputCollector
     */
    void open(OutputCollector outputCollector);
    //关闭消息源
    void close();
}
