package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis
 */
public class BQLedgerPostingRetrieveOutputModelLedgerPostingInstanceAnalysis   {
  private Object ledgerPostingInstanceAnalysisRecord = null;

  private String ledgerPostingInstanceAnalysisReportType = null;

  private String ledgerPostingInstanceAnalysisParameters = null;

  private Object ledgerPostingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return ledgerPostingInstanceAnalysisRecord
  **/

  public Object getLedgerPostingInstanceAnalysisRecord() {
    return ledgerPostingInstanceAnalysisRecord;
  }

  public void setLedgerPostingInstanceAnalysisRecord(Object ledgerPostingInstanceAnalysisRecord) {
    this.ledgerPostingInstanceAnalysisRecord = ledgerPostingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return ledgerPostingInstanceAnalysisReportType
  **/

  public String getLedgerPostingInstanceAnalysisReportType() {
    return ledgerPostingInstanceAnalysisReportType;
  }

  public void setLedgerPostingInstanceAnalysisReportType(String ledgerPostingInstanceAnalysisReportType) {
    this.ledgerPostingInstanceAnalysisReportType = ledgerPostingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return ledgerPostingInstanceAnalysisParameters
  **/

  public String getLedgerPostingInstanceAnalysisParameters() {
    return ledgerPostingInstanceAnalysisParameters;
  }

  public void setLedgerPostingInstanceAnalysisParameters(String ledgerPostingInstanceAnalysisParameters) {
    this.ledgerPostingInstanceAnalysisParameters = ledgerPostingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return ledgerPostingInstanceAnalysisReport
  **/

  public Object getLedgerPostingInstanceAnalysisReport() {
    return ledgerPostingInstanceAnalysisReport;
  }

  public void setLedgerPostingInstanceAnalysisReport(Object ledgerPostingInstanceAnalysisReport) {
    this.ledgerPostingInstanceAnalysisReport = ledgerPostingInstanceAnalysisReport;
  }


}

