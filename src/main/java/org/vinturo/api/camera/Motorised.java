/**
 * This file is part of the Vinturo package.
 *
 * (c) Sebastien Vermeille <sebastien.vermeille@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.vinturo.api.camera;

/**
 * This class represent add features to a motorized camera device.
 *
 * Each plugin extending that class will automatically obtain some specific features
 *
 * @author Sebastien Vermeille <sebastien.vermeille@gmail.com>
 */
public interface Motorised {

    /**
     * Called when user ask the camera to turn to the left
     */
    void onLeft();

    /**
     * Called when user ask the camera to turn to the right
     */
    void onRight();

    /**
     * Called when user ask the camera to move up
     */
    void onUp();

    /**
     * Called when user ask the camera to move down
     */
    void onDown();

}
