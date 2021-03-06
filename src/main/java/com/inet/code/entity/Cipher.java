package com.inet.code.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author HCY
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbl_cipher")
public class Cipher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密码的uuid
     */
    @TableId(value = "cipher_uuid",type = IdType.UUID)
    private String cipherUuid;

    /**
     * 用户的学号
     */
    @TableField(value = "cipher_number")
    private String cipherNumber;

    /**
     * 用户的密码
     */
    @TableField(value = "cipher_password")
    private String cipherPassword;

    /**
     * 创建时间
     */
    @TableField(value = "cipher_creation")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cipherCreation;

    /**
     * 修改时间
     */
    @TableField(value = "cipher_modification",update = "NOW()",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cipherModification;


}
