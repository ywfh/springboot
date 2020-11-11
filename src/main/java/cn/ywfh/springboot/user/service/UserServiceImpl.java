package cn.ywfh.springboot.user.service;

import cn.ywfh.springboot.user.dao.UserDao;
import cn.ywfh.springboot.user.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 一吻芳华
 * @date 2020/9/21 - 16:33
 */


@Service
public class UserServiceImpl implements UserService {
     @Autowired
    UserDao userDao;

    @Override
    public List<UserModel> getAll(Map map) {
        List<UserModel> all = userDao.getAll(map);
        return all;
    }

    @Override
    public void delById(Integer id) {

    userDao.delById(id);

    }

    @Override
    public void save(UserModel userModel) {
    userModel.setCreatetime(new Date());
    userModel.setStatus(1);
    userDao.save(userModel);
    }

    @Override
    public UserModel getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUserById(UserModel userModel) {
         userDao.updateUserById(userModel);
    }
}
