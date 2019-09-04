package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogControlOutputModel
 */
public class CRFinancialBookingLogControlOutputModel   {
  private String financialBookingLogControlActionTaskReference = null;

  private Object financialBookingLogControlActionTaskRecord = null;

  private String financialBookingLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Booking Log instance control processing service call 
   * @return financialBookingLogControlActionTaskReference
  **/

  public String getFinancialBookingLogControlActionTaskReference() {
    return financialBookingLogControlActionTaskReference;
  }

  public void setFinancialBookingLogControlActionTaskReference(String financialBookingLogControlActionTaskReference) {
    this.financialBookingLogControlActionTaskReference = financialBookingLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return financialBookingLogControlActionTaskRecord
  **/

  public Object getFinancialBookingLogControlActionTaskRecord() {
    return financialBookingLogControlActionTaskRecord;
  }

  public void setFinancialBookingLogControlActionTaskRecord(Object financialBookingLogControlActionTaskRecord) {
    this.financialBookingLogControlActionTaskRecord = financialBookingLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return financialBookingLogControlActionResponse
  **/

  public String getFinancialBookingLogControlActionResponse() {
    return financialBookingLogControlActionResponse;
  }

  public void setFinancialBookingLogControlActionResponse(String financialBookingLogControlActionResponse) {
    this.financialBookingLogControlActionResponse = financialBookingLogControlActionResponse;
  }


}

