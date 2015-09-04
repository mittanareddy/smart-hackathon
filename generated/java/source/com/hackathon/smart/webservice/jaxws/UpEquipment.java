
package com.hackathon.smart.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hackathon.smart.webservice.oxm.UpEquipmentRequest;

@XmlRootElement(name = "upEquipment", namespace = "http://webservice.smart.hackathon.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upEquipment", namespace = "http://webservice.smart.hackathon.com/")
public class UpEquipment {

    @XmlElement(name = "upEquipmentRequest", namespace = "")
    private UpEquipmentRequest upEquipmentRequest;

    /**
     * 
     * @return
     *     returns UpEquipmentRequest
     */
    public UpEquipmentRequest getUpEquipmentRequest() {
        return this.upEquipmentRequest;
    }

    /**
     * 
     * @param upEquipmentRequest
     *     the value for the upEquipmentRequest property
     */
    public void setUpEquipmentRequest(UpEquipmentRequest upEquipmentRequest) {
        this.upEquipmentRequest = upEquipmentRequest;
    }

}
