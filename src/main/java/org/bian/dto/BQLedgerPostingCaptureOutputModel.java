package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingCaptureOutputModel
 */
public class BQLedgerPostingCaptureOutputModel   {
  private BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord = null;

  private String ledgerPostingCaptureActionTaskReference = null;

  private Object ledgerPostingCaptureActionTaskRecord = null;

  private String ledgerPostingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get ledgerPostingInstanceRecord
   * @return ledgerPostingInstanceRecord
  **/

  public BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord getLedgerPostingInstanceRecord() {
    return ledgerPostingInstanceRecord;
  }

  public void setLedgerPostingInstanceRecord(BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord) {
    this.ledgerPostingInstanceRecord = ledgerPostingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Ledger Posting instance capture service call 
   * @return ledgerPostingCaptureActionTaskReference
  **/

  public String getLedgerPostingCaptureActionTaskReference() {
    return ledgerPostingCaptureActionTaskReference;
  }

  public void setLedgerPostingCaptureActionTaskReference(String ledgerPostingCaptureActionTaskReference) {
    this.ledgerPostingCaptureActionTaskReference = ledgerPostingCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Ledger Posting structured input transaction/record 
   * @return ledgerPostingCaptureRecordReference
  **/

  public String getLedgerPostingCaptureRecordReference() {
    return ledgerPostingCaptureRecordReference;
  }

  public void setLedgerPostingCaptureRecordReference(String ledgerPostingCaptureRecordReference) {
    this.ledgerPostingCaptureRecordReference = ledgerPostingCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

