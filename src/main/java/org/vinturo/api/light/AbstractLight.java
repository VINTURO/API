/**
 * This file is part of the Vinturo package.
 *
 * (c) Sebastien Vermeille <sebastien.vermeille@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.vinturo.api.light;

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
