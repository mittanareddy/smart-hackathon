/**
 * 
 */
package com.hackathon.smart.gemfire.cache;

import com.hackathon.smart.equipment.domain.Equipment;
import com.hackathon.smart.equipment.domain.SnowEquipment;
import com.hackathon.smart.equipment.domain.UpEquipment;
import com.hackathon.smart.integration.model.EquipmentModel;
import com.hackathon.smart.integration.model.UpEquipmentModel;
import com.hackathon.smart.integration.model.UpdateSnowEquipmentModel;

/**
 * @author cmittana
 *
 */
public interface ObScanGFService {
	
	public Equipment saveEquipment(EquipmentModel equipmentModel);
	public UpEquipment saveUpEquipment(UpEquipmentModel upEquipmentModel);
	public SnowEquipment saveUpEquipment(UpdateSnowEquipmentModel updateSnowEquipmentModel);

}
