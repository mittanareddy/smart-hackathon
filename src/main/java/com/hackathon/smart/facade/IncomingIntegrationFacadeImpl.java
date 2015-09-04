package com.hackathon.smart.facade;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.hackathon.smart.service.IncomingEquipmentService;
import com.hackathon.smart.service.TransformationService;
import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

@Service("incomingIntegrationFacade")
public class IncomingIntegrationFacadeImpl implements IncomingIntegrationFacade {
	@Autowired
	private IncomingEquipmentService incomingEquipmentService;
	@Autowired
	private TransformationService transformationService;

	@Override
	public Future<Void> setEquipment(SetEquipmentRequest request) {
		// TODO Auto-generated method stub
		return new AsyncResult<Void> ( incomingEquipmentService.setEquipment(transformationService.transformSetEquipment(request)));
	}

	@Override
	public Future<Void> upEquipment(UpEquipmentRequest request) {
		// TODO Auto-generated method stub
		return new AsyncResult<Void> ( incomingEquipmentService.upEquipment(transformationService.transformSetUpEquipment(request)));
	}

	@Override
	public Future<Void> updateEquipmentSnowDetails(
			UpdateEquipmentSnowRequest request) {
		// TODO Auto-generated method stub
		return new AsyncResult<Void> ( incomingEquipmentService.updateEquipmentSnowDetails(transformationService.transformUpdateSnowEquipment(request)));
	}

}
