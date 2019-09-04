package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingCaptureInputModelCaptureRecordType;
import org.bian.dto.BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingCaptureInputModel
 */
public class BQLedgerPostingCaptureInputModel   {
  private String financialBookingLogInstanceReference = null;

  private String ledgerPostingInstanceReference = null;

  private BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord = null;

  private Object ledgerPostingCaptureActionTaskRecord = null;

  private BQLedgerPostingCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord getLedgerPostingInstanceRecord() {
    return ledgerPostingInstanceRecord;
  }

  public void setLedgerPostingInstanceRecord(BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord) {
    this.ledgerPostingInstanceRecord = ledgerPostingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return ledgerPostingCaptureActionTaskRecord
  **/

  public Object getLedgerPostingCaptureActionTaskRecord() {
    return ledgerPostingCaptureActionTaskRecord;
  }

  public void setLedgerPostingCaptureActionTaskRecord(Object ledgerPostingCaptureActionTaskRecord) {
    this.ledgerPostingCaptureActionTaskRecord = ledgerPostingCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQLedgerPostingCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQLedgerPostingCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

