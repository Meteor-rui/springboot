package com.mcy.springbootswagger.controller;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.common.annotations.VisibleForTesting;
import com.mcy.springbootswagger.User.User;
import com.mcy.springbootswagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/user")
//说明接口文件
@Api(value = "测试接口", tags = "用户管理相关的接口", description = "用户测试接口")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 保存数据
     * @param user
     * @return
     */
    @PostMapping(value = "/add")
    //方法参数说明，name参数名；value参数说明，备注；dataType参数类型；required 是否必传；defaultValue 默认值
    @ApiImplicitParam(name = "adduser", value = "新增用户数据")
    //说明是什么方法(可以理解为方法注释)
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public String saveUser(@Valid User user){
        userService.addUser(user);
        return "保存成功";
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping(value = "findById")
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id查询用户信息")
    public User getUser(Integer id){
        return userService.selectUserById(id);
    }

    @DeleteMapping(value = "deleteById")
    @ApiOperation(value = "根据id删除数据", notes = "删除用户")
    public String delete(Integer id){
        userService.deleteUser(id);
        return "删除成功";
    }

    @GetMapping(value = "findAll")
    @ApiOperation(value = "查询现有的全部用户信息",notes = "查询现有的全部用户信息")
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }
}

