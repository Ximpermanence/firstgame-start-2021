package cn.ch.firstgamestart.service.impl;

import cn.ch.firstgamestart.entity.GamePlayerProperty;
import cn.ch.firstgamestart.mapper.GamePlayerPropertyMapper;
import cn.ch.firstgamestart.service.GamePlayerPropertyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 玩家属性表 服务实现类
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Service
public class GamePlayerPropertyServiceImpl extends ServiceImpl<GamePlayerPropertyMapper, GamePlayerProperty> implements GamePlayerPropertyService {

}
