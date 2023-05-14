package ma.sirr.easystock.service.impl.admin;

import ma.sirr.easystock.bean.core.Client;
import ma.sirr.easystock.bean.history.ClientHistory;
import ma.sirr.easystock.dao.criteria.core.ClientCriteria;
import ma.sirr.easystock.dao.criteria.history.ClientHistoryCriteria;
import ma.sirr.easystock.dao.facade.core.ClientDao;
import ma.sirr.easystock.dao.facade.history.ClientHistoryDao;
import ma.sirr.easystock.dao.specification.core.ClientSpecification;
import ma.sirr.easystock.service.facade.admin.ClientAdminService;
import ma.sirr.easystock.zynerator.service.AbstractServiceImpl;
import ma.sirr.easystock.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sirr.easystock.service.facade.admin.ClientCategoryAdminService ;


import java.util.List;
@Service
public class ClientAdminServiceImpl extends AbstractServiceImpl<Client,ClientHistory, ClientCriteria, ClientHistoryCriteria, ClientDao,
ClientHistoryDao> implements ClientAdminService {


    @Cacheable(cacheNames = "clients")
    public List<Client> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "clients", key = "#t.id")
    public Client create(Client t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "clients", key = "#t.id")
    public Client update(Client t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "clients", key = "#id")
    public Client findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "clients", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public Client findByReferenceEntity(Client t){
        return  dao.findByEmail(t.getEmail());
    }

    public List<Client> findByClientCategoryId(Long id){
        return dao.findByClientCategoryId(id);
    }
    public int deleteByClientCategoryId(Long id){
        return dao.deleteByClientCategoryId(id);
    }



    public void configure() {
        super.configure(Client.class,ClientHistory.class, ClientHistoryCriteria.class, ClientSpecification.class);
    }

    @Autowired
    private ClientCategoryAdminService clientCategoryService ;

    public ClientAdminServiceImpl(ClientDao dao, ClientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}