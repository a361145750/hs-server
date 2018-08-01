package com.hs.server.dao.impl;

import com.hs.server.domain.RecordAttch;
import com.hs.server.domain.RecordAttchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordAttchMapper {
    int deleteByPrimaryKey(String recordAttchId);

    int deleteByCustomAndRecord(RecordAttch record);

    int insert(RecordAttch record);

    int insertSelective(RecordAttch record);

    List<RecordAttch> selectByExample(RecordAttchExample example);

    RecordAttch selectByPrimaryKey(String recordAttchId);

    int updateByExampleSelective(@Param("record") RecordAttch record, @Param("example") RecordAttchExample example);

    int updateByExample(@Param("record") RecordAttch record, @Param("example") RecordAttchExample example);

    int updateByPrimaryKeySelective(RecordAttch record);

    int updateByPrimaryKey(RecordAttch record);
}