package com.mybatis.mapper;

import com.mybatis.entity.PbEmpLeaveBatchItem;
import com.mybatis.entity.PbEmpLeaveBatchItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbEmpLeaveBatchItemMapper {
    int countByExample(PbEmpLeaveBatchItemExample example);

    int deleteByExample(PbEmpLeaveBatchItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(PbEmpLeaveBatchItem record);

    int insertSelective(PbEmpLeaveBatchItem record);

    List<PbEmpLeaveBatchItem> selectByExample(PbEmpLeaveBatchItemExample example);

    PbEmpLeaveBatchItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PbEmpLeaveBatchItem record, @Param("example") PbEmpLeaveBatchItemExample example);

    int updateByExample(@Param("record") PbEmpLeaveBatchItem record, @Param("example") PbEmpLeaveBatchItemExample example);

    int updateByPrimaryKeySelective(PbEmpLeaveBatchItem record);

    int updateByPrimaryKey(PbEmpLeaveBatchItem record);
}