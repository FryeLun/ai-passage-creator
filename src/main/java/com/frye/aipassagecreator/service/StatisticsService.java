package com.frye.aipassagecreator.service;

import com.frye.aipassagecreator.model.vo.StatisticsVO;

public interface StatisticsService {

    /**
     * 获取系统统计数据
     *
     * @return 统计数据
     */
    StatisticsVO getStatistics();

}
