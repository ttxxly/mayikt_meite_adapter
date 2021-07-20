package com.mayikt;

import com.mayikt.adapter.ListAdapter;
import com.mayikt.service.OrderService;
import org.apache.ibatis.logging.Log;

import java.util.ArrayList;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: Test001
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2821:00
 */
public class Test001 {
    public static void main(String[] args) {
        // 1.定义源 老版本
        OrderService orderService = new OrderService();
        ArrayList arrayList = new ArrayList();
        arrayList.add("mayikt");
        arrayList.add("xiaowei");
        arrayList.add("xiaomin");
        // 2.使用适配器实现转换
        ListAdapter listAdapter = new ListAdapter(arrayList);
        // 3.可以支持list类型
        orderService.forMap(listAdapter);

    }
    /**
     *  写入日志 写入本地文件  后期开发者扩展新功能 支持写入MQ、写入数据库  使用适配器  外部扩展
     *
     *  装饰  内部扩展 使用装饰
     */
}
