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
package de.parsemis.miner.chain;

import de.parsemis.utils.Generic;

import java.util.Collection;

/**
 * This class defines the functionality of a single step of the mining process.
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
public abstract class MiningStep<NodeType, EdgeType> implements
        Generic<NodeType, EdgeType> {
    protected final MiningStep<NodeType, EdgeType> next;

    /**
     * creates a new MiningStep, with will call the given <code>next</code>
     * step during the search if necessary
     *
     * @param next
     */
    public MiningStep(final MiningStep<NodeType, EdgeType> next) {
        this.next = next;
    }

    /**
     * tells this step that it is to be used for the given <code>node</code>
     * with the given <code>extensions</code> this function has to call the
     * next step, if necessary.
     *
     * @param node
     * @param extensions
     */
    public abstract void call(SearchLatticeNode<NodeType, EdgeType> node,
                              Collection<Extension<NodeType, EdgeType>> extensions);

    /**
     * calls the next step for the given <code>node</code> with the given
     * <code>extensions</code>
     *
     * @param node
     * @param extensions
     */
    protected final void callNext(
            final SearchLatticeNode<NodeType, EdgeType> node,
            final Collection<Extension<NodeType, EdgeType>> extensions) {
        if (next != null) {
            next.call(node, extensions);
        }
    }

    /**
     * @return the next MiningStep
     */
    public MiningStep<NodeType, EdgeType> getNext() {
        return next;
    }

}
