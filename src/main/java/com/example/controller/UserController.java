package com.example.controller;

import com.example.dao.UserMapper;
import com.example.entity.dto.UserInsertDto;
import com.example.entity.dto.UserUpdateDto;
import com.example.entity.po.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * <code>UserController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/2/5 8:37
 */
@RestController
@RequestMapping("user")
@Api(value="user", description="Operations on Controller", position = 1)
public class UserController {

    private UserMapper userMapper;

    @Autowired
    public UserController( UserMapper userMapper ){
        this.userMapper = userMapper;
    }

    @PostMapping("add")
    @ApiOperation(value = "添加一个用户" , httpMethod = "POST")
    public ResponseEntity<Integer> add(@RequestBody UserInsertDto user){
        Integer result = userMapper.insert(user);
        return new ResponseEntity<Integer>(result, HttpStatus.OK);
    }

    @DeleteMapping("delete")
    @ApiOperation(value = "删除一个用户" , httpMethod = "DELETE")
    public ResponseEntity<Integer> delete(Long id){
        Integer result = userMapper.delete(id);
        return new ResponseEntity<Integer>(result,HttpStatus.OK);
    }

    @PostMapping("updateSelective")
    @ApiOperation(value = "更新一个用户" , httpMethod = "POST")
    public ResponseEntity<Integer> updateSelective(@RequestBody UserUpdateDto user){
        Integer result = userMapper.updateSelective(user);
        return new ResponseEntity<Integer>(result,HttpStatus.OK);
    }

    @GetMapping("select")
    @ApiOperation(value = "查询一个用户" , httpMethod = "GET")
    public ResponseEntity<User> select(Long id){
        User result = userMapper.select(id);
        return new ResponseEntity<User>(result,HttpStatus.OK);
    }
}
