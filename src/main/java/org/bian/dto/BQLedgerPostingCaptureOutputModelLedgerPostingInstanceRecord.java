package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord
 */
public class BQLedgerPostingCaptureOutputModelLedgerPostingInstanceRecord   {
  private String postingResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any confirmation notification 
   * @return postingResult
  **/

  public String getPostingResult() {
    return postingResult;
  }

  public void setPostingResult(String postingResult) {
    this.postingResult = postingResult;
  }


}

