package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogInitiateOutputModelCRFinancialBookingLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogInitiateOutputModel
 */
public class CRFinancialBookingLogInitiateOutputModel   {
  private String financialBookingLogInstanceReference = null;

  private String financialBookingLogInitiateActionReference = null;

  private Object financialBookingLogInitiateActionRecord = null;

  private String financialBookingLogInstanceStatus = null;

  private CRFinancialBookingLogInitiateOutputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialBookingLogInitiateActionReference
  **/

  public String getFinancialBookingLogInitiateActionReference() {
    return financialBookingLogInitiateActionReference;
  }

  public void setFinancialBookingLogInitiateActionReference(String financialBookingLogInitiateActionReference) {
    this.financialBookingLogInitiateActionReference = financialBookingLogInitiateActionReference;
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

  public CRFinancialBookingLogInitiateOutputModelCRFinancialBookingLogInstanceRecord getCRFinancialBookingLogInstanceRecord() {
    return cRFinancialBookingLogInstanceRecord;
  }

  public void setCRFinancialBookingLogInstanceRecord(CRFinancialBookingLogInitiateOutputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord) {
    this.cRFinancialBookingLogInstanceRecord = cRFinancialBookingLogInstanceRecord;
  }


}

