package xiao.ze.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import xiao.ze.demo.entity.Student;
import xiao.ze.demo.mapper.StudentMapper;
import xiao.ze.demo.mapper.UserMapper;

import java.util.List;
import java.util.Map;

/**
 * UserService
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
public interface StudentService {

    @Autowired
    StudentMapper studentMapper=null;
    /**
     * 获取一条学生数据
     *
     * @param  sid
     * @return Student
     *
     */
    List<Student> get(String sid);

    /**
     * 新增一条学生数据
     *
     * @param  uid
     * @param  uname
     * @param  pwd
     * @return User
     *
     */
    void addUser(String uid, String uname, String pwd);

    default List<Map<String,Object>> queryAllStudent(){ return studentMapper.queryAllStudent();}

}

