/*
 * *** Luciana Pinel / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    if (setA == null || setB == null) {
      return new TreeSet<>(); // nothing to compare
    }

    Set<Integer> onlyA = new TreeSet<>(setA);
    Set<Integer> onlyB = new TreeSet<>(setB);

    onlyA.removeAll(setB); // unique to A
    onlyB.removeAll(setA); // unique to B

    onlyA.addAll(onlyB);   // union of uniques
    return onlyA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    if (treeMap == null) {
      return; // nothing to do
    }

    Iterator<Integer> it = treeMap.keySet().iterator();
    while (it.hasNext()) {
      int key = it.next();
      if (key % 2 == 0) {
        it.remove(); // safely remove this entry
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    if (tree1 == null && tree2 == null) {
      return true;
    }
    if (tree1 == null || tree2 == null) {
      return false;
    }
    return tree1.equals(tree2);
  }

} // end treeProblems class
