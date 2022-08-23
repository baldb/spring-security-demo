package com.liny.security_sql.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName role_user
 */
@TableName(value ="role_user")
@Data
public class RoleUser implements Serializable {
    /**
     * 
     */
    private Long uid;

    /**
     * 
     */
    private Long rid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}