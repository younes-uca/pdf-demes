package ma.sirr.easystock.zynerator.service;

import ma.sirr.easystock.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sirr.easystock.zynerator.criteria.BaseCriteria;
import ma.sirr.easystock.zynerator.history.HistBusinessObject;
import ma.sirr.easystock.zynerator.history.HistCriteria;
import ma.sirr.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sirr.easystock.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}