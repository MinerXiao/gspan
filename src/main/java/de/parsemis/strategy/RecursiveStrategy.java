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

import de.parsemis.MainFrame;
import de.parsemis.algorithms.Algorithm;
import de.parsemis.miner.chain.Extender;
import de.parsemis.miner.chain.SearchLatticeNode;
import de.parsemis.miner.environment.LocalEnvironment;
import de.parsemis.miner.general.Fragment;
import de.parsemis.utils.Frequented;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.Iterator;

import static de.parsemis.miner.environment.Debug.*;

/**
 * This class represents the local recursive strategy.
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
public class RecursiveStrategy<NodeType, EdgeType> implements
        Strategy<NodeType, EdgeType> {
    private static Logger logger = Logger.getLogger(RecursiveStrategy.class);

    private Extender<NodeType, EdgeType> extender;

    private Collection<Fragment<NodeType, EdgeType>> ret;

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.strategy.Strategy#search(de.de.parsemis.miner.Algorithm,
     *      int)
     */
    public Collection<Fragment<NodeType, EdgeType>> search(
            final Algorithm<NodeType, EdgeType> algo) {
        ret = LocalEnvironment.env(this).getReturnSet();
        extender = algo.getExtender(0);

        for (final Iterator<SearchLatticeNode<NodeType, EdgeType>> it = algo
                .initialNodes(); it.hasNext(); ) {
            final SearchLatticeNode<NodeType, EdgeType> code = it.next();
            search(code);
            it.remove();
        }

        return ret;
    }

    @SuppressWarnings("unchecked")
    private void search(final SearchLatticeNode<NodeType, EdgeType> node) {

        final Collection<SearchLatticeNode<NodeType, EdgeType>> tmp = extender
                .getChildren(node);

        for (final SearchLatticeNode<NodeType, EdgeType> child : tmp) {
            search(child);
        }

        if (node.store()) {
            //System.err.println("node:" + node);
            node.store(ret);
        } else {
            node.release();
        }

        node.finalizeIt();
    }

}
