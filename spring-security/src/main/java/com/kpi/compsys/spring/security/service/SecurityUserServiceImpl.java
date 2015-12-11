package com.kpi.compsys.spring.security.service;

import com.kpi.compsys.model.User;
import com.kpi.compsys.model.UserRole;
import com.kpi.compsys.service.UserRoleService;
import com.kpi.compsys.service.UserService;
import com.kpi.compsys.spring.security.userdetails.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vova on 12/7/2015.
 */
@Service
public class SecurityUserServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<User> users = userService.getByEmail(email);
        if (users.size()>2){
            throw new UsernameNotFoundException("two or more equal emails");
        }
        if (users.isEmpty()){
            throw new UsernameNotFoundException("email not found");
        }

        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        User user = users.iterator().next();
        roles.add(new SimpleGrantedAuthority(user.getRole().getRoleName()));

        UserDetails userDetails = new SecurityUser(user,roles);

        return userDetails;
    }

}
