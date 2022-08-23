package com.liny.security_sql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.xml.ws.http.HTTPException;

/**
 * @author linyi
 * @date 2022/8/22
 * 1.0
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置没有权限跳转的页面
        http.exceptionHandling().accessDeniedPage("/unauth.html");
        //作用：自动跳转到我们自定义的登陆页面，不用系统自带的
        http.formLogin()
                //登陆页面设置
                .loginPage("/login.html")
                //登陆访问的路径，即跳到那个controller中
                .loginProcessingUrl("/user/login")
                //登陆成功后跳转到那个页面
                .defaultSuccessUrl("/index").permitAll()
                //定义哪些url被保护 / 不被保护
                .and().authorizeHttpRequests()
                    .antMatchers("/","/test","/user/login").permitAll() //设置哪些路径不需要登陆，可以直接访问
                //当前登陆用户只有具有admins权限才可以访问这个路径
                .antMatchers("/index").hasAuthority("admins")
                //可以支持多身份权限访问的路径
                .antMatchers("/find").hasAnyAuthority("admins","users")
                //
                .antMatchers("/sale/**").hasRole("sale")
                //除上面哪些请求不需要验证，其他都需要验证
                .anyRequest().authenticated()
                //关闭防护措施
                .and().csrf().disable();

    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
