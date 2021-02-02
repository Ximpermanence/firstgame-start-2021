package cn.ch.firstgamestart.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @description:玩家属性VO
 * @author: chenhao
 * @create:2021/1/28 14:18
 **/
@Data
@ApiModel("玩家属性VO")
public class PlayerPropertyVO {
    @ApiModelProperty("账号")
    private Integer id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("等级")
    private Integer level;
    @ApiModelProperty("攻击")
    private Integer ad;
    @ApiModelProperty("防御")
    private Integer armor;
    @ApiModelProperty("血量")
    private Integer hp;
    @ApiModelProperty("暴击率")
    private Double crit;

    public PlayerPropertyVO() {
    }

    public PlayerPropertyVO(Integer id, String name, Integer level, Integer ad, Integer armor, Integer hp, Double crit) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.ad = ad;
        this.armor = armor;
        this.hp = hp;
        this.crit = crit;
    }
}
