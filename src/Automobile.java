public class Automobile {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;
    Automobile(String brand,String model,float engineVolume,String color,int year,String country){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
    public String toString() {
        return "В наличии автомобиль " + brand + " " + model + "." + "Год выпуска - " + year + "." +
                "Сборка:" + country + "." + "Цвет:" + color + "." + "Объём двигателя - " + engineVolume + " л.";
    }
}
