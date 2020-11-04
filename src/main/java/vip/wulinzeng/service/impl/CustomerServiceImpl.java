package vip.wulinzeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.mapper.CustomerMapper;
import vip.wulinzeng.pojo.Customer;
import vip.wulinzeng.service.CustomerService;

import java.util.List;

/**
 * @author 22304
 * @date 2020/10/28
 * @project base_ssm
 * @package service.impl
 * @describe
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        //System.out.println("impl");
        return customerMapper.findAll();
    }
}
