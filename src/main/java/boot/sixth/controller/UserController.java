package boot.sixth.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.sixth.Mapper.UserMapper;
import boot.sixth.dao.UserDao;
import boot.sixth.Domain.User;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/5.
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "根据用户ID获取用户")
    @RequestMapping(value="/findUserById",method = RequestMethod.GET)
    public User findUserById(@RequestParam(value="id") String  id) {
        User user = null;
        try {
            user = userDao.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @ApiOperation(value = "根据用户ID获取用户角色")
    @RequestMapping(value="/findUserRoles",method = RequestMethod.GET)
    public User findUserRoles(@RequestParam(value="id") String  id) {
        User user = null;
        try {
            user = userDao.findUserRoles(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping(value="/findUsers",method = RequestMethod.GET)
    public User[] findUsers( int pageIndex,int pageSize) {
        User[] users = null;
        try {

            int offset=(pageIndex-1)*pageSize;
            Map<String, Integer> data = new HashedMap();
            data.put("offset", offset);
            data.put("pageSize", pageSize);
            users = userDao.findUsers(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    @RequestMapping(value = "/findUserName",method = RequestMethod.GET)
    public String findUserName(@RequestParam(value="id") String  id) {
        String userName = "";
        try {
            userName = userDao.findUserName(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userName;
    }

    @RequestMapping(value= "/updateUser",method = RequestMethod.GET)
    public String updateUser(@RequestParam(value="id") String  id) {
        String userName = "";
        try {
            User user=new User();
            user.setUserId(id);
            user.setUserName("名字"+id);
            userDao.updateUser(user);
            //userName = userDao.findUserName(id);
            userName=user.getUserName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userName;
    }

    @RequestMapping(value="/deleteUser",method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value="id") String  id) {
        String msg = "删除成功";
        try {
            userDao.deleteUser(id);
        } catch (Exception e) {
            msg = "删除失败";
            e.printStackTrace();
        }
        return msg;
    }

    @RequestMapping(value="/insertUser",method = RequestMethod.GET)
    public String insertUser() {
        String msg = "添加成功";
        try {
            User user=new User();
            user.setUserId("123");
            user.setUserName("123");
            user.setEmail("123@qq.com");
            user.setPassword("123456");
            user.setIsAdmin(0);
            user.setIsVerifyLoginIp(1);
            user.setLocked(0);
            userDao.insertUser(user);
        } catch (Exception e) {
            msg = "添加失败";
            e.printStackTrace();
        }
        return msg;
    }

}
