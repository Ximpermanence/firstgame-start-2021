package cn.ch.firstgamestart.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 充值现金提升
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="MoneyStrong对象", description="充值现金提升")
public class MoneyStrong implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "现金价格")
    private Integer rmbprice;

    @ApiModelProperty(value = "增加攻击")
    private Integer ad;

    @ApiModelProperty(value = "增加防御")
    private Integer armor;

    @ApiModelProperty(value = "增加生命值")
    private Integer hp;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date modifyDate;

    @ApiModelProperty(value = "修改人")
    private String modifyUser;

    @ApiModelProperty(value = "是否删除 - 1:未删除 0:删除")
    @TableLogic
    private Integer isDeleted;


}
