package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis;
import org.bian.dto.CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveInputModel
 */
public class CRFinancialBookingLogRetrieveInputModel   {
  private Object financialBookingLogRetrieveActionTaskRecord = null;

  private String financialBookingLogRetrieveActionRequest = null;

  private CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord financialBookingLogInstanceReportRecord = null;

  private CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis financialBookingLogInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialBookingLogRetrieveActionTaskRecord
  **/

  public Object getFinancialBookingLogRetrieveActionTaskRecord() {
    return financialBookingLogRetrieveActionTaskRecord;
  }

  public void setFinancialBookingLogRetrieveActionTaskRecord(Object financialBookingLogRetrieveActionTaskRecord) {
    this.financialBookingLogRetrieveActionTaskRecord = financialBookingLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialBookingLogRetrieveActionRequest
  **/

  public String getFinancialBookingLogRetrieveActionRequest() {
    return financialBookingLogRetrieveActionRequest;
  }

  public void setFinancialBookingLogRetrieveActionRequest(String financialBookingLogRetrieveActionRequest) {
    this.financialBookingLogRetrieveActionRequest = financialBookingLogRetrieveActionRequest;
  }


  /**
   * Get financialBookingLogInstanceReportRecord
   * @return financialBookingLogInstanceReportRecord
  **/

  public CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord getFinancialBookingLogInstanceReportRecord() {
    return financialBookingLogInstanceReportRecord;
  }

  public void setFinancialBookingLogInstanceReportRecord(CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceReportRecord financialBookingLogInstanceReportRecord) {
    this.financialBookingLogInstanceReportRecord = financialBookingLogInstanceReportRecord;
  }


  /**
   * Get financialBookingLogInstanceAnalysis
   * @return financialBookingLogInstanceAnalysis
  **/

  public CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis getFinancialBookingLogInstanceAnalysis() {
    return financialBookingLogInstanceAnalysis;
  }

  public void setFinancialBookingLogInstanceAnalysis(CRFinancialBookingLogRetrieveInputModelFinancialBookingLogInstanceAnalysis financialBookingLogInstanceAnalysis) {
    this.financialBookingLogInstanceAnalysis = financialBookingLogInstanceAnalysis;
  }


}

