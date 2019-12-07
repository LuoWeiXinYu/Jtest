package xiao.ze.demo.mapper;


import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import xiao.ze.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * UserMapper
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
public interface StudentMapper extends Mapper<User> {
    List<Map<String,Object>> queryAllStudent();
}
