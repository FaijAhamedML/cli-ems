import java.util.Scanner;
public class EMS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final int employee=5;
        final int details=4;
        double[][] emp=new double[employee][details];

        // get inpt from user and store the user inputs
        for(int i=0; i<emp.length;i++){
            System.out.print("Enter the employee id(xxx) :");
            emp[i][0]=input.nextInt();
            System.out.print("enter your grade :");
            emp[i][1]=input.nextInt();
            System.out.print("Enter the hours did you worked :");
            emp[i][2]=input.nextInt();
            System.out.println(" ");
            double salaryPerHours=0;
            switch ((int)emp[i][1]) {
            case 1:
                salaryPerHours=3000.0;
                break;
            case 2:
                salaryPerHours=2500.0;
                break;
            case 3:
                salaryPerHours=2000.0;
                break;
            case 4:
                salaryPerHours=1250.0;
                break;
            default:
               System.out.println("Enter the correct type!!!");
               salaryPerHours=0;
                break;
            }
            emp[i][3]= salaryPerHours*emp[i][2];// calculate salary and store that in to colo 4
        }
        

        System.out.println("+------------------+--------------------+--------------------------+");
        System.out.println("|  Employee ID     | Hours worked       |   Salary                 |");
        System.out.println("+------------------+--------------------+--------------------------+");
        for(int i=0; i<emp.length;i++){ 
            System.out.println("|      "+emp[1][0]+"         |        "+emp[i][2]+"           |          "+emp[i][3]+"           |");
            System.out.println("+------------------+--------------------+--------------------------+");
        }
        
    }

}
