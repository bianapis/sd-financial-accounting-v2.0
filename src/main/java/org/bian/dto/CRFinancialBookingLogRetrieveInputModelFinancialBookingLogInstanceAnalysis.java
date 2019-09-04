package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis
 */
public class CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis   {
  private String financialBookingLogInstanceAnalysisReference = null;

  private String financialBookingLogInstanceAnalysisReportType = null;

  private String financialBookingLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialBookingLogInstanceAnalysisReference
  **/

  public String getFinancialBookingLogInstanceAnalysisReference() {
    return financialBookingLogInstanceAnalysisReference;
  }

  public void setFinancialBookingLogInstanceAnalysisReference(String financialBookingLogInstanceAnalysisReference) {
    this.financialBookingLogInstanceAnalysisReference = financialBookingLogInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialBookingLogInstanceAnalysisParameters
  **/

  public String getFinancialBookingLogInstanceAnalysisParameters() {
    return financialBookingLogInstanceAnalysisParameters;
  }

  public void setFinancialBookingLogInstanceAnalysisParameters(String financialBookingLogInstanceAnalysisParameters) {
    this.financialBookingLogInstanceAnalysisParameters = financialBookingLogInstanceAnalysisParameters;
  }


}

