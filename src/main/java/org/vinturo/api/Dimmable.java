package org.vinturo.api;

/**
 * Created by Sebastien on 11.03.2016.
 */
public interface Dimmable extends Device {

    int getMaxValue();

    void setValue(int value);

    int getValue();

}
