package com.pxxy.personManagement.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pxxy.personManagement.domain.Admin;
import com.pxxy.personManagement.domain.AdminExample;
/**
 * 	管理员mapper
 * @author 子江
 *
 */
public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    /**
     * 	根据管理员用户名查询记录
     * @param aUsername管理员用户名
     * @return 该用户名对应记录
     */
    public Admin selectAdminByaUsername(String aUsername);
}