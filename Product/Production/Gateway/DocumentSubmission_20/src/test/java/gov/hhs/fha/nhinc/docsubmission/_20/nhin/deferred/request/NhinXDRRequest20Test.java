/*
 * Copyright (c) 2012, United States Government, as represented by the Secretary of Health and Human Services.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above
 *       copyright notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the documentation
 *       and/or other materials provided with the distribution.
 *     * Neither the name of the United States Government nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE UNITED STATES GOVERNMENT BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package gov.hhs.fha.nhinc.docsubmission._20.nhin.deferred.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import gov.hhs.fha.nhinc.aspect.InboundMessageEvent;
import gov.hhs.fha.nhinc.docsubmission.aspect.DocSubmissionBaseEventDescriptionBuilder;
import ihe.iti.xds_b._2007.ProvideAndRegisterDocumentSetRequestType;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author achidamb
 *
 */
public class NhinXDRRequest20Test {
    @Test
    public void hasInboundMessageEvent() throws Exception {
        Class<NhinXDRRequest20> clazz = NhinXDRRequest20.class;
        Method method = clazz.getMethod("provideAndRegisterDocumentSetBDeferredRequest",
                ProvideAndRegisterDocumentSetRequestType.class);
        InboundMessageEvent annotation = method.getAnnotation(InboundMessageEvent.class);
        assertNotNull(annotation);
        assertEquals(DocSubmissionBaseEventDescriptionBuilder.class, annotation.beforeBuilder());
        assertEquals(DocSubmissionBaseEventDescriptionBuilder.class, annotation.afterReturningBuilder());
        assertEquals("Document Submission Deferred Request", annotation.serviceType());
        assertEquals("2.0", annotation.version());
    }
}
