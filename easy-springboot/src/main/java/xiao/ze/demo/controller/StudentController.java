package xiao.ze.demo.controller;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/2 15:37
 * @开发版本：综合练习V0.1
 */

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xiao.ze.demo.entity.Student;
import xiao.ze.demo.service.StudentService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/list"})
    public String showStudent(Model model){
        model.addAttribute("student",studentService.queryAllStudent());
                return "student/list_student";
    }

}
