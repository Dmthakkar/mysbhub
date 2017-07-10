package com.mysbhub.client;

import org.apache.axis2.transport.http.HttpTransportProperties.Authenticator;
import java.net.PasswordAuthentication;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.mysbhub.externalquerynameavailability.ExternalQueryNameAvailabilityServiceV2Stub;

import au.gov.asic.availability.name.query.external.v2.RequestDocument;
import au.gov.asic.types.NameAvailabilityResponseType;
import au.gov.asic.types.ObjectionType;
import au.gov.asic.types.header.document.business.BusinessDocumentHeaderType;
import au.gov.asic.types.header.document.business.MessageEventType;
import au.gov.asic.types.header.document.business.MessageEventsType;
import au.gov.asic.types.nni.QueryNniNameType;
import au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType;
import au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType;
import au.gov.asic.availability.name.query.external.v2.ReplyDocument;

public class QueryNameClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalQueryNameAvailabilityServiceV2Stub stub;
		try {
			stub = new ExternalQueryNameAvailabilityServiceV2Stub();
			
/*			Authenticator myAuth = new Authenticator(){
				@Override
			    protected PasswordAuthentication getPasswordAuthentication()
			    {
			        return new PasswordAuthentication("ASICM2MRA@AYAN.COM.AU", "T0day12345".toCharArray());
			    }				
			};
			Authenticator.setDefault(myAuth);
*/
			
			HttpTransportProperties.Authenticator basicAuthenticator = new HttpTransportProperties.Authenticator();
			List<String> authSchemes = new ArrayList<String>();
			authSchemes.add(Authenticator.BASIC);
			basicAuthenticator.setAuthSchemes(authSchemes); 
			basicAuthenticator.setUsername("ASICM2MRA@AYAN.COM.AU"); // Set your value
			basicAuthenticator.setPassword("T0day12345"); // Set your value
			basicAuthenticator.setPreemptiveAuthentication(true);
			stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, basicAuthenticator);
			stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, "false");


			BusinessDocumentHeaderType businessDocHeader = BusinessDocumentHeaderType.Factory.newInstance();
			businessDocHeader.setMessageType("queryNameAvailability");
			businessDocHeader.setMessageReferenceNumber("40124");
			businessDocHeader.setMessageVersion(2);
			businessDocHeader.setSenderId("000040190");
			businessDocHeader.setSenderType("REGA");

			QueryNniNameType queryNniNameType = QueryNniNameType.Factory.newInstance();
			queryNniNameType.setCompanyNameAvailabilityCheck(true);
			queryNniNameType.setProposedName("AYAN BUSINESS LOGICS PROPRIETARY LIMITED");

			QueryNameAvailabilityRequestType queryName = QueryNameAvailabilityRequestType.Factory.newInstance();
			queryName.setBusinessDocumentBody(queryNniNameType);
			queryName.setBusinessDocumentHeader(businessDocHeader);


			RequestDocument reqDoc = RequestDocument.Factory.newInstance();
			reqDoc.setRequest(queryName);		

			ReplyDocument replyDoc;
			replyDoc = stub.externalQueryNameAvailability(reqDoc);

			QueryNameAvailabilityReplyType queryNameReply = replyDoc.getReply();
			BusinessDocumentHeaderType docHeaderType = queryNameReply.getBusinessDocumentHeader();
			NameAvailabilityResponseType nameResponseType = queryNameReply.getBusinessDocumentBody();
			System.out.println(nameResponseType.getShortDescription());
			System.out.println(nameResponseType.getCode());
			for(ObjectionType oType : nameResponseType.getObjectionArray()){
				System.out.println("Code: " +oType.getCode() + ", Desc " + oType.getDescriptions());
			}

/*			MessageEventsType msgEvents = docHeaderType.getMessageEvents();
			for(MessageEventType msgEvent : msgEvents.getMessageEventArray()){
				System.out.println(msgEvent.getErrorCode());
			}
*/
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
