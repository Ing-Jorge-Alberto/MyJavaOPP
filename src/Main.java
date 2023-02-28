public class Main {
    public static void main(String[] args) {
        /*ClassDemo instance = new ClassDemo();
        ClassDemo instance2 = new ClassDemo();
        instance.number=10;
        instance2.text="Nex text";
        instance.printNumber();
        instance2.printNumber();
        instance.printText();
        instance2.printText();
        ClassDemo.text="Third text";
        instance.printText();
        /*Lamp kitchenLamp=new Lamp("Kitchen");
        Lamp bedroomLamp=new Lamp("Bedroom");
        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();
        kitchenLamp.lightStatus=true;
        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();
        /*Programming homework6=new Programming("Java");
        homework6.learningStatus();
        homework6.completeLearning();
        homework6.learningStatus(); */
        Cat cat=new Cat("Tom","American shorthair");
        cat.setName("Simba");
        System.out.println("We have an "+cat.getBreed()+" cat named "+cat.getName());
        cat.makeSound();
        cat.sleep();
        }
    }
