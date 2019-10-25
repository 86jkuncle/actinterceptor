package com.example.mapper;

import com.example.entity.Permissions;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/25 16:05
 */
public interface PermissionsMapper extends BaseMapper<Permissions> {
    List<Permissions> selectPermissions(String username);
}
