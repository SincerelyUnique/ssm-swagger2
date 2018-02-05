/**
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.entity.dto;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <code>UserVo</code>
 * </p>
 * Description:
 * （1）插入时不需要id，id在mysql数据库已设置自动增长
 * （2）插入时剩余四个字段属性必须有值
 *
 * @author Mcchu
 * @date 2018/2/5 10:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("插入参数")
public class UserInsertDto {

    @ApiModelProperty(value = "账号",required = true)
    private String username;

    @ApiModelProperty(value = "密码",required = true)
    private String password;

    @ApiModelProperty(value = "年龄",required = true)
    private Integer age;

    @ApiModelProperty(value = "性别",required = true)
    private String sex;
}
