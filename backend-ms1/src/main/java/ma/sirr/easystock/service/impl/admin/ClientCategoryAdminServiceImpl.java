package ma.sirr.easystock.service.impl.admin;

import ma.sirr.easystock.bean.core.ClientCategory;
import ma.sirr.easystock.bean.history.ClientCategoryHistory;
import ma.sirr.easystock.dao.criteria.core.ClientCategoryCriteria;
import ma.sirr.easystock.dao.criteria.history.ClientCategoryHistoryCriteria;
import ma.sirr.easystock.dao.facade.core.ClientCategoryDao;
import ma.sirr.easystock.dao.facade.history.ClientCategoryHistoryDao;
import ma.sirr.easystock.dao.specification.core.ClientCategorySpecification;
import ma.sirr.easystock.service.facade.admin.ClientCategoryAdminService;
import ma.sirr.easystock.zynerator.service.AbstractServiceImpl;
import ma.sirr.easystock.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ClientCategoryAdminServiceImpl extends AbstractServiceImpl<ClientCategory,ClientCategoryHistory, ClientCategoryCriteria, ClientCategoryHistoryCriteria, ClientCategoryDao,
ClientCategoryHistoryDao> implements ClientCategoryAdminService {


    public ClientCategory findByReferenceEntity(ClientCategory t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(ClientCategory.class,ClientCategoryHistory.class, ClientCategoryHistoryCriteria.class, ClientCategorySpecification.class);
    }


    public ClientCategoryAdminServiceImpl(ClientCategoryDao dao, ClientCategoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}