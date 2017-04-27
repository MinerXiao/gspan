/**
 * created May 31, 2006
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
package de.parsemis.graph;

/**
 * A wrapper to use HPMutableGraphs like normal MutableGraphs.
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
class HPMutableWrapper<NodeType, EdgeType> extends
        HPWrapper<NodeType, EdgeType> implements
        MutableGraph<NodeType, EdgeType> {

    /**
     *
     */
    private static final long serialVersionUID = 4840335481429665326L;

    /**
     * creates a wrapper for the given master graph
     *
     * @param master
     */
    HPMutableWrapper(final HPMutableGraph<NodeType, EdgeType> master) {
        super(master);
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.graph.MutableGraph#addEdge(de.de.parsemis.graph.Node,
     *      de.de.parsemis.graph.Node, EdgeType, int)
     */
    public Edge<NodeType, EdgeType> addEdge(
            final Node<NodeType, EdgeType> nodeA,
            final Node<NodeType, EdgeType> nodeB, final EdgeType label,
            final int direction) {
        final HPMutableGraph<NodeType, EdgeType> master = (HPMutableGraph<NodeType, EdgeType>) super.master;
        return new MyEdge<NodeType, EdgeType>(this, master.addEdgeIndex(nodeA
                .getIndex(), nodeB.getIndex(), label, direction));
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.graph.MutableGraph#addNode(NodeType)
     */
    public Node<NodeType, EdgeType> addNode(final NodeType label) {
        final HPMutableGraph<NodeType, EdgeType> master = (HPMutableGraph<NodeType, EdgeType>) super.master;
        return new MyNode<NodeType, EdgeType>(this, master
                .addNodeIndex(label));
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.graph.MutableGraph#addNodeAndEdge(de.de.parsemis.graph.Node,
     *      NodeType, EdgeType, int)
     */
    public Node<NodeType, EdgeType> addNodeAndEdge(
            final Node<NodeType, EdgeType> nodeA, final NodeType nodeBLabel,
            final EdgeType edgeLabel, final int direction) {
        final HPMutableGraph<NodeType, EdgeType> master = (HPMutableGraph<NodeType, EdgeType>) super.master;
        return new MyNode<NodeType, EdgeType>(this, master.addNodeAndEdgeIndex(
                nodeA.getIndex(), nodeBLabel, edgeLabel, direction));
    }

    /*
     * (non-Javadoc)
     *
     * @see src.de.pargra.utils.Cloneable#clone()
     */
    @Override
    public Graph<NodeType, EdgeType> clone() {
        return new HPMutableWrapper<NodeType, EdgeType>(
                (HPMutableGraph<NodeType, EdgeType>) master.clone());
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.graph.MutableGraph#removeEdge(de.de.parsemis.graph.Edge)
     */
    public boolean removeEdge(final Edge<NodeType, EdgeType> edge) {
        final HPMutableGraph<NodeType, EdgeType> master = (HPMutableGraph<NodeType, EdgeType>) super.master;
        return master.removeEdge(edge.getIndex());
    }

    /*
     * (non-Javadoc)
     *
     * @see de.de.parsemis.graph.MutableGraph#removeNode(de.de.parsemis.graph.Node)
     */
    public boolean removeNode(final Node<NodeType, EdgeType> node) {
        final HPMutableGraph<NodeType, EdgeType> master = (HPMutableGraph<NodeType, EdgeType>) super.master;
        return master.removeNode(node.getIndex());
    }

}
