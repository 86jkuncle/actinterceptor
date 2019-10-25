package com.example.mapper;

import com.example.entity.Account;
import com.example.entity.Role;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @author Administrator
 * @date 2019/10/25 10:51
 */
public interface AccountMapper extends BaseMapper<Account> {
    Account selectUser(String username);
    Role selectUserRole(Integer userId);
}
