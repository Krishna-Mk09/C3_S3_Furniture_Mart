/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.furniture;

public class FurnitureItem {
    private String code;
    private String type;
    private String grade;
    private String colour;
    private String usage;
    private double price;

    public FurnitureItem() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
