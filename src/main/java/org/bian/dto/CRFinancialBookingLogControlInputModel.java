package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogControlInputModelFinancialBookingLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogControlInputModel
 */
public class CRFinancialBookingLogControlInputModel   {
  private String financialAccountingServicingSessionReference = null;

  private String financialBookingLogInstanceReference = null;

  private Object financialBookingLogControlActionTaskRecord = null;

  private CRFinancialBookingLogControlInputModelFinancialBookingLogControlActionRequest financialBookingLogControlActionRequest = null;


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
   * Get financialBookingLogControlActionRequest
   * @return financialBookingLogControlActionRequest
  **/

  public CRFinancialBookingLogControlInputModelFinancialBookingLogControlActionRequest getFinancialBookingLogControlActionRequest() {
    return financialBookingLogControlActionRequest;
  }

  public void setFinancialBookingLogControlActionRequest(CRFinancialBookingLogControlInputModelFinancialBookingLogControlActionRequest financialBookingLogControlActionRequest) {
    this.financialBookingLogControlActionRequest = financialBookingLogControlActionRequest;
  }


}

