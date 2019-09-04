package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis;
import org.bian.dto.BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport;
import org.bian.dto.BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingRetrieveOutputModel
 */
public class BQLedgerPostingRetrieveOutputModel   {
  private BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord = null;

  private String ledgerPostingRetrieveActionTaskReference = null;

  private Object ledgerPostingRetrieveActionTaskRecord = null;

  private String ledgerPostingRetrieveActionResponse = null;

  private BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport ledgerPostingInstanceReport = null;

  private BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis ledgerPostingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Ledger Posting instance retrieve service call 
   * @return ledgerPostingRetrieveActionTaskReference
  **/

  public String getLedgerPostingRetrieveActionTaskReference() {
    return ledgerPostingRetrieveActionTaskReference;
  }

  public void setLedgerPostingRetrieveActionTaskReference(String ledgerPostingRetrieveActionTaskReference) {
    this.ledgerPostingRetrieveActionTaskReference = ledgerPostingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return ledgerPostingRetrieveActionTaskRecord
  **/

  public Object getLedgerPostingRetrieveActionTaskRecord() {
    return ledgerPostingRetrieveActionTaskRecord;
  }

  public void setLedgerPostingRetrieveActionTaskRecord(Object ledgerPostingRetrieveActionTaskRecord) {
    this.ledgerPostingRetrieveActionTaskRecord = ledgerPostingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return ledgerPostingRetrieveActionResponse
  **/

  public String getLedgerPostingRetrieveActionResponse() {
    return ledgerPostingRetrieveActionResponse;
  }

  public void setLedgerPostingRetrieveActionResponse(String ledgerPostingRetrieveActionResponse) {
    this.ledgerPostingRetrieveActionResponse = ledgerPostingRetrieveActionResponse;
  }


  /**
   * Get ledgerPostingInstanceReport
   * @return ledgerPostingInstanceReport
  **/

  public BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport getLedgerPostingInstanceReport() {
    return ledgerPostingInstanceReport;
  }

  public void setLedgerPostingInstanceReport(BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport ledgerPostingInstanceReport) {
    this.ledgerPostingInstanceReport = ledgerPostingInstanceReport;
  }


  /**
   * Get ledgerPostingInstanceAnalysis
   * @return ledgerPostingInstanceAnalysis
  **/

  public BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis getLedgerPostingInstanceAnalysis() {
    return ledgerPostingInstanceAnalysis;
  }

  public void setLedgerPostingInstanceAnalysis(BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis ledgerPostingInstanceAnalysis) {
    this.ledgerPostingInstanceAnalysis = ledgerPostingInstanceAnalysis;
  }


}

