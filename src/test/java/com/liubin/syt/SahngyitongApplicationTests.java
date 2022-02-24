package com.liubin.syt;

import com.liubin.syt.entity.User;
import com.liubin.syt.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SahngyitongApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
    public  void  testAdd(){
        User user=new User();
        user.setAge(212);
        user.setName("upup");
        user.setEmail("1234@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);

    }
    @Test
    public void testUpdate(){
        User user=new User();
        user.setId(12L);
        user.setAge(20);
        user.setName("XIXI");
        user.setEmail("1234@qq.com");
        userMapper.updateById(user);}




}
