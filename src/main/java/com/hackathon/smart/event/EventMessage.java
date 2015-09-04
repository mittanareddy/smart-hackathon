/**
 * 
 */
package com.hackathon.smart.event;

/**
 * @author cmittana
 *
 */
public class EventMessage {
	
	private String eventType;
	private String eventDetails;
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventDetails
	 */
	public String getEventDetails() {
		return eventDetails;
	}
	/**
	 * @param eventDetails the eventDetails to set
	 */
	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

}
