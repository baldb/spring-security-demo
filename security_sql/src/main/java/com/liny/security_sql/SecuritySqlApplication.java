package com.liny.security_sql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liny.security_sql.mapper")
public class SecuritySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritySqlApplication.class, args);
	}

}
