package ma.sirr.easystock.service.impl.admin;

import ma.sirr.easystock.bean.core.PurchaseItem;
import ma.sirr.easystock.bean.history.PurchaseItemHistory;
import ma.sirr.easystock.dao.criteria.core.PurchaseItemCriteria;
import ma.sirr.easystock.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.sirr.easystock.dao.facade.core.PurchaseItemDao;
import ma.sirr.easystock.dao.facade.history.PurchaseItemHistoryDao;
import ma.sirr.easystock.dao.specification.core.PurchaseItemSpecification;
import ma.sirr.easystock.service.facade.admin.PurchaseItemAdminService;
import ma.sirr.easystock.zynerator.service.AbstractServiceImpl;
import ma.sirr.easystock.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sirr.easystock.service.facade.admin.PurchaseAdminService ;
import ma.sirr.easystock.service.facade.admin.ProductAdminService ;


import java.util.List;
@Service
public class PurchaseItemAdminServiceImpl extends AbstractServiceImpl<PurchaseItem,PurchaseItemHistory, PurchaseItemCriteria, PurchaseItemHistoryCriteria, PurchaseItemDao,
PurchaseItemHistoryDao> implements PurchaseItemAdminService {



    public List<PurchaseItem> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseItem> findByPurchaseId(Long id){
        return dao.findByPurchaseId(id);
    }
    public int deleteByPurchaseId(Long id){
        return dao.deleteByPurchaseId(id);
    }



    public void configure() {
        super.configure(PurchaseItem.class,PurchaseItemHistory.class, PurchaseItemHistoryCriteria.class, PurchaseItemSpecification.class);
    }

    @Autowired
    private PurchaseAdminService purchaseService ;
    @Autowired
    private ProductAdminService productService ;

    public PurchaseItemAdminServiceImpl(PurchaseItemDao dao, PurchaseItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}