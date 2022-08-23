package com.liny.security_sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.security_sql.pojo.Users;
import com.liny.security_sql.service.UsersService;
import com.liny.security_sql.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【users】的数据库操作Service实现
* @createDate 2022-08-22 17:19:08
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




