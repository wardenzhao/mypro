package com.mendao.marketing.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mendao.marketing.entity.ReducePriceRecord;

/**
 * 砍价记录日志表
 * 
 * @author HarrisonHan
 *
 */
@Repository("reducePriceRecordRepository")
public interface ReducePriceRecordRepository extends CrudRepository<ReducePriceRecord, Long> {

    @Query("select p from ReducePriceRecord p where p.product.id = :product_id and p.operator = :operator")
    public ReducePriceRecord getRecordByProductAndOperator(@Param("product_id") Long product_id,
                                                           @Param("operator") String operator);
}
