package com.mybatis.mapper;

import com.mybatis.entity.PbEmpLeaveBatch;
import com.mybatis.entity.PbEmpLeaveBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbEmpLeaveBatchMapper {
    int countByExample(PbEmpLeaveBatchExample example);

    int deleteByExample(PbEmpLeaveBatchExample example);

    int insert(PbEmpLeaveBatch record);

    int insertSelective(PbEmpLeaveBatch record);

    List<PbEmpLeaveBatch> selectByExample(PbEmpLeaveBatchExample example);

    int updateByExampleSelective(@Param("record") PbEmpLeaveBatch record, @Param("example") PbEmpLeaveBatchExample example);

    int updateByExample(@Param("record") PbEmpLeaveBatch record, @Param("example") PbEmpLeaveBatchExample example);
}