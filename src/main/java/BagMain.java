/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     *
     * Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     *
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {

        for (int b = 0; b < bags.length; ) {
            bags[b].enhance();
            if (double_enhance_handbags & bags[b].getClass() == HandBag.class) {
                bags[b].enhance();

            }
            b = b + 1;
        }
    }

    /**
     *
     * Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        int count_straps = 0;
        for (int bag = 0; bag < bags.length; ) {
            if (bags[bag].getClass() == CrossbodyBag.class) {
                CrossbodyBag bag1 = (CrossbodyBag) bags[bag];
                count_straps += bag1.getNumberOfStraps();

            }
            bag = bag + 1;
        }
        return count_straps;
    }
}
