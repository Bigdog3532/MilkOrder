import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager {
    Map<Long,NameAndNumbers> NameAndPhone = new HashMap<>();
    Map<String,Milk> eachCount = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int i = 0;
    public void getDetails() {
       
        
        System.out.println("Enter your Name :");
        String name = sc.next();

        System.out.println("Enter Mobile Number:");
        Long phone = sc.nextLong();
        
        System.out.println("Phone Number is Added Sucessfully");
        System.out.println("###############################################################");
        NameAndPhone.put((long) ++i, new NameAndNumbers(i,name, phone));

    }
    public void showDetails() {
        for(Map.Entry<Long,NameAndNumbers> show : NameAndPhone.entrySet()){
            System.out.printf("%-5d %-20s %-30s \n",show.getValue().getId(),show.getValue().getName(),show.getValue().getPhoneNum());
        }
       
    }
    public void call() {
        System.out.println("Enter the Number to call :");
        Long number = sc.nextLong();
        //how to check this number is match to the Map(NameAndPhone) stored value
        boolean found = false;

        for(Map.Entry<Long,NameAndNumbers> f : NameAndPhone.entrySet()){
            if(f.getValue().getPhoneNum().equals(number)){
                System.out.println("Calling " +f.getValue().getName()+"  ........");
                found = true;
                System.out.println("###############################################################");
                giveYourOrder(f.getValue().getName());
            }
            
        }
        if(!found){
                System.out.println("Dialed number is not Exit / Wrong");
            }

        
    }

    private void giveYourOrder(String name) {
        System.out.println("Please Give me your Order");
        System.out.println("How Much Litter FCM Milk : ");
        int fcm = sc.nextInt();
        System.out.println("How Much Litter SM Milk : ");
        int sm = sc.nextInt();
        System.out.println("How Much Litter Tond Milk : ");
        int tond = sc.nextInt();

        eachCount.put(name,new Milk(fcm, sm, tond));

        System.out.println("Your order Taken Sucessfully");
        System.out.println("###############################################################");
    }
    public void orderDetail() {
        
       for(Map.Entry<String,Milk> d:eachCount.entrySet()){
        System.out.println("###############################################################");
        System.out.println("Name : "+d.getKey());
        System.out.println("FCM : "+d.getValue().getFCM());
        System.out.println("SM : "+d.getValue().getSM());
        System.out.println("Tond : "+d.getValue().getTond());
        System.out.println("###############################################################");
       }
       
    }
    public void totalMilk() {
        int FCM = 0;
        int SM = 0;
        int Tond = 0;
       for(Map.Entry<String,Milk> e:eachCount.entrySet()){
            if(e.getValue().getFCM()!=0){
                FCM = FCM+e.getValue().getFCM();
            }
            if(e.getValue().getSM()!=0){
                SM = SM+e.getValue().getSM();
            }
            if(e.getValue().getFCM()!=0){
                Tond = Tond+e.getValue().getTond();
            }

       }
       System.out.println("###############################################################");
       System.out.println("Total FCM Milk is : "+FCM);
       System.out.println("Total SM Milk is : "+SM);
       System.out.println("Total Tond Milk is : "+Tond);
       System.out.println("###############################################################");
    }

    
}
