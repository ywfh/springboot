package cn.ywfh.springboot.user.service;

import cn.ywfh.springboot.user.model.UserModel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

/**
 * @author 一吻芳华
 * @date 2020/9/21 - 16:32
 */



public interface UserService {

    List<UserModel> getAll(Map map);

    void delById(Integer id);

    void save(UserModel userModel);

    UserModel getUserById(Integer id);

    void updateUserById(UserModel userModel);
}
