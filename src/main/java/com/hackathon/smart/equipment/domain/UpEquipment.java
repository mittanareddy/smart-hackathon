package com.hackathon.smart.equipment.domain;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "UP_EQUIPMENT", indexes = { @Index(columnList = "NAME", name = "IDX_EQUIP_NAME")})
public class UpEquipment extends AbstractEquipmentEntity{

	public UpEquipment(String equipmentId, String sequenceNumber, String version) {
		super(equipmentId, sequenceNumber, version);
		// TODO Auto-generated constructor stub
	}

}
