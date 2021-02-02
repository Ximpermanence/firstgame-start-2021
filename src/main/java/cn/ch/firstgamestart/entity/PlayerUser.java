package cn.ch.firstgamestart.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户属性
 * </p>
 *
 * @author ch
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "PlayerUser对象", description = "用户属性")
@Accessors(chain = true)
public class PlayerUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

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
