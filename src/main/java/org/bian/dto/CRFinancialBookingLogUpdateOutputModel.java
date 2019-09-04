package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogUpdateOutputModel
 */
public class CRFinancialBookingLogUpdateOutputModel   {
  private CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord = null;

  private String financialBookingLogUpdateActionTaskReference = null;

  private Object financialBookingLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRFinancialBookingLogInstanceRecord
   * @return cRFinancialBookingLogInstanceRecord
  **/

  public CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord getCRFinancialBookingLogInstanceRecord() {
    return cRFinancialBookingLogInstanceRecord;
  }

  public void setCRFinancialBookingLogInstanceRecord(CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord) {
    this.cRFinancialBookingLogInstanceRecord = cRFinancialBookingLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialBookingLogUpdateActionTaskReference
  **/

  public String getFinancialBookingLogUpdateActionTaskReference() {
    return financialBookingLogUpdateActionTaskReference;
  }

  public void setFinancialBookingLogUpdateActionTaskReference(String financialBookingLogUpdateActionTaskReference) {
    this.financialBookingLogUpdateActionTaskReference = financialBookingLogUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialBookingLogUpdateActionTaskRecord
  **/

  public Object getFinancialBookingLogUpdateActionTaskRecord() {
    return financialBookingLogUpdateActionTaskRecord;
  }

  public void setFinancialBookingLogUpdateActionTaskRecord(Object financialBookingLogUpdateActionTaskRecord) {
    this.financialBookingLogUpdateActionTaskRecord = financialBookingLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

