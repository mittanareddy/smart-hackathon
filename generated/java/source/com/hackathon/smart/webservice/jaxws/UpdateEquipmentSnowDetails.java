
package com.hackathon.smart.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hackathon.smart.webservice.oxm.UpdateEquipmentSnowRequest;

@XmlRootElement(name = "updateEquipmentSnowDetails", namespace = "http://webservice.smart.hackathon.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEquipmentSnowDetails", namespace = "http://webservice.smart.hackathon.com/")
public class UpdateEquipmentSnowDetails {

    @XmlElement(name = "updateEquipmentSnow", namespace = "")
    private UpdateEquipmentSnowRequest updateEquipmentSnow;

    /**
     * 
     * @return
     *     returns UpdateEquipmentSnowRequest
     */
    public UpdateEquipmentSnowRequest getUpdateEquipmentSnow() {
        return this.updateEquipmentSnow;
    }

    /**
     * 
     * @param updateEquipmentSnow
     *     the value for the updateEquipmentSnow property
     */
    public void setUpdateEquipmentSnow(UpdateEquipmentSnowRequest updateEquipmentSnow) {
        this.updateEquipmentSnow = updateEquipmentSnow;
    }

}
