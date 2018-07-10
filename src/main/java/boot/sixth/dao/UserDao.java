package boot.sixth.dao;

import boot.sixth.Mapper.UserMapper;
import boot.sixth.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * Created by Administrator on 2017/5/5.
 */
@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public String findUserName(String id) throws Exception {
        return userMapper.findUserName(id);
    }

    public User findUserById(String id) throws Exception {
        return userMapper.findUserById(id);
    }

    public User[] findUsers(Map<String,Integer> page) throws Exception {
        return userMapper.findUsers(page);
    }

    public void insertUser(User user)throws Exception {
        userMapper.insertUser(user);
    }

    public void updateUser(User user) throws Exception {
        userMapper.updateUser(user);
    }

    public void deleteUser(String id) throws Exception {
        userMapper.deleteUser(id);
    }

    public User findUserRoles(String id) throws Exception {
        return userMapper.findUserRoles(id);
    }
}
