package cn.ch.firstgamestart.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 玩家属性
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PlayerInfo对象", description="玩家属性")
public class PlayerInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "攻击")
    private Integer ad;

    @ApiModelProperty(value = "防御")
    private Integer armor;

    @ApiModelProperty(value = "生命值")
    private Integer hp;

    @ApiModelProperty(value = "暴击率")
    private Float crit;

    @ApiModelProperty(value = "现在经验")
    private Integer nowexp;

    @ApiModelProperty(value = "现在金币")
    private Integer nowgp;

    @ApiModelProperty(value = "充值现金")
    private Integer usemoney;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ApiModelProperty(value = "创建人")
    private String createUser;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date modifyDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ApiModelProperty(value = "修改人")
    private String modifyUser;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ApiModelProperty(value = "是否删除 - 1:未删除 0:删除")
    @TableLogic
    private Integer isDeleted;


}
