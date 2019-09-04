package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis
 */
public class CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis   {
  private String financialBookingLogInstanceAnalysisData = null;

  private String financialBookingLogInstanceAnalysisReportType = null;

  private Object financialBookingLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialBookingLogInstanceAnalysisData
  **/

  public String getFinancialBookingLogInstanceAnalysisData() {
    return financialBookingLogInstanceAnalysisData;
  }

  public void setFinancialBookingLogInstanceAnalysisData(String financialBookingLogInstanceAnalysisData) {
    this.financialBookingLogInstanceAnalysisData = financialBookingLogInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialBookingLogInstanceAnalysisReportType
  **/

  public String getFinancialBookingLogInstanceAnalysisReportType() {
    return financialBookingLogInstanceAnalysisReportType;
  }

  public void setFinancialBookingLogInstanceAnalysisReportType(String financialBookingLogInstanceAnalysisReportType) {
    this.financialBookingLogInstanceAnalysisReportType = financialBookingLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialBookingLogInstanceAnalysisReport
  **/

  public Object getFinancialBookingLogInstanceAnalysisReport() {
    return financialBookingLogInstanceAnalysisReport;
  }

  public void setFinancialBookingLogInstanceAnalysisReport(Object financialBookingLogInstanceAnalysisReport) {
    this.financialBookingLogInstanceAnalysisReport = financialBookingLogInstanceAnalysisReport;
  }


}

