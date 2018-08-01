package com.hs.server.dao.impl;

import com.hs.server.domain.ConfType;
import com.hs.server.domain.ConfTypeExample;
import org.apache.ibatis.annotations.Param;

public interface ConfTypeMapper {
    int deleteByExample(ConfTypeExample example);

    int deleteByPrimaryKey(String confTypeId);

    int insert(ConfType record);

    int insertSelective(ConfType record);

    ConfType selectByPrimaryKey(String confTypeId);

    int updateByExampleSelective(@Param("record") ConfType record, @Param("example") ConfTypeExample example);

    int updateByExample(@Param("record") ConfType record, @Param("example") ConfTypeExample example);

    int updateByPrimaryKeySelective(ConfType record);

    int updateByPrimaryKey(ConfType record);
}