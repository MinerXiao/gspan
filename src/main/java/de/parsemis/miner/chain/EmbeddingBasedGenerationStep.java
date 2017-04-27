/**
 * created Jun 9, 2006
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

import de.parsemis.miner.general.HPEmbedding;

import java.util.Collection;

/**
 * This class implements the general child generation based on stored
 * embeddings.
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
public class EmbeddingBasedGenerationStep<NodeType, EdgeType> extends
        GenerationStep<NodeType, EdgeType> {
    /**
     * creates a new GenerationStep
     *
     * @param next
     *            the next step of the mining chain
     */
    public EmbeddingBasedGenerationStep(
            final MiningStep<NodeType, EdgeType> next) {
        super(next);
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.miner.MiningStep#call(de.de.parsemis.miner.SearchLatticeNode,
     *      java.util.Collection)
     */
    @Override
    public void call(final SearchLatticeNode<NodeType, EdgeType> node,
                     final Collection<Extension<NodeType, EdgeType>> extensions) {
        super.reset();

        for (final HPEmbedding<NodeType, EdgeType> e : node.allEmbeddings()) {
            super.call(node, e);
        }
        super.call(node, extensions);
    }

}
