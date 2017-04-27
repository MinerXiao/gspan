/**
 * created: 28.01.2008
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
package de.parsemis.miner.general;

import de.parsemis.miner.environment.ThreadEnvironment;

/**
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 *
 * @param <NodeType>
 *            the type of the node labels (will be hashed and checked with
 *            .equals(..))
 * @param <EdgeType>
 *            the type of the edge labels (will be hashed and checked with
 *            .equals(..))
 * @param <DB>
 *            the corresponding DataBaseGraph type
 */
public class DefaultFlatHPEmbedding<NodeType, EdgeType, DB extends DataBaseGraph<NodeType, EdgeType>>
        extends AbstractFlatHPEmbedding<NodeType, EdgeType, DB> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public DefaultFlatHPEmbedding() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.miner.general.HPEmbedding#release(de.de.parsemis.miner.environment.ThreadEnvironment)
     */
    public void release(final ThreadEnvironment<NodeType, EdgeType> tenv) {
        freeTransient();
    }

}
