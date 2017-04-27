/**
 * created: 25.02.2008
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
package de.parsemis.jp;

import de.parsemis.utils.SynchronizedCounter;

/**
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 * @remote
 */
public class RemoteCounter implements SynchronizedCounter {

    private int val = 0;

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.utils.SynchronizedCounter#next()
     */
    public synchronized int next() {
        return val++;
    }

}
