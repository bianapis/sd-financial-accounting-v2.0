package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord
 */
public class CRFinancialBookingLogInitiateInputModelCRFinancialBookingLogInstanceRecord   {
  private String financialAccountType = null;

  private String productServiceReference = null;

  private String businessUnitReference = null;

  private String chartofAccountBookingRules = null;

  private String baseCurrency = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of accounting facility (e.g. journal, sub-ledger) 
   * @return financialAccountType
  **/

  public String getFinancialAccountType() {
    return financialAccountType;
  }

  public void setFinancialAccountType(String financialAccountType) {
    this.financialAccountType = financialAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product or service for which this is the underlying accounting 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the owning business unit and associated business activity 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to applicable account booking rules 
   * @return chartofAccountBookingRules
  **/

  public String getChartofAccountBookingRules() {
    return chartofAccountBookingRules;
  }

  public void setChartofAccountBookingRules(String chartofAccountBookingRules) {
    this.chartofAccountBookingRules = chartofAccountBookingRules;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the postings 
   * @return baseCurrency
  **/

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


}

