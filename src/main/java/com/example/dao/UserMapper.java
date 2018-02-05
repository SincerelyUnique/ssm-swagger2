package com.example.dao;

import com.example.entity.dto.UserInsertDto;
import com.example.entity.dto.UserUpdateDto;
import com.example.entity.po.User;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * <code>UserMapper</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/2/5 8:39
 */
@Repository
public interface UserMapper {

    Integer insert(UserInsertDto insertDto);

    Integer delete(Long id);

    Integer updateSelective(UserUpdateDto user);

    User select(Long id);
}
