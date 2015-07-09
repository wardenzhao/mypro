package com.mendao.marketing.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mendao.marketing.entity.ReducePriceRule;

/**
 * 砍价活动规则DAO
 * 
 * @author HarrisonHan
 *
 */
@Repository("reducePriceRuleRepository")
public interface ReducePriceRuleRepository extends CrudRepository<ReducePriceRule, Long> {
}
