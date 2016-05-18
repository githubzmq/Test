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
        String str = "你知道我在等你吗？";
        Date date=new Date();
        HelloWord helloWord = new HelloWord();
        helloWord.gitTest(str);
        System.out.println("HelloWord.main"+date);
    }
    /**
     * @MethodName gitTest
     * @Description
     * @param s 参数
     * @return void
     * @throws
     * @author zhangmingqing
     * @date 2016/5/18 17:34
     */
    public void gitTest(String s){
        System.out.println("这个是动态获取的值=====>"+s);
    }
}
