package com.frye.aipassagecreator.controller;

import com.frye.aipassagecreator.annotation.AuthCheck;
import com.frye.aipassagecreator.common.BaseResponse;
import com.frye.aipassagecreator.common.ResultUtils;
import com.frye.aipassagecreator.constant.UserConstant;
import com.frye.aipassagecreator.model.vo.StatisticsVO;
import com.frye.aipassagecreator.service.StatisticsService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
@Slf4j
public class StatisticsController {

    @Resource
    private StatisticsService statisticsService;

    /**
     * 获取系统统计数据（仅管理员）
     */
    @GetMapping("/overview")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<StatisticsVO> getStatistics() {
        StatisticsVO statistics = statisticsService.getStatistics();
        return ResultUtils.success(statistics);
    }
}