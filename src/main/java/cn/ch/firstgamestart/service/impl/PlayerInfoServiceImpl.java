package cn.ch.firstgamestart.service.impl;

import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.GamePlayerProperty;
import cn.ch.firstgamestart.entity.PlayerInfo;
import cn.ch.firstgamestart.mapper.PlayerInfoMapper;
import cn.ch.firstgamestart.pojo.vo.PlayerPropertyVO;
import cn.ch.firstgamestart.service.GamePlayerPropertyService;
import cn.ch.firstgamestart.service.PlayerInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 玩家属性 服务实现类
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Service
public class PlayerInfoServiceImpl extends ServiceImpl<PlayerInfoMapper, PlayerInfo> implements PlayerInfoService {

    @Autowired
    private GamePlayerPropertyService gamePlayerPropertyService;

    /**
     * 获取玩家个人属性
     * @param id
     * @return
     */
    @Override
    public Result<PlayerPropertyVO> selectPropertyById(Integer id) {
        PlayerPropertyVO playerPropertyVO = new PlayerPropertyVO();
        PlayerInfo playerInfo = this.getById(id);

        String name = playerInfo.getUsername();
        int level = playerInfo.getLevel();
        QueryWrapper qr = new QueryWrapper();
        qr.eq("level", playerInfo.getId());
        GamePlayerProperty gamePlayerProperty = gamePlayerPropertyService.getOne(qr);

        int ad = gamePlayerProperty.getAd() + playerInfo.getNowgp() / 80 * 1 + playerInfo.getUsemoney() / 100 * 30;
        int armor = gamePlayerProperty.getArmor() + playerInfo.getNowgp() / 80 * 1 + playerInfo.getUsemoney() / 100 * 30;
        int hp = gamePlayerProperty.getHp() + playerInfo.getNowgp() / 80 * 1 + playerInfo.getUsemoney() / 100 * 30;
        double crit = gamePlayerProperty.getCrit();
        playerPropertyVO = new PlayerPropertyVO(id, name, level, ad, armor, hp, crit);
        return Result.success(playerPropertyVO);
    }


    /**
     * 获取所有玩家的属性
     * @return
     */
    @Override
    public Result<List<PlayerInfo>> getAllPlayerInfo(){
        return Result.success(baseMapper.getAll());
    }

}
