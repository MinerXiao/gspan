/**
 * created May 16, 2006
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
package de.parsemis.strategy;

import de.parsemis.algorithms.Algorithm;
import de.parsemis.miner.general.Fragment;
import de.parsemis.utils.Generic;

import java.util.Collection;

/**
 * This interface encapsulates the requirements of a search strategy.
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
public interface Strategy<NodeType, EdgeType> extends
        Generic<NodeType, EdgeType> {

    /**
     * starts the corresponding strategy
     *
     * @param algo
     *            the algorithm which search space will be used
     * @return the set of found frequent Fragments
     */
    public Collection<Fragment<NodeType, EdgeType>> search(
            Algorithm<NodeType, EdgeType> algo);

}
