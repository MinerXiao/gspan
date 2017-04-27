/**
 * created May 30, 2006
 *
 * @by Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 * <p>
 * Copyright 2006 Marc Woerlein
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
 * This interface represents an iterator over a set of integers
 *
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 *
 */
public interface IntIterator {

    /** @return <code>true</code> if the iteration has more elements. */
    public boolean hasNext();

    /** @return the next element in the iteration */
    public int next();

    /**
     * Removes from the underlying source the last element returned by the
     * iterator (optional operation).
     */
    public void remove();

}
