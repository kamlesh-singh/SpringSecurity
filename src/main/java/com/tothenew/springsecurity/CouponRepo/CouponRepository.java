package com.tothenew.springsecurity.CouponRepo;


import com.tothenew.springsecurity.Entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository  extends JpaRepository<Coupon,Integer> {
     Coupon findByCode(String code);
}
