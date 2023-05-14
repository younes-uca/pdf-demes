package  ma.sirr.easystock.dao.specification.history;

import ma.sirr.easystock.zynerator.specification.AbstractHistorySpecification;
import ma.sirr.easystock.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.sirr.easystock.bean.history.PurchaseItemHistory;


public class PurchaseItemHistorySpecification extends AbstractHistorySpecification<PurchaseItemHistoryCriteria, PurchaseItemHistory> {

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
