package com.tothenew.springsecurity.Controller;


import com.tothenew.springsecurity.CouponRepo.CouponRepository;
import com.tothenew.springsecurity.Entity.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
    @Autowired
    CouponRepository couponRepository;

    @RequestMapping(value = "/coupons",method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}",method = RequestMethod.GET)
    public Coupon getCoupons(@PathVariable("code") String code){
        return couponRepository.findByCode("SUPERSALE");
    }

}
