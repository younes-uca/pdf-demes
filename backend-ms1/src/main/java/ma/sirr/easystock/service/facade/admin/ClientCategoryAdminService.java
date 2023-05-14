package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.ClientCategory;
import ma.sirr.easystock.dao.criteria.core.ClientCategoryCriteria;
import ma.sirr.easystock.dao.criteria.history.ClientCategoryHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;


public interface ClientCategoryAdminService extends  IService<ClientCategory,ClientCategoryCriteria, ClientCategoryHistoryCriteria>  {




}
