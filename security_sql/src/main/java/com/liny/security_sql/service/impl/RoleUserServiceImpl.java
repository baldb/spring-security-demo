package com.liny.security_sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.security_sql.pojo.RoleUser;
import com.liny.security_sql.service.RoleUserService;
import com.liny.security_sql.mapper.RoleUserMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【role_user】的数据库操作Service实现
* @createDate 2022-08-22 17:19:00
*/
@Service
public class RoleUserServiceImpl extends ServiceImpl<RoleUserMapper, RoleUser>
    implements RoleUserService{

}




