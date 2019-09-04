package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord
 */
public class CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord   {
  private String financialBookingLogInstanceReportReference = null;

  private String financialBookingLogInstanceReportType = null;

  private String financialBookingLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialBookingLogInstanceReportReference
  **/

  public String getFinancialBookingLogInstanceReportReference() {
    return financialBookingLogInstanceReportReference;
  }

  public void setFinancialBookingLogInstanceReportReference(String financialBookingLogInstanceReportReference) {
    this.financialBookingLogInstanceReportReference = financialBookingLogInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialBookingLogInstanceReportParameters
  **/

  public String getFinancialBookingLogInstanceReportParameters() {
    return financialBookingLogInstanceReportParameters;
  }

  public void setFinancialBookingLogInstanceReportParameters(String financialBookingLogInstanceReportParameters) {
    this.financialBookingLogInstanceReportParameters = financialBookingLogInstanceReportParameters;
  }


}

