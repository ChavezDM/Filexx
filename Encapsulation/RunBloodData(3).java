import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        BloodData BD = new BloodData();
        
        System.out.print("Enter blood type of patient: ");
        String bt = sc.nextLine();
        bd.setBloodType(bt);

        System.out.print("Enter the Rhesus Factor: ");
        String rf = sc.nextLine();
        bd.setRhFactor(rf);

        if (bt.isEmpty()){
            System.out.println(BD.getBloodType() + BD.getRhFactor() + " is added to the blood bank.");;
        }
        else if(bt.equalsIgnoreCase("a")){
            if (rf.equalsIgnoreCase("")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("-")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("+")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(bt.equalsIgnoreCase("b")){
            if (rf.equalsIgnoreCase("")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("-")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("+")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(bt.equalsIgnoreCase("o")){
            if (rf.equalsIgnoreCase("")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("-")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("+")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(bt.equalsIgnoreCase("ab")){
            if (rf.equalsIgnoreCase("")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
            }
            else if(rf.equalsIgnoreCase("-")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else if(rf.equalsIgnoreCase("+")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
                
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("Invalid input");
        }
        
        sc.close();

    }
}