/**
 * created Aug 20, 2008
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
 * <p>
 * Contains the Gaston Mining Algorithm.
 * <p>
 * It works on databases containing undirected cyclic graphs with arbitrary node and edge labels.
 * <p>
 * The serach in Gaston is splitted in three different parts. The detections of paths, trees, and cyclic graphs
 * (see the {@link de.parsemis.algorithms.gaston.GastonPath},
 * {@link de.parsemis.algorithms.gaston.GastonTree}, and
 * {@link de.parsemis.algorithms.gaston.GastonCycle} class).
 * <p>
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 * @see <a target="_new" href="http://www.liacs.nl/~snijssen/gaston/">The original Gaston page</a>
 * <p>
 */

/**
 * Contains the Gaston Mining Algorithm.
 * <p>
 * It works on databases containing undirected cyclic graphs with arbitrary node and edge labels. 
 * <p>
 * The serach in Gaston is splitted in three different parts. The detections of paths, trees, and cyclic graphs 
 * (see the {@link de.parsemis.algorithms.gaston.GastonPath},
 * {@link de.parsemis.algorithms.gaston.GastonTree}, and
 * {@link de.parsemis.algorithms.gaston.GastonCycle} class).
 * <p>
 * @see <a target="_new" href="http://www.liacs.nl/~snijssen/gaston/">The original Gaston page</a>
 * <p>
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 */
package de.parsemis.algorithms.gaston;
