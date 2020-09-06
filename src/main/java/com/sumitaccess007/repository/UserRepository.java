package com.sumitaccess007.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    /*
    We are autowiring JDBCTemplate using the properties we have configured in application.properties file
    automatically detects and create the jdbc template object using the configuration
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    /*
    returns list of usernames
    @return usernameList
     */
    public List<String> getAllUserNames() {
        List<String> usernameList = new ArrayList<>();
        usernameList.addAll(jdbcTemplate.queryForList("Select Lname from customers;",String.class));
        return usernameList;
    }
}
