package com.mayikt.file.service;

import com.mayikt.file.entity.LogBean;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: LogWriteDbService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2821:20
 */
public interface LogWriteDbService {
    /**
     * 将本地文件写入到数据库中 新的目标
     */
    void logWriteDb(LogBean logBean);
}
