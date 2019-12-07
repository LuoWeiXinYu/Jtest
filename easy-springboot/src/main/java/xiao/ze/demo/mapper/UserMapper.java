package xiao.ze.demo.mapper;


import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import xiao.ze.demo.entity.User;

import java.util.Date;

/**
 * UserMapper
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
public interface UserMapper extends Mapper<User> {
    User get(@Param("name") String name,@Param("pwd") String pwd);

    void adduser(@Param("uid") String uid, @Param("uname") String uname, @Param("pwd") String pwd);
}
