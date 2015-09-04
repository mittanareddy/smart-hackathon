package com.hackathon.smart.webservice;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.smart.facade.IncomingIntegrationFacade;
import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;


@Service("equipmentWebService")
@WebService(endpointInterface = "com.hackathon.smart.webservice.EquipmentWebService")
public class EquipmentWebServiceImpl implements EquipmentWebService{

	@Autowired
	private IncomingIntegrationFacade integrationFacade;
	
	@Override
	public String setEquipment(SetEquipmentRequest req) {
		String resp = "success";
		integrationFacade.setEquipment(req);
		return resp;
	}

	@Override
	public String upEquipment(UpEquipmentRequest req) {
		String resp = "success";
		integrationFacade.upEquipment(req);
		return resp;
	}

	@Override
	public String updateEquipmentSnowDetails(UpdateEquipmentSnowRequest req) {
		String resp = "success";
		integrationFacade.updateEquipmentSnowDetails(req);
		return resp;
	}

}
