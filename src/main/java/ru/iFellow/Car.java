package ru.iFellow;

abstract class Car {
    private String model;
    private int year;
    private boolean isAutomatic;
    private String color;
    private String brand;
    private int mileage;

    public Car(String model, int year, boolean isAutomatic, String color, String brand, int mileage) {
        this.model = model;
        this.year = year;
        this.isAutomatic = isAutomatic;
        this.color = color;
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFullInfo() {
        return String.format("Brand: %s, Model: %s, Year: %d, Automatic: %b, Color: %s, Mileage: %d km",
                brand, model, year, isAutomatic, color, mileage);
    }
}
