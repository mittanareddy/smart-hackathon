/**
 * 
 */
package com.hackathon.smart.eventprocessor;

import com.hackathon.smart.event.EventMessage;

/**
 * @author cmittana
 *
 */
public interface ObScanEventProcessingService {
	public void onEventMessage(EventMessage _eventMessage);
}
