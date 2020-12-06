package edu.epam.carshop.entity;

public class Car {

    private int id;
    private Color color;
    private Brand brand;
    private int year;
    private Model model;
    private int price;
    private String registrationNumber;

    public Car(int id, Color color, Brand brand, int year, Model model, int price, String registrationNumber) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (year != car.year) return false;
        if (price != car.price) return false;
        if (color != car.color) return false;
        if (brand != car.brand) return false;
        if (model != car.model) return false;
        return registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = id;
        result = prime * result + color.hashCode();
        result = prime * result + brand.hashCode();
        result = prime * result + year;
        result = prime * result + model.hashCode();
        result = prime * result + price;
        result = prime * result + registrationNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", color=").append(color);
        sb.append(", brand=").append(brand);
        sb.append(", year=").append(year);
        sb.append(", model=").append(model);
        sb.append(", price=").append(price);
        sb.append(", registrationNumber='").append(registrationNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
