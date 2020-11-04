package vip.wulinzeng.mapper;

import vip.wulinzeng.pojo.Customer;

import java.util.List;

/**
 * @author 22304
 * @date 2020/10/28
 * @project base_ssm
 * @package mapper
 * @describe
 */
public interface CustomerMapper {
    public List<Customer> findAll();
}
