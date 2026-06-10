package com.frye.aipassagecreator.service;

import com.frye.aipassagecreator.model.entity.AgentLog;
import com.frye.aipassagecreator.model.vo.AgentExecutionStats;
import com.mybatisflex.core.service.IService;

import java.util.List;

/**
 * 智能体日志服务
 */
public interface AgentLogService extends IService<AgentLog> {

    /**
     * 异步保存日志
     *
     * @param log 日志对象
     */
    void saveLogAsync(AgentLog log);

    /**
     * 根据任务ID获取所有日志
     *
     * @param taskId 任务ID
     * @return 日志列表
     */
    List<AgentLog> getLogsByTaskId(String taskId);

    /**
     * 获取任务执行统计信息
     *
     * @param taskId 任务ID
     * @return 执行统计
     */
    AgentExecutionStats getExecutionStats(String taskId);
}