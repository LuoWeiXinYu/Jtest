package xiao.ze.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xiao.ze.demo.entity.Student;
import xiao.ze.demo.mapper.StudentMapper;
import xiao.ze.demo.service.StudentService;

import java.util.List;
import java.util.Map;
/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/2 15:39
 * @开发版本：综合练习V0.1
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    public List<Map<String,Object>> queryAllStudent(){
        return studentMapper.queryAllStudent();
    }

    @Override
    public List<Student> get(String sid) {
        return null;
    }

    @Override
    public void addUser(String uid, String uname, String pwd) {

    }
}
