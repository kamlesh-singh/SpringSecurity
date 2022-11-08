package com.tothenew.springsecurity.CouponRepo;

import com.tothenew.springsecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);


}
