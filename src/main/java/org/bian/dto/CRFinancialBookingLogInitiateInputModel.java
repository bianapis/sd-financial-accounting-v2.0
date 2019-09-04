package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogInitiateInputModel
 */
public class CRFinancialBookingLogInitiateInputModel   {
  private String financialAccountingServicingSessionReference = null;

  private Object financialBookingLogInitiateActionRecord = null;

  private String financialBookingLogInstanceStatus = null;

  private CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialBookingLogInitiateActionRecord
  **/

  public Object getFinancialBookingLogInitiateActionRecord() {
    return financialBookingLogInitiateActionRecord;
  }

  public void setFinancialBookingLogInitiateActionRecord(Object financialBookingLogInitiateActionRecord) {
    this.financialBookingLogInitiateActionRecord = financialBookingLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Booking Log instance (e.g. initialised, pending, active) 
   * @return financialBookingLogInstanceStatus
  **/

  public String getFinancialBookingLogInstanceStatus() {
    return financialBookingLogInstanceStatus;
  }

  public void setFinancialBookingLogInstanceStatus(String financialBookingLogInstanceStatus) {
    this.financialBookingLogInstanceStatus = financialBookingLogInstanceStatus;
  }


  /**
   * Get cRFinancialBookingLogInstanceRecord
   * @return cRFinancialBookingLogInstanceRecord
  **/

  public CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord getCRFinancialBookingLogInstanceRecord() {
    return cRFinancialBookingLogInstanceRecord;
  }

  public void setCRFinancialBookingLogInstanceRecord(CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord) {
    this.cRFinancialBookingLogInstanceRecord = cRFinancialBookingLogInstanceRecord;
  }


}

