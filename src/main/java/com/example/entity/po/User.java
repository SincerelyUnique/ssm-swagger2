package com.example.entity.po;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <code>User</code>
 * </p>
 * Description: 数据库实体
 *
 * @author Mcchu
 * @date 2018/2/5 8:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("数据库用户实体")
public class User {

    private Long id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

}
