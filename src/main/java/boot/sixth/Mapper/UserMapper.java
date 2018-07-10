package boot.sixth.Mapper;

import java.util.List;
import java.util.Map;

import boot.sixth.Domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by Administrator on 2017/5/5.
 */
@Mapper
public interface UserMapper {

    //@Select("SELECT * FROM user where user_id=#{userId} ")
    //@Results({
    //        @Result(property = "userId",  column = "user_id"),
    //        @Result(property = "userName", column = "user_name")
    //})
    User findUserById(String userId);

    User[] findUsers(Map<String,Integer> page);

    //@Select("SELECT user_name FROM user where user_id=#{userId} ")
    String findUserName(@Param("userId") String userId);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(String userId);

    User findUserRoles(String userId);
}
