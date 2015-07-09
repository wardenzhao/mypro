package com.mendao.marketing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 砍价记录
 * 
 * @author HarrisonHan
 *
 */
@Entity
@Table(name = "atv_reduce_price_record")
public class ReducePriceRecord implements Serializable {

    private static final long serialVersionUID = 4650772824520181816L;

    /**
     * 数据库id
     * 
     */
    @Id
    @GeneratedValue(generator = "identity")
    @GenericGenerator(name = "identity", strategy = "identity")
    @Column(unique = true, nullable = false)
    private Long              id;

    /**
     *  活动商品信息
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product           product;

    /**
     * 砍价时间
     */
    private Date              reduceTime;

    /**
     * 砍价金额
     */
    private BigDecimal        reducePrice;

    /**
     * 砍价操作人
     */
    private String            operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getReduceTime() {
        return reduceTime;
    }

    public void setReduceTime(Date reduceTime) {
        this.reduceTime = reduceTime;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
