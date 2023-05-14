package ma.sirr.easystock.workflow.admin.process.purchase.save;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;

import ma.sirr.easystock.ws.dto.PurchaseTagDto;
import ma.sirr.easystock.ws.dto.PurchaseItemDto;
import ma.sirr.easystock.ws.dto.ClientDto;
import ma.sirr.easystock.ws.dto.ProductDto;
import ma.sirr.easystock.ws.dto.TagDto;
import ma.sirr.easystock.zynerator.audit.Log;
import ma.sirr.easystock.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sirr.easystock.zynerator.process.AbstractProcessInput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseSaveAdminInput extends AbstractProcessInput {

    private String reference  ;
    private String purchaseDate ;
    private String image  ;
    private BigDecimal total  ;
    private String description  ;

    private ClientDto client ;

    private List<PurchaseItemDto> purchaseItems ;
    private List<PurchaseTagDto> purchaseTag ;


    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    @Log
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Log
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public ClientDto getClient(){
        return this.client;
    }

    public void setClientDto(ClientDto client){
        this.client = client;
    }

    public List<PurchaseItemDto> getPurchaseItems(){
        return this.purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItemDto> purchaseItems){
        this.purchaseItems = purchaseItems;
    }
    public List<PurchaseTagDto> getPurchaseTag(){
        return this.purchaseTag;
    }

    public void setPurchaseTag(List<PurchaseTagDto> purchaseTag){
        this.purchaseTag = purchaseTag;
    }
}



