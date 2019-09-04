package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis;
import org.bian.dto.BQLedgerPostingRetrieveInputModelLedgerPostingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingRetrieveInputModel
 */
public class BQLedgerPostingRetrieveInputModel   {
  private Object ledgerPostingRetrieveActionTaskRecord = null;

  private String ledgerPostingRetrieveActionRequest = null;

  private BQLedgerPostingRetrieveInputModelLedgerPostingInstanceReport ledgerPostingInstanceReport = null;

  private BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis ledgerPostingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return ledgerPostingRetrieveActionRequest
  **/

  public String getLedgerPostingRetrieveActionRequest() {
    return ledgerPostingRetrieveActionRequest;
  }

  public void setLedgerPostingRetrieveActionRequest(String ledgerPostingRetrieveActionRequest) {
    this.ledgerPostingRetrieveActionRequest = ledgerPostingRetrieveActionRequest;
  }


  /**
   * Get ledgerPostingInstanceReport
   * @return ledgerPostingInstanceReport
  **/

  public BQLedgerPostingRetrieveInputModelLedgerPostingInstanceReport getLedgerPostingInstanceReport() {
    return ledgerPostingInstanceReport;
  }

  public void setLedgerPostingInstanceReport(BQLedgerPostingRetrieveInputModelLedgerPostingInstanceReport ledgerPostingInstanceReport) {
    this.ledgerPostingInstanceReport = ledgerPostingInstanceReport;
  }


  /**
   * Get ledgerPostingInstanceAnalysis
   * @return ledgerPostingInstanceAnalysis
  **/

  public BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis getLedgerPostingInstanceAnalysis() {
    return ledgerPostingInstanceAnalysis;
  }

  public void setLedgerPostingInstanceAnalysis(BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis ledgerPostingInstanceAnalysis) {
    this.ledgerPostingInstanceAnalysis = ledgerPostingInstanceAnalysis;
  }


}

