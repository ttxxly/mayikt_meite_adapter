package com.mayikt.file.service.adapter;

import com.mayikt.file.entity.LogBean;
import com.mayikt.file.service.LogWriteDbService;
import com.mayikt.file.service.impl.LogWriteFileServiceImpl;

import java.util.List;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: LogAdapter
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2821:20
 */
//public class LogAdapter extends LogWriteFileServiceImpl implements LogWriteDbService {
public class LogAdapter implements LogWriteDbService {
    // 源 Adaptee
    private LogWriteFileServiceImpl logWriteFileServiceImpl;

    public LogAdapter(LogWriteFileServiceImpl logWriteFileServiceImpl) {
        this.logWriteFileServiceImpl = logWriteFileServiceImpl;
    }


    // 新增的扩展功能 既能够支持写入本地文件，也能支持写入数据库
    public void logWriteDb(LogBean logBean) {
        // 1.读取本地文件
        List<LogBean> logBeans = logWriteFileServiceImpl.readLogFile();
        logBeans.add(logBean);
        // 2.将数据写入到数据库中..
        System.out.println(">>>写入到数据库中..");
        // 1. 写入本地文件
        logWriteFileServiceImpl.logWriteFile();
    }
    // 万一只需要写数据库的话
}
