package  ma.sirr.easystock.dao.specification.history;

import ma.sirr.easystock.zynerator.specification.AbstractHistorySpecification;
import ma.sirr.easystock.dao.criteria.history.PurchaseHistoryCriteria;
import ma.sirr.easystock.bean.history.PurchaseHistory;


public class PurchaseHistorySpecification extends AbstractHistorySpecification<PurchaseHistoryCriteria, PurchaseHistory> {

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
