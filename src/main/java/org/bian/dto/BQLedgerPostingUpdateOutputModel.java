package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLedgerPostingUpdateOutputModel
 */
public class BQLedgerPostingUpdateOutputModel   {
  private BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord = null;

  private String ledgerPostingUpdateActionTaskReference = null;

  private Object ledgerPostingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get ledgerPostingInstanceRecord
   * @return ledgerPostingInstanceRecord
  **/

  public BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord getLedgerPostingInstanceRecord() {
    return ledgerPostingInstanceRecord;
  }

  public void setLedgerPostingInstanceRecord(BQLedgerPostingUpdateInputModelLedgerPostingInstanceRecord ledgerPostingInstanceRecord) {
    this.ledgerPostingInstanceRecord = ledgerPostingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return ledgerPostingUpdateActionTaskReference
  **/

  public String getLedgerPostingUpdateActionTaskReference() {
    return ledgerPostingUpdateActionTaskReference;
  }

  public void setLedgerPostingUpdateActionTaskReference(String ledgerPostingUpdateActionTaskReference) {
    this.ledgerPostingUpdateActionTaskReference = ledgerPostingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return ledgerPostingUpdateActionTaskRecord
  **/

  public Object getLedgerPostingUpdateActionTaskRecord() {
    return ledgerPostingUpdateActionTaskRecord;
  }

  public void setLedgerPostingUpdateActionTaskRecord(Object ledgerPostingUpdateActionTaskRecord) {
    this.ledgerPostingUpdateActionTaskRecord = ledgerPostingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

