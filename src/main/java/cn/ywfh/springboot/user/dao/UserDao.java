package cn.ywfh.springboot.user.dao;

import cn.ywfh.springboot.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 一吻芳华
 * @date 2020/9/21 - 16:34
 */

@Mapper
@Repository
public interface UserDao {

    List<UserModel> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(UserModel userModel);

    UserModel getUserById(Integer id);

    void updateUserById(UserModel userModel);
}
