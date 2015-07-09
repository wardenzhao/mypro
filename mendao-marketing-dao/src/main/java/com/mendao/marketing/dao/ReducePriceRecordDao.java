package com.mendao.marketing.dao;

import java.util.List;

import com.mendao.marketing.entity.ReducePriceRecord;

/**
 * 砍价记录日志DAO
 * 
 * @author HarrisonHan
 *
 */
public interface ReducePriceRecordDao {

    /**
     * 根据产品编号，所属人，获取指定记录书的砍价记录信息
     * 
     * @param product_no 产品编号
     * @param owner 所属人
     * @param rows 记录书
     * @return 产品砍价信息记录
     */
    public List<ReducePriceRecord> getReducePriceRecords(String product_no, String owner, int rows);
}
