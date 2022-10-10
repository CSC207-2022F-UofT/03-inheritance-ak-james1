/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;

    private String[]  contents;

    /*
     *
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag (String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[0];
    }




    /*
     * // Getter for colour
     */

    public String getColor() {
        return this.color;
    }

    // Getter for NumberOfContents
    public int getNumberOfContents() {
        return this.numberOfContents;
    }


    /*
     * Getter for  Capacity
     */

    public int getCapacity() {
        return this.capacity;
    }




    /*
     * Setter for color
     */

    public void setColor(String color1) {
        this.color = color1;
    }





    /*
     *
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item) {
        int cap = this.contents.length;
         if (this.numberOfContents < this.capacity) {
             String[] newContents = new String[cap + 1];
             for (int i = 0; i < cap ; ) {
                 newContents[i] = this.contents[i];
                 i = i + 1;
                 }
             newContents[cap] = item;
             this.contents = newContents;
             this.numberOfContents += 1;
             return true;
         }
         return false;
    }






    /**
     *
     *
     * If there are no items in this Bag, return null.
     *
     * @return number of items
     */
    public Object popItem() {
        if (this.numberOfContents == 0) {
            return null;
        }
        else {
            int size = this.contents.length - 1;
            String item = this.contents[size];
            String[] newContents = new String[size];
            for (int i = 0; i < size ; ) {
                newContents[i] = this.contents[i];
                i = i + 1;
            }
            this.numberOfContents -=  1;
            this.contents = newContents;
            return item;
            }
        }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {

        this.capacity = this.capacity + n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}