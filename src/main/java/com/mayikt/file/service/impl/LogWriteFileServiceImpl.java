package com.mayikt.file.service.impl;

import com.mayikt.file.entity.LogBean;
import com.mayikt.file.service.LogWriteFileService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: LogWriteFileServiceImpl
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2821:16
 */
public class LogWriteFileServiceImpl implements LogWriteFileService {
    public void logWriteFile() {
        System.out.println(">>>将日志写入到本地文件中..");
    }

    public List<LogBean> readLogFile() {
        LogBean log1 = new LogBean();
        log1.setLogId("0001");
        log1.setLogText("Tomcat启动成功..");

        LogBean log2 = new LogBean();
        log2.setLogId("0002");
        log2.setLogText("Jetty启动成功..");
        List<LogBean> listArrayList = new ArrayList<LogBean>();
        listArrayList.add(log1);
        listArrayList.add(log2);
        return listArrayList;

    }
}
