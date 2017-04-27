/**
 * Created on Jan 25, 2007
 *
 * @by Olga Urzova (siolurzo@stud.informatik.uni-erlangen.de)
 * <p>
 * Copyright 2007 Olga Urzova
 * <p>
 * This file is part of de.parsemis.
 * <p>
 * Licence:
 * LGPL: http://www.gnu.org/licenses/lgpl.html
 * EPL: http://www.eclipse.org/org/documents/epl-v10.php
 * See the LICENSE file in the project's top-level directory for details.
 */
package de.parsemis.visualisation.gui;

import de.parsemis.graph.HPGraph;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Olga Urzova (siolurzo@stud.informatik.uni-erlangen.de)
 *
 * @param <NodeType>
 *            the type of the node labels (will be hashed and checked with
 *            .equals(..))
 * @param <EdgeType>
 *            the type of the edge labels (will be hashed and checked with
 *            .equals(..))
 */
public class MyListModel<NodeType, EdgeType> extends DefaultListModel implements
        ComboBoxModel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    int fragmentsNumber;

    String fragmentsCached[];

    private final ArrayList<HPGraph<NodeType, EdgeType>> listElements;

    private Object currentElement;

    private boolean isFragmentList = true;

    public MyListModel(final ArrayList<HPGraph<NodeType, EdgeType>> f,
                       final boolean b) {
        listElements = f;
        fragmentsNumber = listElements.size();
        fragmentsCached = new String[fragmentsNumber];
        isFragmentList = b;
    }

    /*
     * (non-Javadoc)
     *
     * @see javax.swing.DefaultListModel#getElementAt(int)
     */
    @Override
    public Object getElementAt(final int index) {
        if (fragmentsCached[index] != null) {
            return fragmentsCached[index];
        }
        String text = null;
        if (isFragmentList) {
            text = "Fragment " + (index + 1);
        } else {
            text = "Graph " + listElements.get(index).getName();
        }
        fragmentsCached[index] = text;
        return text;
    }

    public HPGraph<NodeType, EdgeType> getListElementAt(final int index) {
        return listElements.get(index);
    }

    public ArrayList<HPGraph<NodeType, EdgeType>> getListElements() {
        return listElements;
    }

    public Object getSelectedItem() {
        return currentElement;
    }

    /*
     * (non-Javadoc)
     *
     * @see javax.swing.DefaultListModel#getSize()
     */
    @Override
    public int getSize() {
        return fragmentsNumber;
    }

    public void setSelectedItem(final Object o) {
        currentElement = o;
        this.fireContentsChanged(this, -1, -1);

    }

}
