package com.vip.zh.dao;

import com.vip.zh.pojo.WebSiteDO;

public interface WebSiteDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebSiteDO record);

    int insertSelective(WebSiteDO record);

    WebSiteDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebSiteDO record);

    int updateByPrimaryKey(WebSiteDO record);
}