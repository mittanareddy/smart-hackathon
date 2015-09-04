package com.hackathon.smart.persistence.services;

import com.hackathon.smart.equipment.domain.Equipment;
import com.hackathon.smart.integration.model.EquipmentModel;

public interface EquipmentPersistenceService {
	Equipment save(EquipmentModel e);
}
