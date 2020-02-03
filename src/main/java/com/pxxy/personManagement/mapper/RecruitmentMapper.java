package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Recruitment;
import com.pxxy.personManagement.domain.RecruitmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentMapper {
    long countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Recruitment record);

    int insertSelective(Recruitment record);

    List<Recruitment> selectByExampleWithBLOBs(RecruitmentExample example);

    List<Recruitment> selectByExample(RecruitmentExample example);

    Recruitment selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByExampleWithBLOBs(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByPrimaryKeySelective(Recruitment record);

    int updateByPrimaryKeyWithBLOBs(Recruitment record);

    int updateByPrimaryKey(Recruitment record);
}