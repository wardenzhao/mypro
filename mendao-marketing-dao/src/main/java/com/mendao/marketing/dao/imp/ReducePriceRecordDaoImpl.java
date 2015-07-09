package com.mendao.marketing.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mendao.marketing.dao.ReducePriceRecordDao;
import com.mendao.marketing.entity.ReducePriceRecord;

@Repository("reducePriceRecordDaoImpl")
public class ReducePriceRecordDaoImpl implements ReducePriceRecordDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ReducePriceRecord> getReducePriceRecords(String product_no, String owner, int rows) {
        String sql = "select p from ReducePriceRecord p where p.product.activityNo = ?1 and p.product.owner=  ?2   order by p.reduceTime desc";
        Query query = em.createQuery(sql);
        query.setParameter(1, product_no);
        query.setParameter(2, owner);
        query.setMaxResults(rows);
        return query.getResultList();
    }

}
