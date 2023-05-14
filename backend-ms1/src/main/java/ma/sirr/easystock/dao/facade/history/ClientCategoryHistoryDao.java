package ma.sirr.easystock.dao.facade.history;

import ma.sirr.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sirr.easystock.bean.history.ClientCategoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCategoryHistoryDao extends AbstractHistoryRepository<ClientCategoryHistory,Long> {

}
