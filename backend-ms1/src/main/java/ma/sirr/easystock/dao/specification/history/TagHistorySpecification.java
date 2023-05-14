package  ma.sirr.easystock.dao.specification.history;

import ma.sirr.easystock.zynerator.specification.AbstractHistorySpecification;
import ma.sirr.easystock.dao.criteria.history.TagHistoryCriteria;
import ma.sirr.easystock.bean.history.TagHistory;


public class TagHistorySpecification extends AbstractHistorySpecification<TagHistoryCriteria, TagHistory> {

    public TagHistorySpecification(TagHistoryCriteria criteria) {
        super(criteria);
    }

    public TagHistorySpecification(TagHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
