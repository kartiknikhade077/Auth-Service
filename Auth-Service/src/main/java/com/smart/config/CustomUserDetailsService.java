package com.smart.config;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.smart.entity.User;
import com.smart.helper.SoftwareValidityExpiredException;
import com.smart.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.getUserByUserName(username);
        LocalDate currentDate = LocalDate.now();
        
        
		if (user == null) {
			throw new UsernameNotFoundException("user not found of email");
		}else if (user != null && "ROLE_COMPANY".equals(user.getRole()) && currentDate.isAfter(user.getExpirayDate())) {
			throw new SoftwareValidityExpiredException("Your Subcription is Expired, Please Get Subcription");
		}else if (user != null && "ROLE_EMP".equals(user.getRole()) && currentDate.isAfter(user.getExpirayDate())) {
			throw new SoftwareValidityExpiredException("Your Company Subcription is Expired");
		}else if (user != null && "ROLE_EMP".equals(user.getRole()) && user.isEnabled()== true) {
			throw new SoftwareValidityExpiredException("Access Denied, Please Contact To Your Company");
		}
        CustomUserDetails customUserDetail = new CustomUserDetails(user);

		return customUserDetail;
    }
}
