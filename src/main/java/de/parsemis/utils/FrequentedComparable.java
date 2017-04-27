/**
 * created 12.01.2008
 *
 * @by Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 * <p>
 * Copyright 2008 Marc Woerlein
 * <p>
 * This file is part of de.parsemis.
 * <p>
 * Licence:
 * LGPL: http://www.gnu.org/licenses/lgpl.html
 * EPL: http://www.eclipse.org/org/documents/epl-v10.php
 * See the LICENSE file in the project's top-level directory for details.
 */

package de.parsemis.utils;

/**
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 *
 * @param <Type>
 *            type to be comparable with
 */
public interface FrequentedComparable<Type> extends Frequented,
        Comparable<Type> {

}
