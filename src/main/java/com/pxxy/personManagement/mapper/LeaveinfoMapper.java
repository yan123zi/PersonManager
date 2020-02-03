package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Leaveinfo;
import com.pxxy.personManagement.domain.LeaveinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 	离职的mapper
 * @author 子江
 *
 */
public interface LeaveinfoMapper {
    long countByExample(LeaveinfoExample example);

    int deleteByExample(LeaveinfoExample example);

    int insert(Leaveinfo record);

    int insertSelective(Leaveinfo record);

    List<Leaveinfo> selectByExampleWithBLOBs(LeaveinfoExample example);

    List<Leaveinfo> selectByExample(LeaveinfoExample example);

    int updateByExampleSelective(@Param("record") Leaveinfo record, @Param("example") LeaveinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Leaveinfo record, @Param("example") LeaveinfoExample example);

    int updateByExample(@Param("record") Leaveinfo record, @Param("example") LeaveinfoExample example);
}