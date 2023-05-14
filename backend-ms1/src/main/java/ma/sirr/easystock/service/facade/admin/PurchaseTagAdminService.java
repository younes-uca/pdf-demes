package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.PurchaseTag;
import ma.sirr.easystock.dao.criteria.core.PurchaseTagCriteria;
import ma.sirr.easystock.dao.criteria.history.PurchaseTagHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;


public interface PurchaseTagAdminService extends  IService<PurchaseTag,PurchaseTagCriteria, PurchaseTagHistoryCriteria>  {

    List<PurchaseTag> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);
    List<PurchaseTag> findByTagId(Long id);
    int deleteByTagId(Long id);
    Long getNextOrdre();



}
