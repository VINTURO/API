/**
 * This file is part of the Vinturo package.
 *
 * (c) Sebastien Vermeille <sebastien.vermeille@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.vinturo.api;

public class RGBColor {

    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

}
