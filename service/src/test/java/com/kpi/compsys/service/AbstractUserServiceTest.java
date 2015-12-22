package com.kpi.compsys.service;

import com.kpi.compsys.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * Created by Vova on 12/22/2015.
 */
public abstract class AbstractUserServiceTest {

    private static final Logger logger = LogManager.getLogger(AbstractUserServiceTest.class);

    @Autowired
    protected UserService userService;

    @Test
    public void sholdFindAllUsers(){
    }

    @Test
    public void sholdFindUserByEmail(){

    }

    @Test
    public void sholdFindUserById(){

    }

    @Test
    public void shouldCreateUserByEmailAndPassword(){

    }




}
