package com.mayikt.service;

import java.util.List;
import java.util.Map;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: OrderService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2820:48
 */
public class OrderService {

    /**
     * V1 版本的时候提供了一个接口，入参是为map类型
     * V2 版本能够支持List类型
     *
     * @param map
     */
    public void forMap(Map map) {
        for (int i = 0; i < map.size(); i++) {
            String value = (String) map.get(i);
            System.out.println("value:" + value);
        }
    }
    //适配器模式 支持新版本List类型  中间使用适配器

}
