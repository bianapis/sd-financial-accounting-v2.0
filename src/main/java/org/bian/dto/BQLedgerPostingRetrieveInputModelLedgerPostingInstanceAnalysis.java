package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis
 */
public class BQLedgerPostingRetrieveInputModelLedgerPostingInstanceAnalysis   {
  private String ledgerPostingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return ledgerPostingInstanceAnalysisReference
  **/

  public String getLedgerPostingInstanceAnalysisReference() {
    return ledgerPostingInstanceAnalysisReference;
  }

  public void setLedgerPostingInstanceAnalysisReference(String ledgerPostingInstanceAnalysisReference) {
    this.ledgerPostingInstanceAnalysisReference = ledgerPostingInstanceAnalysisReference;
  }


}

