package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.PurchaseItem;
import ma.sirr.easystock.dao.criteria.core.PurchaseItemCriteria;
import ma.sirr.easystock.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;


public interface PurchaseItemAdminService extends  IService<PurchaseItem,PurchaseItemCriteria, PurchaseItemHistoryCriteria>  {

    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);



}
