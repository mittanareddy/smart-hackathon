package com.hackathon.smart.equipment.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "EQUIPMENT", indexes = { @Index(columnList = "NAME", name = "IDX_EQUIP_NAME")})
@Access(AccessType.FIELD)
public class Equipment extends AbstractEquipmentEntity{

	/**
	 * 
	 */
	private String scanType;
	
	private static final long serialVersionUID = 1L;

	public Equipment(String equipmentId, String sequenceNumber,String processingStatus, long version) {
		super(equipmentId, sequenceNumber, processingStatus, version);
		// TODO Auto-generated constructor stub
	}

	public String getScanType() {
		return scanType;
	}

	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

}
