package ma.sirr.easystock.workflow.admin.process.purchase.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sirr.easystock.zynerator.util.ListUtil;


import ma.sirr.easystock.ws.converter.PurchaseTagConverter;
import ma.sirr.easystock.ws.converter.PurchaseItemConverter;
import ma.sirr.easystock.ws.converter.ClientConverter;
import ma.sirr.easystock.ws.converter.ProductConverter;
import ma.sirr.easystock.ws.converter.TagConverter;
import ma.sirr.easystock.zynerator.util.StringUtil;
import ma.sirr.easystock.zynerator.process.AbstractProcessConverter;
import ma.sirr.easystock.zynerator.util.DateUtil;
import ma.sirr.easystock.bean.core.Purchase;

@Component
public class PurchaseDeleteAdminConverter extends AbstractProcessConverter<PurchaseDeleteAdminInput,PurchaseDeleteAdminOutput,Purchase> {

    @Autowired
    private PurchaseTagConverter purchaseTagConverter ;
    @Autowired
    private PurchaseItemConverter purchaseItemConverter ;
    @Autowired
    private ClientConverter clientConverter ;
    @Autowired
    private ProductConverter productConverter ;
    @Autowired
    private TagConverter tagConverter ;
    private boolean client;
    private boolean purchaseItems;
    private boolean purchaseTag;

    public PurchaseDeleteAdminConverter(){
        super(Purchase.class, PurchaseDeleteAdminInput.class, PurchaseDeleteAdminOutput.class);
    }

    @Override
    public Purchase toItem(PurchaseDeleteAdminInput input) {
        if (input == null) {
            return null;
        } else {
            Purchase item = new Purchase();
            if(StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if(StringUtil.isNotEmpty(input.getReference()))
                item.setReference(input.getReference());
            if(StringUtil.isNotEmpty(input.getPurchaseDate()))
                item.setPurchaseDate(DateUtil.stringEnToDate(input.getPurchaseDate()));
            if(StringUtil.isNotEmpty(input.getImage()))
                item.setImage(input.getImage());
            if(StringUtil.isNotEmpty(input.getTotal()))
                item.setTotal(input.getTotal());
            if(StringUtil.isNotEmpty(input.getDescription()))
                item.setDescription(input.getDescription());
            if(this.client && input.getClient()!=null)
                item.setClient(clientConverter.toItem(input.getClient())) ;


            if(this.purchaseItems && ListUtil.isNotEmpty(input.getPurchaseItems()))
                item.setPurchaseItems(purchaseItemConverter.toItem(input.getPurchaseItems()));
            if(this.purchaseTag && ListUtil.isNotEmpty(input.getPurchaseTag()))
                item.setPurchaseTag(purchaseTagConverter.toItem(input.getPurchaseTag()));

        return item;
        }
    }

    @Override
    public PurchaseDeleteAdminOutput toOutput(Purchase item) {
        if (item == null) {
            return null;
        } else {
            PurchaseDeleteAdminOutput output = new PurchaseDeleteAdminOutput();
            if(StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                output.setReference(item.getReference());
            if(item.getPurchaseDate()!=null)
                output.setPurchaseDate(DateUtil.dateTimeToString(item.getPurchaseDate()));
            if(StringUtil.isNotEmpty(item.getImage()))
                output.setImage(item.getImage());
            if(StringUtil.isNotEmpty(item.getTotal()))
                output.setTotal(item.getTotal());
            if(StringUtil.isNotEmpty(item.getDescription()))
                output.setDescription(item.getDescription());
            if(this.client && item.getClient()!=null) {
                output.setClient(clientConverter.toDto(item.getClient())) ;
    }
        if(this.purchaseItems && ListUtil.isNotEmpty(item.getPurchaseItems())){
            purchaseItemConverter.init(true);
            purchaseItemConverter.setPurchase(false);
            output.setPurchaseItems(purchaseItemConverter.toDto(item.getPurchaseItems()));
            purchaseItemConverter.setPurchase(true);

        }
        if(this.purchaseTag && ListUtil.isNotEmpty(item.getPurchaseTag())){
            purchaseTagConverter.init(true);
            purchaseTagConverter.setPurchase(false);
            output.setPurchaseTag(purchaseTagConverter.toDto(item.getPurchaseTag()));
            purchaseTagConverter.setPurchase(true);

        }
        return output;
    }
}



    public PurchaseTagConverter getPurchaseTagConverter(){
        return this.purchaseTagConverter;
    }
    public void setPurchaseTagConverter(PurchaseTagConverter purchaseTagConverter ){
        this.purchaseTagConverter = purchaseTagConverter;
    }
    public PurchaseItemConverter getPurchaseItemConverter(){
        return this.purchaseItemConverter;
    }
    public void setPurchaseItemConverter(PurchaseItemConverter purchaseItemConverter ){
        this.purchaseItemConverter = purchaseItemConverter;
    }
    public ClientConverter getClientConverter(){
        return this.clientConverter;
    }
    public void setClientConverter(ClientConverter clientConverter ){
        this.clientConverter = clientConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public TagConverter getTagConverter(){
        return this.tagConverter;
    }
    public void setTagConverter(TagConverter tagConverter ){
        this.tagConverter = tagConverter;
    }


    public boolean  isClient(){
        return this.client;
    }
    public void  setClient(boolean client){
        this.client = client;
    }
    public boolean  isPurchaseItems(){
        return this.purchaseItems ;
    }
    public void  setPurchaseItems(boolean purchaseItems ){
        this.purchaseItems  = purchaseItems ;
    }
    public boolean  isPurchaseTag(){
        return this.purchaseTag ;
    }
    public void  setPurchaseTag(boolean purchaseTag ){
        this.purchaseTag  = purchaseTag ;
    }
}
