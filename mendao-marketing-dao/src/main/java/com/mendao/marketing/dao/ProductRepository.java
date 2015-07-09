package com.mendao.marketing.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mendao.marketing.entity.Product;

/**
 * 活动产品信息DAO
 * 
 * @author HarrisonHan
 *
 */
@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Long> {

    /**
     * 根据活动产品编号获取产品信息
     * 
     * @param product_no 活动产品编号
     * @param owner 所属人
     * @return  活动产品信息
     */
    @Query("select p from Product p where p.activityNo = :product_no and p.owner = :owner")
    public Product findProductByNo(@Param("product_no") String product_no,
                                   @Param("owner") String owner);
}
