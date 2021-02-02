package cn.ch.firstgamestart.service;


import cn.ch.firstgamestart.common.result.Result;

/**
 * @description: 战斗服务类
 * @author: chenhao
 * @create:2020/9/30 9:20
 **/
public interface FightService {

    /**
     * 获取所有怪名称
     * @return
     */
    String[] fightIndex();

    /**
     * 开始战斗
     * @param monsterName
     * @param userId
     * @return
     */
    public Result startFight(String monsterName, String userId);
}
