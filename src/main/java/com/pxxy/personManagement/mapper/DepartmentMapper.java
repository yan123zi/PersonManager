package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Department;
import com.pxxy.personManagement.domain.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 	部门的mapper
 * @author 子江
 *
 */
public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    /**
     * 	查询出所有的部门,包括其中的职位
     * @return
     */
    List<Department> selectAllDepartmentWithPosition();
    /**
     * 	查询部门和它的职位通过部门名称
     * @return
     */
    Department selectDepartmentByNameWithPosition(String dName);
}