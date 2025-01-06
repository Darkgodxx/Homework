public class Car extends Vehicle {
    public int lengthCar;
    public int widthCar;
    public int heightCar;
    public int volumeCar;
    public String typeWheel;
    public String typeEngine;
    public String colorCar;

    public Car(int lengthCar, int widthCar, int heightCar, String typeWheel, String typeEngine, String colorCar, String frameCar) {
        this.lengthCar = lengthCar;
        this.widthCar = widthCar;
        this.heightCar = heightCar;
        this.typeEngine = typeEngine;
        this.typeWheel = typeWheel;
        this.colorCar = colorCar;
        this.frameCar = frameCar;
        volumeCar = lengthCar * widthCar * heightCar;
    }

    @Override
    public void printCar() {
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
    }

    @Override
    public int getNuberseats(int numberOfseats) {
        return numberOfseats;
    }

    @Override
    public String getSounds(String sounds) {
        return sounds;
    }

    @Override
    public String getFrame() {
        return frameCar;
    }
}
