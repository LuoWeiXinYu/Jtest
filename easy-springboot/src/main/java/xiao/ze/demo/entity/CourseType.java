package xiao.ze.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * CourseType
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
@Component
@Table(name="tb_type")
public class CourseType implements Serializable{


    @Id
    @Column(name="tid")
    private Integer typeId;

    @Column(name="tname")
    private String  typeName;


    public Integer getTypeId() {
        return typeId;
    }
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    @Override
    public String toString() {
        return "CourseType [typeId=" + typeId + ", typeName=" + typeName + "]";
    }

}
