package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users(username, email, password) VALUES(#{username}, #{email}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    User selectById(Long id);

    @Select("SELECT * FROM users WHERE username = #{username}")
    User selectByUsername(String username);

    @Select("SELECT * FROM users WHERE email = #{email}")
    User selectByEmail(String email);

    @Select("SELECT * FROM users")
    List<User> selectAll();

    @Update("UPDATE users SET username=#{username}, email=#{email}, password=#{password}, status=#{status} WHERE id=#{id}")
    int update(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int delete(Long id);

    // XML 配置的查询方法
    List<User> selectByStatus(@Param("status") Integer status);
}