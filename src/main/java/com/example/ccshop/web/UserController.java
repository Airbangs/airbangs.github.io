package com.example.ccshop.web;

import com.example.ccshop.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ccshop.domain.User;

import java.util.*;

import org.springframework.web.bind.annotation.*;

/**
 * Created by litiancui on 18/1/8.
 */
@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

//    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

//    @RequestMapping(value="/", method=RequestMethod.GET)
//    public List<User> getUserList() {
//        // 处理"/users/"的GET请求，用来获取用户列表
//        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<User> r = new ArrayList<User>(users.values());
//        return r;
//    }

    //验证是否能正常访问该controller
//    @RequestMapping(value = "/")
//    public String index()
//    {
//        return "hello";
//    }

    @RequestMapping(value={""}, method=RequestMethod.GET)
    public List<User> getUserList() {
        //List<User> r = new ArrayList<User>(users.values());

        // 测试findAll, 查询所有记录
        List<User> user = userRepository.findAll();
        return user;
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public User postUser(@RequestBody User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
//        users.put(user.getId(), user);
        User u = userRepository.save(new User(
                user.getName(),
                user.getAge()
        ));

        return u;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        User u = userRepository.findOne(id);

        return u;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public User putUser(@PathVariable Long id, @RequestBody User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User u = userRepository.save(new User(
                id,
                user.getName(),
                user.getAge()
        ));

        return u;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        userRepository.delete(id);
        return "success";
    }

}

