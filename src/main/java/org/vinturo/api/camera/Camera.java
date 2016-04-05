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
 * This class represent a Camera device.
 *
 * Each plugin extending that class will automatically obtain some specific features like (icons, and gui comportment)
 *
 * @author Sebastien Vermeille <sebastien.vermeille@gmail.com>
 */
public interface Camera {

    /**
     * Return the camera stream URL
     * @return String url
     */
    String getStreamURL();
}
