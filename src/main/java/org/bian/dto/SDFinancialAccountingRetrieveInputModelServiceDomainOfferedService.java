package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialAccountingRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialAccountingRetrieveInputModelServiceDomainOfferedService
 */
public class SDFinancialAccountingRetrieveInputModelServiceDomainOfferedService   {
  private String serviceDomainServiceReference = null;

  private SDFinancialAccountingRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/

  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }


  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  **/

  public SDFinancialAccountingRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDFinancialAccountingRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


}

