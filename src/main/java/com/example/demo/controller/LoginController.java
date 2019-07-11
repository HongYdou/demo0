package com.example.demo.controller;

import com.example.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * post+application/x-www-form-urlencoded+参数
     * @param name
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam("name") String name){

        System.out.print(name);
        return name;

    }

    /**
     * post+application/x-www-form-urlencoded+bean
     * @param user
     * @return
     * 前端参数与bean属性一致，直接封装到bean
     */
    @RequestMapping("/login1")
    public String login1(User user){

        System.out.println(user);
        System.out.println(user.toString());
        return user.toString();

    }

    /**
     *post+application/x-www-form-urlencoded+kong
     * @param id name
     * @return
     * 前端参数与方法参数一致，能获取数据
     */
    @RequestMapping("/login2")
    public String login2(Integer id ,String name){

        System.out.print(id+name);
        return id+name;

    }

    /**
     * post+application/json+参数
     * @param name
     * @return
     * 报错
     */
    @RequestMapping("/login3")
    public String login3(@RequestParam("id") Integer id ,@RequestParam("name") String name){

        System.out.print(id+name);
        return id+name;

    }

    /**
     * post+application/json+kong
     * @param id name
     * @return
     * 全部为null
     */
    @RequestMapping("/login4")
    public String login4(Integer id ,String name){

        System.out.print(id+name);
        return id+name;

    }
    /**
     * post+application/json+bean
     * @param user
     * @return
     * user属性全为null
     */
    @RequestMapping("/login5")
    public String login5(User user){

        System.out.print(user.toString());
        return user.toString();

    }
    /**
     * post+application/json+@RequestBody+bean
     * @param user
     * @return
     * 接收正常
     */
    @RequestMapping("/login6")
    public String login6(@RequestBody User user){

        System.out.print(user.toString());
        return user.toString();

    }
    /**
     * post+application/json+@RequestBody+参数
     * @param name
     * @return
     * 接收正常
     */
    @RequestMapping("/login7")
    public String login7(@RequestBody String name){

        System.out.print(name);
        return name;

    }

    /**
     * get
     * @param id
     * @param name
     * @return
     */
    @RequestMapping("/login8")
    public String login8(Integer id,String name){
        System.out.print(id+name);
        return id+name;
    }

    @RequestMapping(value = "/login9",method = RequestMethod.GET)
    public String login9(){
        logger.debug("dsdsdsdsdsdsd");
        logger.info("login9");
        logger.error("loggggggg");
        return "hello";
    }
}
