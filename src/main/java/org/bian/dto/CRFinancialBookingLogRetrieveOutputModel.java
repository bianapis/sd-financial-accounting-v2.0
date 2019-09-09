package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialBookingLogRetrieveOutputModelCRFinancialBookingLogInstanceRecord;
import org.bian.dto.CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis;
import org.bian.dto.CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogRetrieveOutputModel
 */
public class CRFinancialBookingLogRetrieveOutputModel   {
  private CRFinancialBookingLogRetrieveOutputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord = null;

  private String financialBookingLogRetrieveActionTaskReference = null;

  private Object financialBookingLogRetrieveActionTaskRecord = null;

  private String financialBookingLogRetrieveActionResponse = null;

  private CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord financialBookingLogInstanceReportRecord = null;

  private CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis financialBookingLogInstanceAnalysis = null;


  /**
   * Get cRFinancialBookingLogInstanceRecord
   * @return cRFinancialBookingLogInstanceRecord
  **/

  public CRFinancialBookingLogRetrieveOutputModelCRFinancialBookingLogInstanceRecord getCRFinancialBookingLogInstanceRecord() {
    return cRFinancialBookingLogInstanceRecord;
  }
  @JsonProperty("cRFinancialBookingLogInstanceRecord")
  public void setCRFinancialBookingLogInstanceRecord(CRFinancialBookingLogRetrieveOutputModelCRFinancialBookingLogInstanceRecord cRFinancialBookingLogInstanceRecord) {
    this.cRFinancialBookingLogInstanceRecord = cRFinancialBookingLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Booking Log instance retrieve service call 
   * @return financialBookingLogRetrieveActionTaskReference
  **/

  public String getFinancialBookingLogRetrieveActionTaskReference() {
    return financialBookingLogRetrieveActionTaskReference;
  }

  public void setFinancialBookingLogRetrieveActionTaskReference(String financialBookingLogRetrieveActionTaskReference) {
    this.financialBookingLogRetrieveActionTaskReference = financialBookingLogRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialBookingLogRetrieveActionResponse
  **/

  public String getFinancialBookingLogRetrieveActionResponse() {
    return financialBookingLogRetrieveActionResponse;
  }

  public void setFinancialBookingLogRetrieveActionResponse(String financialBookingLogRetrieveActionResponse) {
    this.financialBookingLogRetrieveActionResponse = financialBookingLogRetrieveActionResponse;
  }


  /**
   * Get financialBookingLogInstanceReportRecord
   * @return financialBookingLogInstanceReportRecord
  **/

  public CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord getFinancialBookingLogInstanceReportRecord() {
    return financialBookingLogInstanceReportRecord;
  }

  public void setFinancialBookingLogInstanceReportRecord(CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceReportRecord financialBookingLogInstanceReportRecord) {
    this.financialBookingLogInstanceReportRecord = financialBookingLogInstanceReportRecord;
  }


  /**
   * Get financialBookingLogInstanceAnalysis
   * @return financialBookingLogInstanceAnalysis
  **/

  public CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis getFinancialBookingLogInstanceAnalysis() {
    return financialBookingLogInstanceAnalysis;
  }

  public void setFinancialBookingLogInstanceAnalysis(CRFinancialBookingLogRetrieveOutputModelFinancialBookingLogInstanceAnalysis financialBookingLogInstanceAnalysis) {
    this.financialBookingLogInstanceAnalysis = financialBookingLogInstanceAnalysis;
  }


}

