package xiao.ze.demo.mapper;

import tk.mybatis.mapper.common.Mapper;
import xiao.ze.demo.entity.CourseType;

/**
 * CourseTypeMapper
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
public interface CourseTypeMapper extends Mapper<CourseType> {

    /**
     * 删除一条课程类型记录
     *
     * @param typeId
     *
     */
    void removeCourseType(Integer typeId);

}

