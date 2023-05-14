package ma.sirr.easystock.service.impl.admin;

import ma.sirr.easystock.bean.core.PurchaseTag;
import ma.sirr.easystock.bean.history.PurchaseTagHistory;
import ma.sirr.easystock.dao.criteria.core.PurchaseTagCriteria;
import ma.sirr.easystock.dao.criteria.history.PurchaseTagHistoryCriteria;
import ma.sirr.easystock.dao.facade.core.PurchaseTagDao;
import ma.sirr.easystock.dao.facade.history.PurchaseTagHistoryDao;
import ma.sirr.easystock.dao.specification.core.PurchaseTagSpecification;
import ma.sirr.easystock.service.facade.admin.PurchaseTagAdminService;
import ma.sirr.easystock.zynerator.service.AbstractServiceImpl;
import ma.sirr.easystock.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sirr.easystock.service.facade.admin.PurchaseAdminService ;
import ma.sirr.easystock.service.facade.admin.TagAdminService ;


import java.util.List;
@Service
public class PurchaseTagAdminServiceImpl extends AbstractServiceImpl<PurchaseTag,PurchaseTagHistory, PurchaseTagCriteria, PurchaseTagHistoryCriteria, PurchaseTagDao,
PurchaseTagHistoryDao> implements PurchaseTagAdminService {

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "purchaseTags")
    public List<PurchaseTag> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "purchaseTags", key = "#t.id")
    public PurchaseTag create(PurchaseTag t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "purchaseTags", key = "#t.id")
    public PurchaseTag update(PurchaseTag t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "purchaseTags", key = "#id")
    public PurchaseTag findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "purchaseTags", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    public List<PurchaseTag> findByPurchaseId(Long id){
        return dao.findByPurchaseId(id);
    }
    public int deleteByPurchaseId(Long id){
        return dao.deleteByPurchaseId(id);
    }
    public List<PurchaseTag> findByTagId(Long id){
        return dao.findByTagId(id);
    }
    public int deleteByTagId(Long id){
        return dao.deleteByTagId(id);
    }



    public void configure() {
        super.configure(PurchaseTag.class,PurchaseTagHistory.class, PurchaseTagHistoryCriteria.class, PurchaseTagSpecification.class);
    }

    @Autowired
    private PurchaseAdminService purchaseService ;
    @Autowired
    private TagAdminService tagService ;

    public PurchaseTagAdminServiceImpl(PurchaseTagDao dao, PurchaseTagHistoryDao historyDao) {
        super(dao, historyDao);
    }

}