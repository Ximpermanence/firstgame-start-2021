package cn.ch.firstgamestart.service.impl;

import cn.ch.firstgamestart.common.constant.LoginConstant;
import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.PlayerUser;
import cn.ch.firstgamestart.mapper.PlayerUserMapper;
import cn.ch.firstgamestart.pojo.param.LoginParam;
import cn.ch.firstgamestart.service.PlayerUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * 用户属性 服务实现类
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Service
public class PlayerUserServiceImpl extends ServiceImpl<PlayerUserMapper, PlayerUser> implements PlayerUserService {


    /**
     * 注册
     *
     * @param loginParam
     * @return
     */
    @Override
    public Result register(LoginParam loginParam) {
        LambdaQueryWrapper<PlayerUser> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(PlayerUser::getUsername, loginParam.getUsername());
        PlayerUser playerUser = getOne(wrapper, false);
        if (Objects.isNull(playerUser)) {
            PlayerUser playerUser1 = new PlayerUser();
            playerUser1.setUsername(loginParam.getUsername()).setPassword(loginParam.getPassword());
            save(playerUser1);
            return Result.success(LoginConstant.LOGIN_SUCCESS);
        }
        return Result.error(LoginConstant.REGISTER_FAILED);
    }

    /**
     * 登录
     *
     * @param loginParam
     * @return
     */
    @Override
    public Result login(LoginParam loginParam) {

        LambdaQueryWrapper<PlayerUser> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(PlayerUser::getUsername, loginParam);
        PlayerUser playerUser = getOne(wrapper, false);
        if (playerUser.getPassword().equals(loginParam.getPassword())) {
            return Result.success(LoginConstant.LOGIN_SUCCESS);
        }
        return Result.error(LoginConstant.LOGIN_FAILED);
    }
}
