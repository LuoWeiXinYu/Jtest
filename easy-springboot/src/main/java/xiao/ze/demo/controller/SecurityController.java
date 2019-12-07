package xiao.ze.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import xiao.ze.demo.entity.User;
import xiao.ze.demo.service.UserService;

/**
 * SecurityController
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
@Controller
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String root() {
        return "index";
    }

    @GetMapping("/toLogin")
    public String toLogin(Map<String, Object> map) {

        map.put("user", new User());

        return "login";
    }


    @PostMapping(value = "/login")
    public String login(User user, Map<String, Object> map) {

        if (userService.get(user.getUserNo()) != null) {
            User user1 = userService.get(user.getUserNo());
            if (user1.getUserPwd().equals(user.getUserPwd())) {
                map.put("user", user1);
                return "main";
            }
        }


        return "login";
    }

    @RequestMapping(value = {"/registerpage"})
    public String registerpage() {
        return "register";
    }


    @GetMapping("/mainController")
    public String main() {

        return "main";
    }

    @GetMapping("/logout")
    public String logout() {

        return "redirect:/security/toLogin";

    }


    @RequestMapping(value = {"/uregister"})
    public String addUser(@RequestParam("uid") String uid, @RequestParam("uname") String uname, @RequestParam("pwd") String pwd, @RequestParam("pwd2") String pwd2) {
        if (StringUtils.isEmpty(uid)) {
            return "账号不能为空";
        }
        if (StringUtils.isEmpty(uname)) {
            return "用户名不能为空";
        }

        if (StringUtils.isEmpty(pwd)) {
            return "密码不能为空";
        }

        if (StringUtils.isEmpty(pwd2)) {
            return "确认密码不能为空";
        }

        if (!pwd.equals(pwd2)) {
            return "两次密码不相同，注册失败！！";
            //return birthday.toString();
        }
        userService.addUser(uid,uname,pwd);
        return "registersuccess";
    }
}