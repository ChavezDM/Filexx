import java.util.Scanner;

public class RunAnimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal b = new Bird();
        Animal c = new Cat();
        Animal d = new Dog();

        System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("B")){
            b.eat();
            b.sleep();
            b.makesound();
        }
        else if(choice.equalsIgnoreCase("C")){
            c.eat();
            c.sleep();
            c.makesound();
        }
        else if(choice.equalsIgnoreCase("D")){
            d.eat();
            d.sleep();
            d.makesound();
        }
        else{
            System.out.println("Invalid Choice! ");
        }
    }
}



