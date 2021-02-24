package com.wb.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @ClassName : StorageDAO
 * @Author : 王斌
 * @Date : 2020-12-04 21:32
 * @Description
 * @Version
 */
@Mapper
public interface StorageDAO {

    @Update("update t_storage set used = used + #{count},residue = residue - #{count} where product_id=#{productId}")
    int decrease(@Param("productId") long productId, @Param("count") int count);
}
