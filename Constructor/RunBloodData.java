import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        BloodData BD = new BloodData();
        
        
        System.out.print("Enter blood type of patient: ");
        String btp = sc.nextLine();
        System.out.print("Enter the Rhesus Factor: ");
        String rf = sc.nextLine();
        if (btp.equalsIgnoreCase("")){
            bd.display();
        }
        else if(btp.equalsIgnoreCase("a")){
            if (rf.equalsIgnoreCase("")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("-")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("+")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(btp.equalsIgnoreCase("b")){
            if (rf.equalsIgnoreCase("")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("-")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("+")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(btp.equalsIgnoreCase("o")){
            if (rf.equalsIgnoreCase("")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("-")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("+")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(btp.equalsIgnoreCase("ab")){
            if (rf.equalsIgnoreCase("")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("-")){
                BD.BloodData(btp, rf);
                bd.display();
            }
            else if(rf.equalsIgnoreCase("+")){
                BD.BloodData(btp, rf);
                bd.display();
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
