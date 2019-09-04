/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FinancialAccountingApiServiceImpl implements FinancialAccountingApiService {

	public SDFinancialAccountingActivateOutputModel activate(SDFinancialAccountingActivateInputModel request){
		return JsonReader.read("activate-SDFinancialAccountingActivateOutputModel.json",new TypeReference<SDFinancialAccountingActivateOutputModel>(){});
	}
	
	public BQLedgerPostingCaptureOutputModel captureLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLedgerPostingCaptureInputModel request){
		return JsonReader.read("capture-BQLedgerPostingCaptureOutputModel.json",new TypeReference<BQLedgerPostingCaptureOutputModel>(){});
	}
	
	public SDFinancialAccountingConfigureOutputModel configure(String sdReferenceId, SDFinancialAccountingConfigureInputModel request){
		return JsonReader.read("configure-SDFinancialAccountingConfigureOutputModel.json",new TypeReference<SDFinancialAccountingConfigureOutputModel>(){});
	}
	
	public CRFinancialBookingLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialBookingLogControlInputModel request){
		return JsonReader.read("control-CRFinancialBookingLogControlOutputModel.json",new TypeReference<CRFinancialBookingLogControlOutputModel>(){});
	}
	
	public SDFinancialAccountingFeedbackOutputModel feedback(String sdReferenceId, SDFinancialAccountingFeedbackInputModel request){
		return JsonReader.read("feedback-SDFinancialAccountingFeedbackOutputModel.json",new TypeReference<SDFinancialAccountingFeedbackOutputModel>(){});
	}
	
	public CRFinancialBookingLogInitiateOutputModel initiate(String sdReferenceId, CRFinancialBookingLogInitiateInputModel request){
		return JsonReader.read("initiate-CRFinancialBookingLogInitiateOutputModel.json",new TypeReference<CRFinancialBookingLogInitiateOutputModel>(){});
	}
	
	public CRFinancialBookingLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialBookingLogRetrieveOutputModel.json",new TypeReference<CRFinancialBookingLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQLedgerPostingRetrieveOutputModel retrieveLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLedgerPostingRetrieveOutputModel.json",new TypeReference<BQLedgerPostingRetrieveOutputModel>(){});
	}
	
	public SDFinancialAccountingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFinancialAccountingRetrieveOutputModel.json",new TypeReference<SDFinancialAccountingRetrieveOutputModel>(){});
	}
	
	public CRFinancialBookingLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialBookingLogUpdateInputModel request){
		return JsonReader.read("update-CRFinancialBookingLogUpdateOutputModel.json",new TypeReference<CRFinancialBookingLogUpdateOutputModel>(){});
	}
	
	public BQLedgerPostingUpdateOutputModel updateLedgerposting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLedgerPostingUpdateInputModel request){
		return JsonReader.read("update-BQLedgerPostingUpdateOutputModel.json",new TypeReference<BQLedgerPostingUpdateOutputModel>(){});
	}
	
}
