/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialAccountingApiService {

	SDFinancialAccountingActivateOutputModel activate(SDFinancialAccountingActivateInputModel request);
	
	BQLedgerPostingCaptureOutputModel captureLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLedgerPostingCaptureInputModel request);
	
	SDFinancialAccountingConfigureOutputModel configure(String sdReferenceId, SDFinancialAccountingConfigureInputModel request);
	
	CRFinancialBookingLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialBookingLogControlInputModel request);
	
	SDFinancialAccountingFeedbackOutputModel feedback(String sdReferenceId, SDFinancialAccountingFeedbackInputModel request);
	
	CRFinancialBookingLogInitiateOutputModel initiate(String sdReferenceId, CRFinancialBookingLogInitiateInputModel request);
	
	CRFinancialBookingLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQLedgerPostingRetrieveOutputModel retrieveLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDFinancialAccountingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialBookingLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialBookingLogUpdateInputModel request);
	
	BQLedgerPostingUpdateOutputModel updateLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLedgerPostingUpdateInputModel request);
	
}
