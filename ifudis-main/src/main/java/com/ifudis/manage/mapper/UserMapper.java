package com.ifudis.manage.mapper;

import com.ifudis.manage.common.mapper.SqlMapper;
import com.ifudis.manage.model.User;

import java.util.List;

/**
 * Created by yxw on 16/3/22.
 */
public interface UserMapper extends SqlMapper {

    public List<User> queryUsers();
}
