/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.docretrieve.entity;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.orchestration.AuditTransformer;
import gov.hhs.fha.nhinc.orchestration.NhinAggregator;
import gov.hhs.fha.nhinc.orchestration.NhinDelegate;
import gov.hhs.fha.nhinc.orchestration.PolicyTransformer;
import ihe.iti.xds_b._2007.RetrieveDocumentSetRequestType;
import ihe.iti.xds_b._2007.RetrieveDocumentSetResponseType;

/**
 *
 * @author mweaver
 */
public class EntityDocRetrieveOrchestratableImpl_a0 extends EntityDocRetrieveOrchestratable {
    private RetrieveDocumentSetResponseType response;

    public EntityDocRetrieveOrchestratableImpl_a0(RetrieveDocumentSetRequestType body, AssertionType assertion,PolicyTransformer pt, AuditTransformer at, NhinDelegate nd, NhinAggregator na)
    {
        super(pt, at, nd, na);
        super.setRequest(body);
        super.setAssertion(assertion);
    }
    
    public RetrieveDocumentSetResponseType getResponse() {
        return response;
    }

    public void setResponse(RetrieveDocumentSetResponseType response) {
        this.response = response;
    }

}
