package com.kpi.compsys.spring.security.service;

import com.kpi.compsys.model.User;
import com.kpi.compsys.model.UserRole;
import com.kpi.compsys.service.UserRoleService;
import com.kpi.compsys.service.UserService;
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
        System.out.println("call loadUserByUsername");
        System.out.println(userService);
        List<User> users = userService.getByEmail(email);
        System.out.println("find some users");
        if (users.size()>2){
            System.out.println("two or more equal emails");
            throw new UsernameNotFoundException("two or more equal emails");
        }
        if (users.isEmpty()){
            System.out.println("email not found");
            throw new UsernameNotFoundException("email not found");
        }
        System.out.println("start creating roles");
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        User user = users.iterator().next();
        roles.add(new SimpleGrantedAuthority(user.getRole().getRoleName()));

        System.out.println("create userdetails");
        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getEmail(),
                        user.getPassword(),
                        roles);
        System.out.println("WORK!!!!!!!!!!!");
        return userDetails;
    }

}
