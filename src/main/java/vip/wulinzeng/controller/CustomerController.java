package vip.wulinzeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vip.wulinzeng.pojo.Customer;
import vip.wulinzeng.service.CustomerService;

import java.util.List;

/**
 * @author 22304
 * @date 2020/10/28
 * @project base_ssm
 * @package controller
 * @describe
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView model){
        System.out.println("findAll get in");
        List<Customer> customerList=customerService.findAll();
        System.out.println(customerList);
        model.addObject("customer",customerList);
        model.setViewName("customer_list");
        return  model;
    }


}
