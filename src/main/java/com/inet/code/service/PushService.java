package com.inet.code.service;

import com.inet.code.entity.Push;
import com.baomidou.mybatisplus.extension.service.IService;
import com.inet.code.utlis.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HCY
 * @since 2020-11-17
 */
public interface PushService extends IService<Push> {
    /**
     * 推送信息
     * @param headline 标题
     * @param content 内容
     * @param path URL路径
     * @return Result风格
     */
    Result getSend(String headline, String content, String path);
    /**
     * 通过uuid删除推文
     * @author HCY
     * @since 2020/11/20 9:35 上午
     * @param uuid:
     * @return com.inet.code.utlis.Result
    */
    Result removeByuuid(String uuid,String path);
}
