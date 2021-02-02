package cn.ch.firstgamestart.service.impl;


import cn.ch.firstgamestart.common.constant.NormalConstant;
import cn.ch.firstgamestart.common.result.Result;
import cn.ch.firstgamestart.entity.GameMonsterProperty;
import cn.ch.firstgamestart.entity.GamePlayerProperty;
import cn.ch.firstgamestart.entity.PlayerInfo;
import cn.ch.firstgamestart.service.FightService;
import cn.ch.firstgamestart.service.GameMonsterPropertyService;
import cn.ch.firstgamestart.service.GamePlayerPropertyService;
import cn.ch.firstgamestart.service.PlayerInfoService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @description: 战斗 服务实现类
 * @author: chenhao
 * @create:2020/9/30 9:21
 **/
@Service
public class FightServiceImpl implements FightService {

    @Autowired
    private GameMonsterPropertyService gameMonsterPropertyService;

    @Autowired
    private GamePlayerPropertyService gamePlayerPropertyService;

    @Autowired
    private PlayerInfoService playerInfoService;

    /**
     * 获取所有怪名称
     *
     * @return
     */
    @Override
    public String[] fightIndex() {
        return NormalConstant.MONSTER_NAME;
    }

    /**
     * 开始战斗
     *
     * @param monsterName
     * @param userId
     * @return
     */
    @Override
    public Result startFight(String monsterName, String userId) {
        GameMonsterProperty monsterProperty = gameMonsterPropertyService
                .getOne(new LambdaQueryWrapper<GameMonsterProperty>()
                        .eq(GameMonsterProperty::getName, monsterName));
        PlayerInfo playerInfo = playerInfoService
                .getOne(new LambdaQueryWrapper<PlayerInfo>()
                        .eq(PlayerInfo::getId, userId));
        GamePlayerProperty playerProperty = gamePlayerPropertyService
                .getOne(new LambdaQueryWrapper<GamePlayerProperty>()
                        .eq(GamePlayerProperty::getLevel, playerInfo.getLevel()));

        //玩家打怪造成伤害
        Integer playerDamage = playerProperty.getAd() - monsterProperty.getArmor() > 0 ? playerProperty.getAd() - monsterProperty.getArmor() : 0;

        //怪打玩家造成伤害
        Integer monsterDamage = monsterProperty.getAd() - playerProperty.getArmor() > 0 ? monsterProperty.getAd() - playerProperty.getArmor() : 0;

        if (Objects.equals(playerDamage, 0) && Objects.equals(monsterDamage, 0)) {
            System.out.println("你尝试着砍了" + monsterName + "一刀，发现" + monsterName + "没有反应，你陷入了沉思");
            System.out.println(monsterName + "似乎感觉到了你的存在，想你拍了一巴掌，却只打出一条浅浅的白痕");
            return Result.success("敌不动，我不动，敌动，我不痛，我动，敌不痛，你俩发现谁都打不过谁，怪物放感觉有趣，提出用五点金币换取你的五点经验");
        }
        if (Objects.equals(playerDamage, 0) && monsterDamage > 0) {
            System.out.println("你尝试着砍了" + monsterName + "一刀，发现" + monsterName + "没有反应，你陷入了沉思");
            System.out.println(monsterName + "似乎感觉到了你的存在，想你拍了一巴掌，你竟然被直接拍飞");
            return Result.success("敌不动，我不动，敌动，我痛，我动，敌不痛，你发现似乎打不过" + monsterName + "\n你斟酌了下，开始考虑是否借机逃跑");
        }
        if (Objects.equals(monsterDamage, 0) && playerDamage > 0) {
            System.out.println("你尝试着砍了" + monsterName + "一刀，" + monsterName + "一声痛吼，竟直接被你打没" + playerDamage + "血，" + monsterName + "直呼内行");
            System.out.println(monsterName + "感觉你是个高手，试着对你发起了攻击,却只打出一条浅浅的白痕," + monsterName + "陷入了沉思");
            return Result.success("敌不动，我不动，敌动，我不痛，我动，敌痛，你发现" + monsterName
                    + "似乎想逃跑，\n是否给他活下去的机会，让他去贷款交出百分之两百的金币，并不取他的经验值");
        }

        int playerHp = playerProperty.getHp();
        int monsterHp = monsterProperty.getHp();
        while (playerHp > 0 && monsterHp > 0) {
            playerHp = playerHp - monsterDamage;
            monsterHp = monsterHp - playerDamage;
            System.out.println("你试探性地向" + monsterName + "发起了攻击" + "砍了他" + playerDamage + "点血");
            System.out.println(monsterName + "气愤不已，抬手就给了你一巴掌,竟将你打出了内出血,你损失了" + monsterDamage + "点血");
        }
        if (monsterHp < 0) {
            return Result.success(monsterName
                    + "使出了最后一击天垄断天魄，竟是一击灵魂攻击,然后你早已看破一切,使出一招天神振臂,将其攻击抵挡并对"
                    + monsterName + "造成了内伤，" + monsterName + "重伤之下精神再次受创，吐血倒下");
        }
        return Result.success(monsterName
                + "使出了最后一击天垄断天魄，竟是一击灵魂攻击，你在他的攻击下精神受到重创，并交出了三分之一的经验请求"
                + monsterName + "放你一马，"
                + monsterName + "冷哼一声并抢走了你的经验");
    }
}
