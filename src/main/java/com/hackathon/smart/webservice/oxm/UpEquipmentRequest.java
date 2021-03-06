package com.hackathon.smart.webservice.oxm;

public class UpEquipmentRequest {
	
	private String sequenceNumber;
	private String equipmentId;
	private String equipmentDescription;
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getEquipmentDescription() {
		return equipmentDescription;
	}
	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpEquipmentRequest [sequenceNumber=");
		builder.append(sequenceNumber);
		builder.append(", equipmentId=");
		builder.append(equipmentId);
		builder.append(", equipmentDescription=");
		builder.append(equipmentDescription);
		builder.append("]");
		return builder.toString();
	}
}
