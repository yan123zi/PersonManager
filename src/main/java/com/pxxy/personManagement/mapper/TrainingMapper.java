package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Training;
import com.pxxy.personManagement.domain.TrainingExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    long countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExampleWithBLOBs(TrainingExample example);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExampleWithBLOBs(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKeyWithBLOBs(Training record);

    int updateByPrimaryKey(Training record);
    
    List<Training> selectPageByeId(Map map);
}