/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.furniture;

public class FurnitureItem {
    static final int DISCOUNT = 5;
    private String code;
    private String type;
    private String grade;
    private String colour;
    private String usage;
    private float price;

    // A constructor.
    public FurnitureItem() {
    }

    /**
     * This function returns the code of the country
     *
     * @return The code of the course.
     */
    public String getCode() {
        return code;
    }

    /**
     * This function sets the code of the object to the code passed in as a parameter
     *
     * @param code The code that you received from the user.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This function returns the type of the current object
     *
     * @return The type of the object.
     */
    public String getType() {
        return type;
    }

    /**
     * This function sets the type of the object to the type passed in as a parameter
     *
     * @param type The type of the event.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This function returns the grade of the student
     *
     * @return The grade of the student.
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This function sets the grade of the student
     *
     * @param grade The grade of the student.
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * This function returns the colour of the car.
     *
     * @return The colour of the car.
     */
    public String getColour() {
        return colour;
    }

    /**
     * This function sets the colour of the car to the colour passed in as a parameter.
     *
     * @param colour The colour of the car.
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * This function returns the usage of the command.
     *
     * @return The usage of the command.
     */
    public String getUsage() {
        return usage;
    }

    /**
     * This function sets the usage of the command.
     *
     * @param usage The usage of the command.
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * This function returns the price of the item.
     *
     * @return The price of the item.
     */
    public float getPrice() {
        return price;
    }

    /**
     * This function sets the price of the item.
     *
     * @param price The price of the item.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    // A method that calculates the discount on the price of the furniture item.
    public float calculateDiscount(String Code, String Type, String grade, String usage, float price) {
        if (grade == "grade1" && usage == "outdoor") {
            return this.price - this.price * DISCOUNT / 100;
        }
        return price;
    }
}