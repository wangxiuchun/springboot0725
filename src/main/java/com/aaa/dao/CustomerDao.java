package com.aaa.dao;

import com.aaa.entity.Customer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface CustomerDao {
    @Select("select * from customer")
    public List<Map> query();

    @Insert("insert into customer values (#{id},#{customerNo},#{contacts},#{tel},#{address},#{email},#{bank},#{bankAccount})")
    public void addCust(Customer customer);

    @Delete("delete from customer where id=#{id}")
    public void delCust(int id);

    @Update("update customer set customerNo=#{customerNo},contacts=#{contacts},tel=#{tel},address=#{address},email=#{email},bank=#{bank},bankAccount=#{bankAccount}")
    public void updateCust(Customer customer);
}
