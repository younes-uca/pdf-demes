package ma.sirr.easystock.dao.facade.history;

import ma.sirr.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sirr.easystock.bean.history.PurchaseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseHistoryDao extends AbstractHistoryRepository<PurchaseHistory,Long> {

}
