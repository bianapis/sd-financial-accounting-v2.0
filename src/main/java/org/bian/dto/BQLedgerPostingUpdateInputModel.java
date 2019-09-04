package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingUpdateInputModel
 */
public class BQLedgerPostingUpdateInputModel   {
  private String financialBookingLogInstanceReference = null;

  private String ledgerPostingInstanceReference = null;

  private BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord = null;

  private Object ledgerPostingUpdateActionTaskRecord = null;

  private String ledgerPostingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Financial Booking Log instance 
   * @return financialBookingLogInstanceReference
  **/

  public String getFinancialBookingLogInstanceReference() {
    return financialBookingLogInstanceReference;
  }

  public void setFinancialBookingLogInstanceReference(String financialBookingLogInstanceReference) {
    this.financialBookingLogInstanceReference = financialBookingLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Ledger Posting instance 
   * @return ledgerPostingInstanceReference
  **/

  public String getLedgerPostingInstanceReference() {
    return ledgerPostingInstanceReference;
  }

  public void setLedgerPostingInstanceReference(String ledgerPostingInstanceReference) {
    this.ledgerPostingInstanceReference = ledgerPostingInstanceReference;
  }


  /**
   * Get ledgerPostingInstanceRecord
   * @return ledgerPostingInstanceRecord
  **/

  public BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord getLedgerPostingInstanceRecord() {
    return ledgerPostingInstanceRecord;
  }

  public void setLedgerPostingInstanceRecord(BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord) {
    this.ledgerPostingInstanceRecord = ledgerPostingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return ledgerPostingUpdateActionTaskRecord
  **/

  public Object getLedgerPostingUpdateActionTaskRecord() {
    return ledgerPostingUpdateActionTaskRecord;
  }

  public void setLedgerPostingUpdateActionTaskRecord(Object ledgerPostingUpdateActionTaskRecord) {
    this.ledgerPostingUpdateActionTaskRecord = ledgerPostingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return ledgerPostingUpdateActionRequest
  **/

  public String getLedgerPostingUpdateActionRequest() {
    return ledgerPostingUpdateActionRequest;
  }

  public void setLedgerPostingUpdateActionRequest(String ledgerPostingUpdateActionRequest) {
    this.ledgerPostingUpdateActionRequest = ledgerPostingUpdateActionRequest;
  }


}

