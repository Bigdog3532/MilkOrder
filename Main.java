import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        //Create a Phone number for whome to call
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        Manager mg = new Manager();
        while(loop){
            System.out.println("1.Create a Details of Clint\n2.Show Details\n3.call\n4.Show each one's Order\n5.Total Order\n6.Exit");
            
            int userInput = sc.nextInt();
            
            switch (userInput) {
                case 1:
                    mg.getDetails();
                    break;
                case 2:
                    mg.showDetails();
                    break;
                case 3:
                    mg.call();
                    break;
                case 4:
                    mg.orderDetail();
                    break;
                case 5:
                    mg.totalMilk();
                    break;
                case 6:
                    loop = false;
                    break;

                default:
                    break;
            }
        }
        sc.close();
    
    }
}
