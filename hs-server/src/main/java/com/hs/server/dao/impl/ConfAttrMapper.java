package com.hs.server.dao.impl;

import com.hs.server.domain.ConfAttr;
import com.hs.server.domain.ConfAttrExample;
import org.apache.ibatis.annotations.Param;

public interface ConfAttrMapper {
    int deleteByExample(ConfAttrExample example);

    int deleteByPrimaryKey(String confId);

    int insert(ConfAttr record);

    int insertSelective(ConfAttr record);

    ConfAttr selectByPrimaryKey(String confId);

    int updateByExampleSelective(@Param("record") ConfAttr record, @Param("example") ConfAttrExample example);

    int updateByExample(@Param("record") ConfAttr record, @Param("example") ConfAttrExample example);

    int updateByPrimaryKeySelective(ConfAttr record);

    int updateByPrimaryKey(ConfAttr record);
}