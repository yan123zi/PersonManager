package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    long countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Integer apId);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExampleWithBLOBs(ApplyExample example);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(Integer apId);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExampleWithBLOBs(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKeyWithBLOBs(Apply record);

    int updateByPrimaryKey(Apply record);
}