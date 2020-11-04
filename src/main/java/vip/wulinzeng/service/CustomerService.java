package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Customer;

import java.util.List;

/**
 * @author 22304
 * @date 2020/10/28
 * @project base_ssm
 * @package service
 * @describe
 */
public interface CustomerService {

    public List<Customer> findAll();
}
