package com.hunau.service;
import com.hunau.dao.UserDao;
import com.hunau.entity.User;
import com.hunau.dao.UserDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    //用户登录
    public User userLogin(String name,String pwd){
        return userDao.userlogin(name,pwd);
    }

    //注册新用户
    public int adduser(String name, String pwd, String sexy, Date birthday){

        /**
         * 注意查看mapper中的注释
         */
        return userDao.adduser1(name,pwd,sexy,birthday);     //对应sql语句中的第二种注册方式
    }

    //修改用户
    public int updateuser(long id,String name, String pwd, String sexy, Date birthday){
        return userDao.updateuser(id,name,pwd,sexy,birthday);
    }

    //根据id删除用户
    public int deluserid(long id){
        return userDao.deluserid(id);
    }

    //根据name删除用户
    public int delusername(String name){
        return userDao.delusername(name);
    }
    //查询用户列表
    public List<Map<String,Object>> queryAllUser(){
        return userDao.queryAllUser();
    }

    //根据id查询用户列表
    public List<Map<String,Object>> queryUserById(long id){
        return userDao.queryUserById(id);
    }

    //根据name模糊查询用户列表
    public List<Map<String,Object>> queryUserByName(String name){
        return userDao.queryUserByName(name);
    }
}
