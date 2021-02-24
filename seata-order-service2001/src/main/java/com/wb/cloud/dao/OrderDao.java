package com.wb.cloud.dao;

import com.wb.cloud.entitles.TOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @ClassName : OrderDao
 * @Author : 王斌
 * @Date : 2020-12-04 21:00
 * @Description
 * @Version
 */
@Mapper
public interface OrderDao {

    @Insert("insert into t_order(user_id,product_id,count,money,status) " +
            "values(#{userId},#{productId},#{count},#{money},#{status})")
    long createOrder(TOrder order);


    @Update("update t_order set status=1 where user_id=#{userId} and status = #{status}")
    int updateOrder(@Param("userId") long userId, @Param("status")int status);
}
