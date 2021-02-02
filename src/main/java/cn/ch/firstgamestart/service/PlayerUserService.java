package cn.ch.firstgamestart.service;

import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.PlayerUser;
import cn.ch.firstgamestart.pojo.param.LoginParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户属性 服务类
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
public interface PlayerUserService extends IService<PlayerUser> {

    /**
     * 注册
     *
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);

    /**
     * 登录
     *
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);
}
