package ma.sirr.easystock.dao.facade.history;

import ma.sirr.easystock.zynerator.repository.AbstractHistoryRepository;
import ma.sirr.easystock.bean.history.TagHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TagHistoryDao extends AbstractHistoryRepository<TagHistory,Long> {

}
