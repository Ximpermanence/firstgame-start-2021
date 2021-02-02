package cn.ch.firstgamestart.service;

import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.PlayerInfo;
import cn.ch.firstgamestart.pojo.vo.PlayerPropertyVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 玩家属性 服务类
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
public interface PlayerInfoService extends IService<PlayerInfo> {

    /**
     * 获取玩家个人属性
     * @param id
     * @return
     */
    Result<PlayerPropertyVO> selectPropertyById(Integer id);

    /**
     * 获取所有玩家的属性
     * @return
     */
    Result<List<PlayerInfo>> getAllPlayerInfo();
}
