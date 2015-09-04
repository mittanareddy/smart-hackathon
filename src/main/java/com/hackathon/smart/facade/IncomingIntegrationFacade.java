package com.hackathon.smart.facade;

import java.util.concurrent.Future;

import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

public interface IncomingIntegrationFacade {

	Future<Void> setEquipment(SetEquipmentRequest request);
	Future<Void> upEquipment(UpEquipmentRequest request);
	Future<Void> updateEquipmentSnowDetails(UpdateEquipmentSnowRequest request);
	
}
