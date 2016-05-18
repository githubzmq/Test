package com.zhang;

import java.util.Date;

/**
 * @ClassName HelloWord
 * @Description 第一个项目
 * @author zhangmingqing
 * @date 2016/4/11 15:27
 */
public class HelloWord {
    /**
     * @MethodName
     * @Description 打印时间
     * @author zhangmingqing
     * @date 2016/4/11 15:32
     */
    public static void main(String[] args){
        Date date=new Date();
        System.out.println("HelloWord.main"+date);
    }
    public void gitTest1(){
        System.out.println("你好这是我新建的分支");
    }
}
