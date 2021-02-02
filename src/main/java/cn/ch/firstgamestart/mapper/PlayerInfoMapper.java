package cn.ch.firstgamestart.mapper;

import cn.ch.firstgamestart.entity.PlayerInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 玩家属性 Mapper 接口
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
public interface PlayerInfoMapper extends BaseMapper<PlayerInfo> {

    /**
     * 获取所有玩家属性
     *
     * @return
     */
    List<PlayerInfo> getAll();


}
