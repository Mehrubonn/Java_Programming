package day36_polymorphism;

import java.util.Arrays;

public class IPhones {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public IPhones(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String [] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if(Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color: " + color + " color of the phone can only be " + Arrays.toString(colors));
        }
    }

    public void call(long phoneNumber){
        System.out.println(getBrand() + " Calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + " Texting " + phoneNumber);
    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof IPhones)){
            System.err.println("Invalid object. Object must be iPhone");
            System.exit(1);
        }
        if(obj instanceof IPhones){ //if the given object is iPhone
            if(model.equals(((IPhones) obj).model)) { //if the model of the iPhone is equal to the given iPhone`s model
                if(color.equals(((IPhones)obj).color)){ //if the color of the iPhone is equal to the given iPhone`s color
                    return true;
                }
            }
        }
        return  false;
    }
}







