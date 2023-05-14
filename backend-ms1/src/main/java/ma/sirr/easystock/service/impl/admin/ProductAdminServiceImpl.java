package ma.sirr.easystock.service.impl.admin;

import ma.sirr.easystock.bean.core.Product;
import ma.sirr.easystock.bean.history.ProductHistory;
import ma.sirr.easystock.dao.criteria.core.ProductCriteria;
import ma.sirr.easystock.dao.criteria.history.ProductHistoryCriteria;
import ma.sirr.easystock.dao.facade.core.ProductDao;
import ma.sirr.easystock.dao.facade.history.ProductHistoryDao;
import ma.sirr.easystock.dao.specification.core.ProductSpecification;
import ma.sirr.easystock.service.facade.admin.ProductAdminService;
import ma.sirr.easystock.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sirr.easystock.zynerator.util.VelocityPdf;
import ma.sirr.easystock.ws.dto.ProductDto;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@Service
public class ProductAdminServiceImpl extends AbstractServiceImpl<Product,ProductHistory, ProductCriteria, ProductHistoryCriteria, ProductDao,
ProductHistoryDao> implements ProductAdminService {
    public static final String TEMPLATE = "template/product.vm";
    public static final String FILE_NAME = "product.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ProductDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "products")
    public List<Product> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "products", key = "#t.id")
    public Product create(Product t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "products", key = "#t.id")
    public Product update(Product t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "products", key = "#id")
    public Product findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "products", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public Product findByReferenceEntity(Product t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Product.class,ProductHistory.class, ProductHistoryCriteria.class, ProductSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ProductAdminServiceImpl(ProductDao dao, ProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}