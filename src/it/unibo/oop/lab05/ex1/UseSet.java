package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final var coll = new TreeSet<String>();
    	for (var i = 1; i <= 20; i++) {
    		coll.add(Integer.toString(i));
    	}
        System.out.println(coll);
        var iter = coll.iterator();
        while(iter.hasNext()) {
        	if(Integer.parseInt(iter.next()) % 3 == 0) {
        		iter.remove();
        	}
        }
        for (var elem : coll) {
        	System.out.println(elem);
        }
        boolean allEven = true;
        for (final var iterator = coll.iterator(); allEven && iterator.hasNext(); allEven = Integer.parseInt(iterator.next()) % 2 == 0);
        
        /*for (var elem : coll) {
        	if (Integer.parseInt(elem) % 2 != 0) {
        		allEven = false;
        		break;
        	}
        }*/
        
        if (allEven) {
        	System.out.println("All numbers are Even");
        } else {
        	System.out.println("Not all numbers are Even");
        }
    }
}
