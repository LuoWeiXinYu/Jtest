package xiao.ze.demo.entity;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/2 15:44
 * @开发版本：综合练习V0.1
 */

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Component
@Table(name="tb_stu")
public class Student {

    @Id
    private String sid;

    private String sname;
    private String sexy;
    private String sidcard;
    private String stel;
    private String swechat;
    private String sqq;
    private String saddress;
    private String sparent;
    private String sptel;
    private Date gradtime;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public String getSidcard() {
        return sidcard;
    }

    public void setSidcard(String sidcard) {
        this.sidcard = sidcard;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public String getSwechat() {
        return swechat;
    }

    public void setSwechat(String swechat) {
        this.swechat = swechat;
    }

    public String getSqq() {
        return sqq;
    }

    public void setSqq(String sqq) {
        this.sqq = sqq;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSparent() {
        return sparent;
    }

    public void setSparent(String sparent) {
        this.sparent = sparent;
    }

    public String getSptel() {
        return sptel;
    }

    public void setSptel(String sptel) {
        this.sptel = sptel;
    }

    public Date getGradtime() {
        return gradtime;
    }

    public void setGradtime(Date gradtime) {
        this.gradtime = gradtime;
    }

    @Override
    public String toString() {
        LocalDateTime dt = LocalDateTime.now();
        return "Student{" +
                "编号=" + sid +
                ",姓名=" + sname +
                ",性别=" + sexy +
                ",身份证=" + sidcard +
                ",电话=" + stel +
                ",微信=" + swechat +
                ",QQ=" + sqq +
                ",家庭住址=" + saddress +
                ",父母姓名=" + sparent +
                ",父母电话=" + sptel +
                "，毕业日期=" + String.format("%tF", gradtime) +
                '}';

    }
}
