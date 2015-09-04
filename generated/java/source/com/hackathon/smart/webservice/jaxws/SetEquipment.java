
package com.hackathon.smart.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hackathon.smart.webservice.oxm.SetEquipmentRequest;

@XmlRootElement(name = "setEquipment", namespace = "http://webservice.smart.hackathon.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEquipment", namespace = "http://webservice.smart.hackathon.com/")
public class SetEquipment {

    @XmlElement(name = "setEquipmentRequest", namespace = "")
    private SetEquipmentRequest setEquipmentRequest;

    /**
     * 
     * @return
     *     returns SetEquipmentRequest
     */
    public SetEquipmentRequest getSetEquipmentRequest() {
        return this.setEquipmentRequest;
    }

    /**
     * 
     * @param setEquipmentRequest
     *     the value for the setEquipmentRequest property
     */
    public void setSetEquipmentRequest(SetEquipmentRequest setEquipmentRequest) {
        this.setEquipmentRequest = setEquipmentRequest;
    }

}
