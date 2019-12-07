package xiao.ze.demo.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * User
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
@Component
@Table(name="tb_user")
public class User implements Serializable{

    @Id
    @Column(name="uid")
    private String userNo;

    @Column(name="uname")
    private String userName;

    @Column(name="pwd")
    private String userPwd;

    @Column(name="remark")
    private boolean remark;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public boolean isRemark() {
        return remark;
    }

    public void setRemark(boolean remark) {
        this.remark = remark;
    }
}
