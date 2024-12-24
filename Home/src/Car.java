public class Car {
    public String typeWheel;
    public String typeEngine;
    public String colorCar;
    public int lengthCar;
    public int widthCar;
    public int heightCar;
    public int volumeCar;

    public Car(int lengthCar, int widthCar, int heightCar, String typeWheel, String typeEngine, String colorCar) {
        this.lengthCar = lengthCar;
        this.widthCar = widthCar;
        this.heightCar = heightCar;
        this.typeEngine = typeEngine;
        this.typeWheel = typeWheel;
        this.colorCar = colorCar;
        volumeCar = lengthCar * widthCar * heightCar;
        System.out.println();
        System.out.println("Параметры автомобиля: ");
        System.out.println("Длинна автомобиля: " + this.lengthCar);
        System.out.println("Ширина автомобиля: " + this.widthCar);
        System.out.println("Высота автомобиля: " + this.heightCar);
        System.out.println("Обьем размера автомобиля: " + volumeCar);
        System.out.println();
        System.out.println("Характеристики автомобиля: ");
        System.out.println("Двигатель автомобиля: " + this.typeEngine);
        System.out.println("Колеса автомобиля: " + this.typeWheel);
        System.out.println("Цвет автомобиля: " + this.colorCar);
        System.out.println();
    }
}
