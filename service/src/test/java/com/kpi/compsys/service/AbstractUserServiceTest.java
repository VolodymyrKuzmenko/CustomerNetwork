package com.kpi.compsys.service;

import com.kpi.compsys.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

/**
 * Created by Vova on 12/22/2015.
 */
public abstract class AbstractUserServiceTest {

    private static final Logger logger = LogManager.getLogger(AbstractUserServiceTest.class);

    @Autowired
    protected UserService userService;

    @Test
    public void shouldFindAllUsers(){
        List<User> userList = userService.getAll();

        User user1 = userService.getById(1);
        assertThat(user1.getEmail().equalsIgnoreCase(userList.get(0).getEmail()));

        User user4 = userService.getById(4);
        assertThat(user4.getEmail().equalsIgnoreCase(userList.get(3).getEmail()));

    }

    @Test
    public void shouldFindUserByEmail(){
        String email = "admin@gmail.com";

        List<User> actual = userService.getByEmail(email);
        assertThat(actual.size()==1);
        assertThat(actual.get(0).getEmail().equalsIgnoreCase(email));
    }






}
