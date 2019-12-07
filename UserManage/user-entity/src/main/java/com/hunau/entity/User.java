package com.hunau.entity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(length=40)
    private String name;
    @Column(length=50)
    private String pwd;
    @Column(length = 4)
    private String sexy;
    private Date birthday;
    private int age;
    private boolean isuse;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd==null?null:pwd.trim();
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean remark) {
        this.isuse = isuse;
    }

    @Override
    public String toString() {
        LocalDateTime dt = LocalDateTime.now();
        return "User{" +
                "编号=" + id +
                ", 姓名='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sexy='" + sexy + '\'' +
                ", birthday=" +String.format("%tF",birthday) +
                ",age="+ age+
                // ",age="+ (dt.getYear())+
                ", isuse=" + isuse +
                '}';
    }
}
