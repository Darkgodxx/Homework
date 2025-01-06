import java.util.Scanner;

public class Main {
    public static int seats;
    public static String sound;

    public static void main(String[] args) {
        Car typeElctroCar = new Car(100, 50, 60, "Зимние", "Электро", "Красный", "Карбон");
        Car typeMexCar = new Car(150, 60, 200, "Летние", "Механический", "Зеленый", "Карбон");
        Bus typeBus = new Bus("Сталь");
        Truck typeTruck = new Truck("Метал");
        Student student = new Student("Саша", "Пронюшкин", "QA Enginner");
        Scanner scanner = new Scanner(System.in);
        boolean cheakerMenu = true;
        while (cheakerMenu) {
            System.out.println("Выбирите необходиму машину для заказа: ");
            System.out.println("1. - Электро автомобиль");
            System.out.println("2. - Механический автомобиль");
            System.out.println("3. - Автобус");
            System.out.println("4. - Грузовой автомобиль\n");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    writeSeats(typeElctroCar);
                    writeSound(typeElctroCar);
                    System.out.println("Заданное колличество мест в электро автомобиле: " + seats);
                    System.out.println("Звук электро автомобиля: " + sound);
                    printMaterial(typeElctroCar);
                    break;
                case 2:
                    writeSeats(typeMexCar);
                    writeSound(typeMexCar);
                    System.out.println("Заданное колличество мест в механическом автомобиле: " + seats);
                    System.out.println("Звук в механическом автомобиле: " + sound);
                    printMaterial(typeMexCar);
                    break;
                case 3:
                    writeSeats(typeBus);
                    writeSound(typeBus);
                    System.out.println();
                    System.out.println("Заданное колличество мест в автобусе: " + seats);
                    System.out.println("Звук в автобусе: " + sound);
                    System.out.println();
                    break;
                case 4:
                    writeSeats(typeTruck);
                    writeSound(typeTruck);
                    System.out.println();
                    System.out.println("Заданное колличество мест в грузовом автомобиле: " + seats);
                    System.out.println("Звук в грузовом автомобиле: " + sound);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    student.printStudent();
                    System.out.println();
                    break;
            }
        }
    }

    public static void printMaterial(Vehicles vehicles) {
        System.out.println("Материал транспортного средства: " + vehicles.getFrame());
        vehicles.printCar();
        System.out.println();
    }

    public static void writeSeats(Vehicles vehicles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество мест для транспортного средства: ");
        int inputSeats1 = scanner.nextInt();
        seats = vehicles.getNuberseats(inputSeats1);
    }

    public static void writeSound(Vehicles vehicles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите звук транспортного средства: ");
        String inputSeats1 = scanner.nextLine();
        sound = vehicles.getSounds(inputSeats1);
    }
}