package com.hackathon.smart.equipment.domain;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "SNOW_EQUIPMENT", indexes = { @Index(columnList = "NAME", name = "IDX_EQUIP_NAME")})
public class SnowEquipment extends AbstractEquipmentEntity {

	public SnowEquipment(String equipmentId, String sequenceNumber,
			String version) {
		super(equipmentId, sequenceNumber, version);
		// TODO Auto-generated constructor stub
	}

}
