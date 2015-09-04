package com.hackathon.smart.service;

import com.hackathon.smart.integration.model.EquipmentModel;
import com.hackathon.smart.integration.model.UpEquipmentModel;
import com.hackathon.smart.integration.model.UpdateSnowEquipmentModel;

public interface IncomingEquipmentService {
	// Equipment
	Void setEquipment(EquipmentModel equipmentModel) ;
	// Up Equipment
	Void upEquipment(UpEquipmentModel upEquipmentModel) ;
	// Update Snow Equipment
	Void updateEquipmentSnowDetails(UpdateSnowEquipmentModel updateSnowEquipmentModel) ;
}
