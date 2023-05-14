package  ma.sirr.easystock.dao.specification.history;

import ma.sirr.easystock.zynerator.specification.AbstractHistorySpecification;
import ma.sirr.easystock.dao.criteria.history.PurchaseTagHistoryCriteria;
import ma.sirr.easystock.bean.history.PurchaseTagHistory;


public class PurchaseTagHistorySpecification extends AbstractHistorySpecification<PurchaseTagHistoryCriteria, PurchaseTagHistory> {

    public PurchaseTagHistorySpecification(PurchaseTagHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseTagHistorySpecification(PurchaseTagHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
