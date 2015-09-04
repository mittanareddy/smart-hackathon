package com.hackathon.smart.service;

import com.hackathon.smart.integration.model.EquipmentModel;
import com.hackathon.smart.integration.model.UpEquipmentModel;
import com.hackathon.smart.integration.model.UpdateSnowEquipmentModel;
import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

public interface TransformationService {
	public EquipmentModel transformSetEquipment(SetEquipmentRequest request);
	public UpdateSnowEquipmentModel transformUpdateSnowEquipment(UpdateEquipmentSnowRequest request);
	public UpEquipmentModel transformSetUpEquipment(UpEquipmentRequest request);
}
