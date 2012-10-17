/**
 * Generated by Gas3 v2.3.2 (Granite Data Services).
 *
 * NOTE: this file is only generated if it does not exist. You may safely put
 * your custom code here.
 */

package com.wineshop.client.services;
	
import javax.inject.Inject;
import org.granite.client.tide.server.ServerSession;
import org.granite.messaging.amf.RemoteClass;
import org.springframework.stereotype.Component;

@Component
@RemoteClass("com.wineshop.services.WelcomeService")
public class WelcomeService extends WelcomeServiceBase {
	
	@Inject
	public WelcomeService(ServerSession serverSession) {
    	super(serverSession);
    }
}