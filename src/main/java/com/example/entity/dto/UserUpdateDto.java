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
 *
 * @author Mcchu
 * @date 2018/2/5 10:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("更新参数")
public class UserUpdateDto {

    // 更新时必须带有id
    @ApiModelProperty(value = "账号",required = true)
    private Long id;

    // required属性默认为false
    @ApiModelProperty(value = "账号",required = false)
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "性别")
    private String sex;
}
