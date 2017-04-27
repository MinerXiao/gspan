/**
 * Created on Apr 20, 2007
 *
 * @by Olga Urzova (siolurzo@stud.informatik.uni-erlangen.de)
 * <p>
 * Copyright 2007 Olga Urzova
 * <p>
 * This file is part of de.parsemis.
 * <p>
 * Licence:
 * LGPL: http://www.gnu.org/licenses/lgpl.html
 * EPL: http://www.eclipse.org/org/documents/epl-v10.php
 * See the LICENSE file in the project's top-level directory for details.
 */
package de.parsemis.visualisation.gui;

import javax.swing.*;

/**
 *
 * @author Olga Urzova (siolurzo@stud.informatik.uni-erlangen.de)
 *
 */
public class ImageHandler {
    /**
     * Returns an ImageIcon, or null if the path was invalid.
     *
     * @param path
     * @return ImageIcon
     */
    public static ImageIcon createImageIcon(final String path) {
        return new ImageIcon(path);

    }
}
