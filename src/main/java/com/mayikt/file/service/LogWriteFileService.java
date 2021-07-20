package com.mayikt.file.service;

import com.mayikt.file.entity.LogBean;

import java.util.List;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: LogWriteFileService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2821:16
 */
public interface LogWriteFileService {

    /**
     * 将日志写入本地文件
     */
    void logWriteFile();
    /**
     * 从本地文件中读取日志
     *
     * @return
     */
    List<LogBean> readLogFile();

}
