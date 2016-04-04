package org.vinturo.api.sensor;

import org.vinturo.api.ActiveDevice;

/**
 * Created by Sebastien on 11.03.2016.
 */
public abstract class AbstractActiveSensor extends AbstractSensor implements ActiveDevice {

    public void fireMovementDetected() {
        
    }

}
