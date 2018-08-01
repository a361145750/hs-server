package com.hs.server.dao.impl;

import com.hs.server.domain.File;
import com.hs.server.domain.FileExample;
import org.apache.ibatis.annotations.Param;

public interface FileMapper {
    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(Long fileId);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Long fileId);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}