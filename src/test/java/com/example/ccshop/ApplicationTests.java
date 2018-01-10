package com.example.ccshop;

import com.example.ccshop.domain.User;
import com.example.ccshop.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by litiancui on 18/1/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
public class ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUser() throws Exception {

        // 创建3条记录
        userRepository.save(new User("Alina", 11));
        userRepository.save(new User("Lisa", 18));
        userRepository.save(new User("Tina", 12));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(3, userRepository.findAll().size());

        // 测试findByName, 查询姓名为Lisa的User
        Assert.assertEquals(18, userRepository.findByName("Lisa").getAge().longValue());

        // 测试findUser, 查询姓名为Lisa的User
        Assert.assertEquals(18, userRepository.findUser("Lisa").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为Lisa并且年龄为18的User
        Assert.assertEquals("Lisa", userRepository.findByNameAndAge("Lisa", 18).getName());

        // 测试删除姓名为Alina的User
        userRepository.delete(userRepository.findByName("Alina"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(2, userRepository.findAll().size());

    }
}
