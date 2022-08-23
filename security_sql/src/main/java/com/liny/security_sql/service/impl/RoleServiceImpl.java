package com.liny.security_sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.security_sql.pojo.Role;
import com.liny.security_sql.service.RoleService;
import com.liny.security_sql.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【role】的数据库操作Service实现
* @createDate 2022-08-22 17:18:45
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




