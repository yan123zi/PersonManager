package com.pxxy.personManagement.mapper;

import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.domain.RewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardMapper {
    long countByExample(RewardExample example);

    int deleteByExample(RewardExample example);

    int deleteByPrimaryKey(Integer reRepuid);

    int insert(Reward record);

    int insertSelective(Reward record);

    List<Reward> selectByExample(RewardExample example);

    Reward selectByPrimaryKey(Integer reRepuid);

    int updateByExampleSelective(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByExample(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByPrimaryKeySelective(Reward record);

    int updateByPrimaryKey(Reward record);
    
    List<Reward> selectPageByeId(@Param("eId") Integer eId,@Param("page") int page,@Param("limit") int limit);
}