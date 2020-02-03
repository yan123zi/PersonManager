package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Position;
import com.pxxy.personManagement.domain.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 	职位的mapper
 * @author 子江
 *
 */
public interface PositionMapper {
    long countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}