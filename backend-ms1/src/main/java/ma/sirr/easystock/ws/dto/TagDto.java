package  ma.sirr.easystock.ws.dto;

import ma.sirr.easystock.zynerator.audit.Log;
import ma.sirr.easystock.zynerator.dto.AuditBaseDtoEnhanced;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagDto  extends AuditBaseDtoEnhanced {

    private String code  ;
    private String reference  ;




    public TagDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }






}
