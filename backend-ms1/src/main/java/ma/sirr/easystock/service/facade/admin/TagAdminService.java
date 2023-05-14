package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.Tag;
import ma.sirr.easystock.dao.criteria.core.TagCriteria;
import ma.sirr.easystock.dao.criteria.history.TagHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;


public interface TagAdminService extends  IService<Tag,TagCriteria, TagHistoryCriteria>  {

    Long getNextOrdre();



}
