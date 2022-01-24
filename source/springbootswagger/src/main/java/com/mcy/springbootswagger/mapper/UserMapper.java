package com.mcy.springbootswagger.mapper;

import com.mcy.springbootswagger.User.User;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE ID =#{id}")
    User selectUserById(@Param("id") Integer id);

    @Insert("INSERT INTO USER(ID,NAME,AGE) VALUES(#{id},#{name},#{age})")
    void addUser(User user);

    @Update("UPDATE USER SET NAME =#{name},AGE =#{age} WHERE ID=#{id}")
    void updateUser(User user);

    @Delete("DELETE FROM USER WHERE ID =#{id}")
    int deleteUser(Integer id);

    @Select("SELECT * FROM USER")
    List<User> findAll();
}
