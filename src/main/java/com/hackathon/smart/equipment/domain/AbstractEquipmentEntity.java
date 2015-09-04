package com.hackathon.smart.equipment.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@SuppressWarnings("rawtypes")
@MappedSuperclass
public class AbstractEquipmentEntity implements Serializable, Comparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String equipmentId;
	private String sequenceNumber;
	private String processingStatus;
	public String getProcessingStatus() {
		return processingStatus;
	}


	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	private long version;
	
 
	public AbstractEquipmentEntity(String equipmentId,String sequenceNumber,String processingStatus, long version){
		this.equipmentId=equipmentId;
		this.sequenceNumber = sequenceNumber;
		this.version = version;
		this.processingStatus = processingStatus;
	}
	
	
	public String getEquipmentId() {
		return equipmentId;
	}


	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}


	public String getSequenceNumber() {
		return sequenceNumber;
	}


	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}


	public long getVersion() {
		return version;
	}


	public void setVersion(long version) {
		this.version = version;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (equipmentId == null ? 0 : equipmentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AbstractEquipmentEntity other = (AbstractEquipmentEntity) obj;
		if (equipmentId == null) {
			if (other.equipmentId != null) {
				return false;
			}
		} else if (!equipmentId.equals(other.equipmentId)) {
			return false;
		}
		return true;
	}

}
