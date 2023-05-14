package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.Purchase;
import ma.sirr.easystock.dao.criteria.core.PurchaseCriteria;
import ma.sirr.easystock.dao.criteria.history.PurchaseHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;

import ma.sirr.easystock.ws.dto.PurchaseDto;
import org.springframework.http.HttpEntity;

public interface PurchaseAdminService extends  IService<Purchase,PurchaseCriteria, PurchaseHistoryCriteria>  {

    List<Purchase> findByClientId(Long id);
    int deleteByClientId(Long id);

    HttpEntity<byte[]> createPdf(PurchaseDto dto) throws Exception;


}
