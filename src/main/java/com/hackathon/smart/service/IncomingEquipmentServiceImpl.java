package com.hackathon.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.smart.executor.EquipmentExecutor;
import com.hackathon.smart.integration.model.EquipmentModel;
import com.hackathon.smart.integration.model.UpEquipmentModel;
import com.hackathon.smart.integration.model.UpdateSnowEquipmentModel;

@Service("incomingEquipmentService")
public class IncomingEquipmentServiceImpl implements IncomingEquipmentService {

	@Autowired
	private EquipmentExecutor equipmentExecutor;
	
	@Override
	public Void setEquipment(EquipmentModel equipmentModel) {
		equipmentExecutor.setEquipment(equipmentModel);
		return null;
	}

	@Override
	public Void upEquipment(UpEquipmentModel upEquipmentModel) {
		equipmentExecutor.setUpEquipment(upEquipmentModel);
		return null;
	}

	@Override
	public Void updateEquipmentSnowDetails(
			UpdateSnowEquipmentModel updateSnowEquipmentModel) {
		equipmentExecutor.setUpdateSnowEquipment(updateSnowEquipmentModel);
		return null;
	}

}
