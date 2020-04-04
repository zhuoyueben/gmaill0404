package com.zhuoyueben.gmailuser.dao;

import com.zhuoyueben.gmailuser.entity.Hr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description
 * @Author TeaBen
 * @Date 2020-04-04 12:25
 */

public interface UserDao extends Mapper<Hr> {

    List<Hr> selectAllUser();
}
