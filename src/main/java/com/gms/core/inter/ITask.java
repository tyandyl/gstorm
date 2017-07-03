package com.gms.core.inter;

import com.gms.core.domain.Fields;

import java.util.List;

/**
 * Created by tianye on 2017/6/28.
 */
public interface ITask {

    //此方法用来声明任务的字段名，每个任务都会输出一系列的数据，而Fields 对象就是用来为这些数据命名
    Fields declareFields();
}
