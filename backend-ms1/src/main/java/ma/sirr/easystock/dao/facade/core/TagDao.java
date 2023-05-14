package ma.sirr.easystock.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sirr.easystock.zynerator.repository.AbstractRepository;
import ma.sirr.easystock.bean.core.Tag;
import org.springframework.stereotype.Repository;
import ma.sirr.easystock.bean.core.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface TagDao extends AbstractRepository<Tag,Long>  {
    Tag findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Tag(item.id,item.reference) FROM Tag item")
    List<Tag> findAllOptimized();
    @Query(value = "SELECT MAX(item.ordre) FROM Tag item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
