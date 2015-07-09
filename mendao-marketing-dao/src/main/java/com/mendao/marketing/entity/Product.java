/**
 * 
 */
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 活动商品信息
 * 
 * @author HarrisonHan
 *
 */
@Entity
@Table(name = "atv_product")
public class Product implements Serializable {

    private static final long serialVersionUID = -5595262894831525761L;

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
     * 活动编码
     */
    @Column(length = 20)
    private String            activityNo;

    /**
     * 活动名称
     */
    @Column(length = 50)
    private String            name;

    /**
     * 活动描述
     */
    @Column(length = 1000)
    private String            description;

    /**
     * 活动课程编号（与91mydoor平台课程id一致）
     */
    private Long              courseId;

    /**
     * 活动课程原始价格
     */
    private BigDecimal        price;

    /**
     * 活动课程当前价格
     */
    private BigDecimal        currentPrice;

    /**
     * 活动所属人
     */
    @Column(length = 20)
    private String            owner;

    /**
     *  砍价活动规则信息
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rule_id")
    private ReducePriceRule   reducePriceRule;

    /**
     * 创建时间
     */
    private Date              createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ReducePriceRule getReducePriceRule() {
        return reducePriceRule;
    }

    public void setReducePriceRule(ReducePriceRule reducePriceRule) {
        this.reducePriceRule = reducePriceRule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

}
