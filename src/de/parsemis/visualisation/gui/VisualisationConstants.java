/**
 * Created on Jul 06, 2007
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

import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 *
 * @author Olga Urzova (siolurzo@stud.informatik.uni-erlangen.de)
 *
 */
public class VisualisationConstants {

    public static Color cellBorderColor = new Color(200, 221, 242);
    public static Color selectedFragmentColor = new Color(232, 239, 247);
    public static Color disabledColor = new Color(151, 151, 151);
    public static Color enabledColor = new Color(51, 51, 51);

    public static EmptyBorder currentValuesBorder = new EmptyBorder(5, 10, 5, 5);
    public static EmptyBorder standardBorder = new EmptyBorder(5, 5, 5, 5);
    public static Dimension cellElementDimension = new Dimension(100, 100);
    public static EmptyBorder selectedFragmentBorder = new EmptyBorder(5, 0, 0,
            0);
    public static EmptyBorder emptyBorder = new EmptyBorder(0, 0, 0, 0);
}
