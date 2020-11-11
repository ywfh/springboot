package cn.ywfh.springboot.user.controller;

import cn.ywfh.springboot.user.model.UserModel;
import cn.ywfh.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 一吻芳华
 * @date 2020/9/21 - 16:29
 * RestController  ==@ResponseBody+@Controller
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserModel> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id ){
        userService.delById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/save")
    public String save( UserModel userModel){
        userService.save(userModel);
        return "redirect:/index.html";
    }

    //查询用户数据
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserModel getUserById(Integer id){
        UserModel userById = userService.getUserById(id);
        return userById;
    }
//根据ID修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(UserModel userModel){
        userService.updateUserById(userModel);
        return "success";
    }


}
