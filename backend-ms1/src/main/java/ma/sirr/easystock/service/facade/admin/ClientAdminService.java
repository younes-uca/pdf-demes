package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.Client;
import ma.sirr.easystock.dao.criteria.core.ClientCriteria;
import ma.sirr.easystock.dao.criteria.history.ClientHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;


public interface ClientAdminService extends  IService<Client,ClientCriteria, ClientHistoryCriteria>  {

    List<Client> findByClientCategoryId(Long id);
    int deleteByClientCategoryId(Long id);



}
