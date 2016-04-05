/**
 * This file is part of the Vinturo package.
 *
 * (c) Sebastien Vermeille <sebastien.vermeille@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.vinturo.api.light;

import org.vinturo.api.PassiveDevice;

public interface Light extends PassiveDevice {

    void turnOn();

    void turnOff();

    void toggle();

    boolean isOn();

    boolean isOff();
}
