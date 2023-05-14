package  ma.sirr.easystock.dao.specification.history;

import ma.sirr.easystock.zynerator.specification.AbstractHistorySpecification;
import ma.sirr.easystock.dao.criteria.history.ClientCategoryHistoryCriteria;
import ma.sirr.easystock.bean.history.ClientCategoryHistory;


public class ClientCategoryHistorySpecification extends AbstractHistorySpecification<ClientCategoryHistoryCriteria, ClientCategoryHistory> {

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
