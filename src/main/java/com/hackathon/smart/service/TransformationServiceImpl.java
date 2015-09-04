package com.hackathon.smart.service;

import com.hackathon.smart.integration.model.EquipmentModel;
import com.hackathon.smart.integration.model.UpEquipmentModel;
import com.hackathon.smart.integration.model.UpdateSnowEquipmentModel;
import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

public class TransformationServiceImpl implements TransformationService {

	@Override
	public EquipmentModel transformSetEquipment(SetEquipmentRequest request) {
		EquipmentModel eModel = new EquipmentModel();
		eModel.setSequenceNumber(request.getSequenceNumber());
		eModel.setEquipmentId(request.getEquipmentId());
		eModel.setEquipmentDescription(request.getEquipmentDescription());
		return eModel;
	}

	@Override
	public UpdateSnowEquipmentModel transformUpdateSnowEquipment(
			UpdateEquipmentSnowRequest request) {
		UpdateSnowEquipmentModel model = new UpdateSnowEquipmentModel();
		model.setSequenceNumber(request.getSequenceNumber());
		model.setEquipmentId(request.getEquipmentId());
		model.setEquipmentDescription(request.getEquipmentDescription());
		return model;
	}

	@Override
	public UpEquipmentModel transformSetUpEquipment(UpEquipmentRequest request) {
		// TODO Auto-generated method stub
		UpEquipmentModel model = new UpEquipmentModel();
		model.setSequenceNumber(request.getSequenceNumber());
		model.setEquipmentId(request.getEquipmentId());
		model.setEquipmentDescription(request.getEquipmentDescription());
		return model;
	}

}
