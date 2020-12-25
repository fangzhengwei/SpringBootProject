package com.example.demo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    /**
     * 查询全部用户
     * @return
     */
    @GetMapping("/getAllUser")
    @ResponseBody
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        list = userRepository.findAll();
        return list;
    }

    /**
     * 插入新用户
     * @param name 用户名
     * @param passWord 密码
     * @return
     */
    @GetMapping("/getByUserName")
    @ResponseBody
    public Boolean getByUserName(@RequestParam String name, @RequestParam String passWord) {
//        User user = userRepository.findByUserName(name);
        LOG.warn(name);
        LOG.warn(passWord);
        User user1 = User.toUser(name, passWord);
        user1.setId(5);
        userRepository.save(user1);
        return true;
    }

    /**
     * 根据id删除用户
     * @param id 用户id
     * @return
     */
    @GetMapping("/deleteById")
    @ResponseBody
    public Boolean deleteById(@RequestParam int id) {
        LOG.warn(String.valueOf(id));
        userRepository.deleteById(id);
        return true;
    }
}
