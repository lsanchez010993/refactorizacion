import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Refactor 2: Tècnica: Inline Code
//    static Scanner scan = new Scanner(System.in);

    //REFACT1: Extraccion de metode: menu()
    public static int menu() {
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");

        return introducirOpcion();
    }
    //Refactor 2: Tècnica: Inline Code
    public static int introducirOpcion(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


    public static void opcio4() {
        System.out.println("intro: ");
        int num1 = introducirOpcion();
        System.out.println("intro: ");
        int num2 = introducirOpcion();
        if (max(num1, num2)) {
            System.out.println("aaa");
        } else System.out.println("bbb");
    }
    //REFACT3
    public static void opcio1() {
        System.out.println("intro: ");
        int num1 = introducirOpcion();
        System.out.println("intro: ");
        int num2 = introducirOpcion();
        if (max(num1, num2)) {
            System.out.println("aaa");
        } else System.out.println("bbb");
    }
    public static void main(String[] args) {
        int opcio;
        do {
            opcio = menu();

            String p = "Proves";


            switch (opcio) {
                case 1:
                    //Refact3: EXTRACCIO DE METODE
//                    System.out.println("intro: ");
//                    int num1 = scan.nextInt();
//                    System.out.println("intro: ");
//                    int num2 = scan.nextInt();
//                    if (max(num1, num2)) {
//                        System.out.println("aaa");
//                    } else System.out.println("bbb");

                    //Refact3: EXTRACCIO DE METODE

                    opcio1();
                    break;
                case 2:
                    //REFACT2: Tècnica: Inline Code
                    calcEquacioSegongrau(2, 3, 1);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }


//REFACT8: INLINE CODE
//    public static boolean max(int a, int b) {
//        if (a > b) {
//            return true;
//        } else if (a == b) {
//            return false;
//        } else {
//            return false;
//        }
//    }

//REFACT8: INLINE CODE
public static boolean max(int a, int b) {
    return a > b;
}

    public static void calcEquacioSegongrau(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }





    //REFACT5: EXTRACCIO DE CLASE:
    // Order public static class Order {
//        private List<OrderLineItem> lineItems;
//        private double taxRate;
//
//        public Order(List<OrderLineItem> lineItems, double taxRate) {
//            this.lineItems = lineItems;
//            this.taxRate = taxRate;
//        }
//
//        public double calculateTotalPrice() {
//            double subtotal = 0.0;
//            for (OrderLineItem item : lineItems) {
//                subtotal += item.getPrice();
//            }
//            double tax = subtotal * taxRate;
//            return subtotal + tax;
//        }
//    }
//REFACT4: eXTRACCIO DE CLASE: OrderLineItem
//    public class OrderLineItem {
//        private String productName;
//        private int quantity;
//        private double price;
//
//        public OrderLineItem(String productName, int quantity, double price) {
//            this.productName = productName;
//            this.quantity = quantity;
//            this.price = price;
//        }
//
//        public double getPrice() {
//            return price * quantity;
//        }
//    }
//REFACT6: eXTRACCIO DE CLASE: Customer
//    public class Customer {
//        private String firstName;
//        private String lastName;
//
//        public Customer(String firstName, String lastName) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//        }
//
//        public String getFullName() {
//            return firstName + " " + lastName;
//        }
//    }
}