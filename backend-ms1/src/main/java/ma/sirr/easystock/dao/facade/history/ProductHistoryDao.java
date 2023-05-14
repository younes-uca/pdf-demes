package ma.sirr.easystock.dao.facade.history;

import ma.sirr.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sirr.easystock.bean.history.ProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHistoryDao extends AbstractHistoryRepository<ProductHistory,Long> {

}
