package com.kpi.compsys.spring.security.userdetails;

import com.kpi.compsys.model.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by Vova on 12/8/2015.
 */
public class SecurityUser extends  org.springframework.security.core.userdetails.User {
    private User user;

    public SecurityUser (User user, Collection<? extends GrantedAuthority> authorities){
        super(user.getEmail(), user.getPassword(), authorities);
        this.user = user;
    }

    private SecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public User getUser(){
        return this.user;
    }
}
