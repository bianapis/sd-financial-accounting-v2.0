package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport
 */
public class BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceReport   {
  private Object ledgerPostingInstanceReportRecord = null;

  private String ledgerPostingInstanceReportType = null;

  private String ledgerPostingInstanceReportParameters = null;

  private Object ledgerPostingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return ledgerPostingInstanceReportRecord
  **/

  public Object getLedgerPostingInstanceReportRecord() {
    return ledgerPostingInstanceReportRecord;
  }

  public void setLedgerPostingInstanceReportRecord(Object ledgerPostingInstanceReportRecord) {
    this.ledgerPostingInstanceReportRecord = ledgerPostingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return ledgerPostingInstanceReportType
  **/

  public String getLedgerPostingInstanceReportType() {
    return ledgerPostingInstanceReportType;
  }

  public void setLedgerPostingInstanceReportType(String ledgerPostingInstanceReportType) {
    this.ledgerPostingInstanceReportType = ledgerPostingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return ledgerPostingInstanceReportParameters
  **/

  public String getLedgerPostingInstanceReportParameters() {
    return ledgerPostingInstanceReportParameters;
  }

  public void setLedgerPostingInstanceReportParameters(String ledgerPostingInstanceReportParameters) {
    this.ledgerPostingInstanceReportParameters = ledgerPostingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return ledgerPostingInstanceReport
  **/

  public Object getLedgerPostingInstanceReport() {
    return ledgerPostingInstanceReport;
  }

  public void setLedgerPostingInstanceReport(Object ledgerPostingInstanceReport) {
    this.ledgerPostingInstanceReport = ledgerPostingInstanceReport;
  }


}

