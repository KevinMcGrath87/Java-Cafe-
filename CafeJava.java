public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double drip = 100.00;
        double cappuccino = 1000.99;

        String customer1 = "Paul";
        String customer2 = "Randy";
        String customer3 = "Lily";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;

        System.out.println(generalGreeting);
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage);
            System.out.println(mochaPrice);
        }
        else{
            System.out.println(pendingMessage);
        }

        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage);
            System.out.println(cappuccino);
        }
        
        System.out.println(customer3 + displayTotalMessage);
        System.out.println(drip*2);

        if(isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }
        // System.out.println(generalGreeting + customer1);
        // System.out.println(customer1 + pendingMessage);
        // System.out.println(customer1 + readyMessage);
        // System.out.println(displayTotalMessage + mochaPrice);


    }
}