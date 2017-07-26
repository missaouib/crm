package com.yidatec.mapper;

import com.yidatec.model.Contact;
import com.yidatec.model.Customer;
import com.yidatec.vo.CustomerVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */
@Mapper
public interface CustomerMapper {
    /**
     * 载入客户可列表
     * @return
     */
    @Select("SELECT * FROM T_CUSTOMER WHERE id = #{id}")
    Customer selectCustomer(String id);

    @Select("SELECT * FROM T_CONTACT A INNER JOIN T_CUSTOMER_CONTACT B ON A.id= B.contactId and B.customerId = #{id}")
    List<Contact> selectContact(String id);

    @SelectProvider(type=com.yidatec.mapper.CustomerQueryProvider.class,method = "selectCustomer")
    List<Customer> selectCustomerList(CustomerVO dictionaryVO);

    @SelectProvider(type=com.yidatec.mapper.CustomerQueryProvider.class,method = "countCustomer")
    int countCustomerList(CustomerVO dictionaryVO);

    @Insert("INSERT INTO T_CUSTOMER (id,companyName,companyId,industry,nature,country,province,city,region,address,level,state,creatorId,createTime,modifierId,modifyTime) VALUES (#{id},#{companyName},#{companyId}," +
            "#{industry},#{nature},#{country},#{province},#{city},#{region},#{address},#{level},#{state},#{creatorId},#{createTime},#{modifierId},#{modifyTime})")
    int create(Customer customer);

    @Update("UPDATE T_CUSTOMER SET `companyName`=#{companyName},companyId=#{companyId},industry=#{industry},nature=#{nature}," +
            "country=#{country},province=#{province},city=#{city},region=#{region},address=#{address},level=#{level},region=#{region},state=#{state}," +
            "modifierId=#{modifierId}," +
            "modifyTime=#{modifyTime} WHERE id=#{id}")
    int update(Customer customer);

    @Insert("INSERT INTO T_CONTACT (id,name,mobilePhone,position,email,state,creatorId,createTime,modifierId,modifyTime) VALUES (#{id},#{name},#{mobilePhone},#{position}," +
            "#{email},#{state},#{creatorId},#{createTime},#{modifierId},#{modifyTime})")
    int createContact(Contact contact);

    @Insert("INSERT INTO T_CUSTOMER_CONTACT (customerId,contactId) VALUES (#{customerid},#{contactid})")
    int createRelation(@Param(value="customerid") String customerid,@Param(value="contactid") String contactid);

    @Delete("DELETE FROM T_CONTACT  WHERE id in( SELECT contactId FROM T_CUSTOMER_CONTACT WHERE customerId=#{customerId})")
    int deleteContact(String customerId);

    @Delete("DELETE FROM T_CUSTOMER_CONTACT  WHERE customerId =#{customerId}")
    int deleteRelation(String customerId);
}
