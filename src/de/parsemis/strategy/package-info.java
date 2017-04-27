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
 * Contains different strategies for the traversal of a search lattice.
 * <p>
 * Memorize {@link de.parsemis.miner.chain.SearchLatticeNode} objects as well
 * as multi-threaded distribution is handled in this package.
 * <p>
 * The required initial nodes and how to extend them (see the
 * {@link de.parsemis.miner.chain.Extender} class) depends on the
 * {@link de.parsemis.algorithms.Algorithm}.
 * <p>
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 */

/**
 * Contains different strategies for the traversal of a search lattice.
 * <p>
 * Memorize {@link de.parsemis.miner.chain.SearchLatticeNode} objects as well
 * as multi-threaded distribution is handled in this package.
 * <p>
 * The required initial nodes and how to extend them (see the 
 * {@link de.parsemis.miner.chain.Extender} class) depends on the 
 * {@link de.parsemis.algorithms.Algorithm}.
 * <p>
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 */
package de.parsemis.strategy;
