/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.furniture;

public class FurnitureImpl {
    // This is the main method which is the entry point of the program.
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setCode("112232334");
        furnitureItem.setColour("red");
        furnitureItem.setGrade("grade1");
        furnitureItem.setType("indor");
        furnitureItem.setPrice(2500.5f);
        float price = furnitureItem.getPrice();
        System.out.println(" Amount After discount is : " + furnitureItem.calculateDiscount("12231423", "for me", "grade1", "outdoor", price));


    }
}
