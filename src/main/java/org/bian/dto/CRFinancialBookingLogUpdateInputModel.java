package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogUpdateInputModel
 */
public class CRFinancialBookingLogUpdateInputModel   {
  private String financialAccountingServicingSessionReference = null;

  private String financialBookingLogInstanceReference = null;

  private CRFinancialBookingLogUpdateInputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord = null;

  private Object financialBookingLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialAccountingServicingSessionReference
  **/

  public String getFinancialAccountingServicingSessionReference() {
    return financialAccountingServicingSessionReference;
  }

  public void setFinancialAccountingServicingSessionReference(String financialAccountingServicingSessionReference) {
    this.financialAccountingServicingSessionReference = financialAccountingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Booking Log instance 
   * @return financialBookingLogInstanceReference
  **/

  public String getFinancialBookingLogInstanceReference() {
    return financialBookingLogInstanceReference;
  }

  public void setFinancialBookingLogInstanceReference(String financialBookingLogInstanceReference) {
    this.financialBookingLogInstanceReference = financialBookingLogInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

