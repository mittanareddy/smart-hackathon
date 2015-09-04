package com.hackathon.smart.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

@WebService
public interface EquipmentWebService {
	@WebMethod
	public String setEquipment(@WebParam(name="setEquipmentRequest") SetEquipmentRequest req);
	@WebMethod
	public String upEquipment(@WebParam(name="upEquipmentRequest") UpEquipmentRequest req);	
	@WebMethod
	public String updateEquipmentSnowDetails(@WebParam(name="updateEquipmentSnow") UpdateEquipmentSnowRequest req);

}
