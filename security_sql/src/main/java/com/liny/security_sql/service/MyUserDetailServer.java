package com.liny.security_sql.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.liny.security_sql.config.CustomException;
import com.liny.security_sql.pojo.Role;
import com.liny.security_sql.pojo.Users;
import com.oracle.tools.packager.Log;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linyi
 * @date 2022/8/22
 * 1.0
 */
@Service
public class MyUserDetailServer implements UserDetailsService {
    @Autowired
    private UsersService usersService;
    @Autowired
    private RoleService roleService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //List<Role> list = roleService.list();
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_sale");
        LambdaQueryWrapper<Users> usersLambdaQueryWrapper = new LambdaQueryWrapper<>();
        usersLambdaQueryWrapper.eq(username!=null,Users::getUsername,username);
        Users users = usersService.getOne(usersLambdaQueryWrapper);
        if(users == null){
            throw new CustomException("没有此用户～～");
        }
        return new User(users.getUsername(),new BCryptPasswordEncoder().encode(users.getPassword()),grantedAuthorities);
    }
}
