/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class FinancialAccountingApiController {

	@Autowired
	FinancialAccountingApiService service;
	
	@Track.Activate
	public BianResponse<SDFinancialAccountingActivateOutputModel> activate(@RequestBody BianRequest<SDFinancialAccountingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("ledgerposting")
	@Track.Capture
	public BianResponse<BQLedgerPostingCaptureOutputModel> captureLedgerposting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLedgerPostingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureLedgerposting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.Configure
	public BianResponse<SDFinancialAccountingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFinancialAccountingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Control
	public BianResponse<CRFinancialBookingLogControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialBookingLogControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Track.Feedback
	public BianResponse<SDFinancialAccountingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFinancialAccountingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Initiate
	public BianResponse<CRFinancialBookingLogInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFinancialBookingLogInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Retrieve
	public BianResponse<CRFinancialBookingLogRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("ledgerposting")
	@Track.Retrieve
	public BianResponse<BQLedgerPostingRetrieveOutputModel> retrieveLedgerposting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLedgerposting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Track.RetrieveSD
	public BianResponse<SDFinancialAccountingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Track.Update
	public BianResponse<CRFinancialBookingLogUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialBookingLogUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("ledgerposting")
	@Track.Update
	public BianResponse<BQLedgerPostingUpdateOutputModel> updateLedgerposting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLedgerPostingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLedgerposting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
