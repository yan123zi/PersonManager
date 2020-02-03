package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Talent;
import com.pxxy.personManagement.domain.TalentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalentMapper {
    long countByExample(TalentExample example);

    int deleteByExample(TalentExample example);

    int deleteByPrimaryKey(Integer taId);

    int insert(Talent record);

    int insertSelective(Talent record);

    List<Talent> selectByExample(TalentExample example);

    Talent selectByPrimaryKey(Integer taId);

    int updateByExampleSelective(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByExample(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByPrimaryKeySelective(Talent record);

    int updateByPrimaryKey(Talent record);
}