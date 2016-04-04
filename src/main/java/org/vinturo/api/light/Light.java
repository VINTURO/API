package org.vinturo.api.light;

import org.vinturo.api.PassiveDevice;

/**
 * Created by Sebastien on 11.03.2016.
 */
public interface Light extends PassiveDevice {

    void turnOn();

    void turnOff();

    void toggle();

    boolean isOn();

    boolean isOff();
}
