package org.vinturo.api.light;

/**
 * Created by Sebastien on 11.03.2016.
 */
public abstract class AbstractLight implements Light {

    public void toggle() {
        if(isOn()) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public boolean isOff() {
        return !isOn();
    }

}
