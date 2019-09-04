package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord
 */
public class BQLedgerPostingCaptureInputModelLedgerPostingInstanceRecord   {
  private String postingDirection = null;

  private String postingAmount = null;

  private String postingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the posting location in the account ledger according to the chart of accounts (e.g. based on customer, transaction type) 
   * @return postingDirection
  **/

  public String getPostingDirection() {
    return postingDirection;
  }

  public void setPostingDirection(String postingDirection) {
    this.postingDirection = postingDirection;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The posting amount as a credit-debit pair 
   * @return postingAmount
  **/

  public String getPostingAmount() {
    return postingAmount;
  }

  public void setPostingAmount(String postingAmount) {
    this.postingAmount = postingAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time of the posting 
   * @return postingValueDate
  **/

  public String getPostingValueDate() {
    return postingValueDate;
  }

  public void setPostingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
  }


}

