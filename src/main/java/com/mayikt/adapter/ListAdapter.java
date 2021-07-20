package com.mayikt.adapter;

import java.util.HashMap;
import java.util.List;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: ListAdapter
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2820:55
 */
public class ListAdapter extends HashMap {
    // 目标对象新版本
    private List list;

    public ListAdapter(List list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(Object key) {
        return list.get(Integer.valueOf(key.toString()).intValue());
    }
}
