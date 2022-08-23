package com.liny.security_sql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.security_sql.pojo.Menu;
import com.liny.security_sql.service.MenuService;
import com.liny.security_sql.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author linyi
* @description 针对表【menu】的数据库操作Service实现
* @createDate 2022-08-22 17:18:31
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

}




