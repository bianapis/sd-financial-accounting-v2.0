package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord
 */
public class CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord   {
  private String financialBookingLogInstanceReportData = null;

  private String financialBookingLogInstanceReportType = null;

  private Object financialBookingLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialBookingLogInstanceReportData
  **/

  public String getFinancialBookingLogInstanceReportData() {
    return financialBookingLogInstanceReportData;
  }

  public void setFinancialBookingLogInstanceReportData(String financialBookingLogInstanceReportData) {
    this.financialBookingLogInstanceReportData = financialBookingLogInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialBookingLogInstanceReportType
  **/

  public String getFinancialBookingLogInstanceReportType() {
    return financialBookingLogInstanceReportType;
  }

  public void setFinancialBookingLogInstanceReportType(String financialBookingLogInstanceReportType) {
    this.financialBookingLogInstanceReportType = financialBookingLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialBookingLogInstanceReport
  **/

  public Object getFinancialBookingLogInstanceReport() {
    return financialBookingLogInstanceReport;
  }

  public void setFinancialBookingLogInstanceReport(Object financialBookingLogInstanceReport) {
    this.financialBookingLogInstanceReport = financialBookingLogInstanceReport;
  }


}

