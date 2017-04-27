/**
 * created May 23, 2006
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
package de.parsemis.algorithms.gSpan;

import de.parsemis.miner.environment.LocalEnvironment;
import de.parsemis.miner.environment.ThreadEnvironment;
import de.parsemis.miner.environment.ThreadEnvironmentFactory;

/**
 * Generates new thread environments for the gSpan algorithm.
 *
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 *
 * @param <NodeType>
 *            the type of the node labels (will be hashed and checked with
 *            .equals(..))
 * @param <EdgeType>
 *            the type of the edge labels (will be hashed and checked with
 *            .equals(..))
 */
public class GThreadEnvFactory<NodeType, EdgeType> implements
        ThreadEnvironmentFactory<NodeType, EdgeType> {

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.utils.ThreadEnvironmentFactory#getNewEnvironement()
     */
    public ThreadEnvironment<NodeType, EdgeType> getNewEnvironment(
            final int idx, final LocalEnvironment<NodeType, EdgeType> env) {
        return new GThreadEnvironment<NodeType, EdgeType>(idx);
    }

}
