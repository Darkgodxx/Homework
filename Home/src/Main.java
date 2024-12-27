public class Main {
    public static void main(String[] args) {
        Car typeElctroCar = new Car(100,50,60,"Зимние","Электро","Красный");
        Car typeMexCar = new Car(150,60,200,"Летние","Механический","Зеленый");
        Student student = new Student("Саша","Пронюшкин","QA Enginner");
        typeElctroCar.printCar();
        typeMexCar.printCar();
        student.printStudent();
    }
}