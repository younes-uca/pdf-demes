package ma.sirr.easystock.service.facade.admin;

import java.util.List;
import ma.sirr.easystock.bean.core.Product;
import ma.sirr.easystock.dao.criteria.core.ProductCriteria;
import ma.sirr.easystock.dao.criteria.history.ProductHistoryCriteria;
import ma.sirr.easystock.zynerator.service.IService;

import ma.sirr.easystock.ws.dto.ProductDto;
import org.springframework.http.HttpEntity;

public interface ProductAdminService extends  IService<Product,ProductCriteria, ProductHistoryCriteria>  {

    Long getNextOrdre();

    HttpEntity<byte[]> createPdf(ProductDto dto) throws Exception;


}
