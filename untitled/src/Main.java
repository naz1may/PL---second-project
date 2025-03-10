import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

//        Stack <Double> nums = new Stack <>();
//        Stack <Character> ops = new Stack <>();
//
//        String str = scan.nextLine();
//        String[] ex = str.split(" ");
//
//        for(String a : ex){
//            char ch = a.charAt(0);
//            if(Character.isDigit(ch)){
//                nums.add(a);
//            }
//        }
//            System.out.println("MENU:");
//            System.out.println("1. Basic arithmetical operation");
//            System.out.println("2. Additional functions");
//            System.out.print("Enter: ");
//            int op = scan.nextInt();
//
//            if(op==1){
//                operation();
//            } else if (op==2){
//                function();
//            } else if (op==4) {
//                System.out.println("Exited");
//                return;
//            }
        main2();
    }

    static ArrayList<String> history = new ArrayList<>();
    static ArrayList<String> historyD = new ArrayList<>();
    static ArrayList<Integer> results = new ArrayList<>();
    static ArrayList<Double> resultsD = new ArrayList<>();

    public static void main2() {
        Scanner scan = new Scanner (System.in);
        System.out.println("MENU:");
        System.out.println("1. Basic arithmetical operations");
        System.out.println("2. Additional functions");
        System.out.println("3. Review history");
        System.out.println("4. Exit");

        System.out.print("Enter: ");
        int op = scan.nextInt();

        if(op==1){
            operation();
        } else if (op==2){
            function();
        } else if(op==3){
            history();
        }else if (op==4) {
            System.out.println("Exited!");
            return;
        }else {
            System.out.println("Error!");
            main2();
        }
    }

    public static void operation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("This option can implement functions for addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).");
        System.out.print("Enter your arithmetic problem for to solve (with one space between): ");
        String str=scan.nextLine();
        history.add(str);
        String[] symbols = str.split(" ");
        String ch = symbols[1];
        int a = Integer.parseInt(symbols[0]);
        int b = Integer.parseInt(symbols[2]);

        System.out.print("The result is: ");

        switch(ch){
            case "+": {
                int result = a+b;
                System.out.println(result);
                results.add(result);
                break;
            }

            case "-": {
                int result = a-b;
                System.out.println(result);
                results.add(result);
                break;
            }

            case "*": {
                int result = a*b;
                System.out.println(result);
                results.add(result);
                break;
            }

            case "/": {
                if(b==0){
                    System.out.println("Undefined");
                    results.add(-1);
                    break;
                }
                int result = a/b;
                System.out.println(result);
                results.add(result);
                break;
            }

            case "%":{
                if(b==0){
                    System.out.println("Undefined");
                    results.add(-1);
                    break;
                }
                int result = a%b;
                System.out.println(result);
                results.add(result);
                break;
            }
            default:{
                System.out.println("Error!");
            }

        }

        main2();
    }

    public static void function(){
        Scanner scan = new Scanner(System.in);
        System.out.println("This option can implement the following operations: a power b, sqrt a, abs a, round a");
        System.out.print("Enter your problem for to solve (with one space between): ");
        String str = scan.nextLine();
        historyD.add(str);
        String[] arr = str.split(" ");

//        if(!str.contains("pow")){
//            double a = Double.parseDouble(arr[1]);
//        }

        if(str.contains("abs")){
            //a=Integer.parseInt(arr[1]);
            double a = Double.parseDouble(arr[1]);
            System.out.println("Result: " + Math.abs(a));
            resultsD.add(Math.abs(a));
        } else if (str.contains("pow")){
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            System.out.println("Result: " + Math.pow(a, b));
            resultsD.add(Math.pow(a, b));
        } else if (str.contains("sqrt")){
            //a=Integer.parseInt(arr[1]);
            double a = Double.parseDouble(arr[1]);
            if(a<0){
                System.out.println("Undefined");
                resultsD.add(-1.0);
                main2();
                return;
            }
            System.out.println("Result: " + Math.sqrt(a));
            resultsD.add(Math.sqrt(a));
        } else if (str.contains("round")){
            double a = Double.parseDouble(arr[1]);
            double result = Math.round(a);
            System.out.println("Result: " + result);
            resultsD.add(result);
        } else {
            System.out.println("Error!");
        }

        main2();
    }

    public static void history(){
        boolean check = false;

        if(!history.isEmpty()) {
            System.out.println("The history of arithmetical operations:");
            for(int i=0; i<history.size(); i++){
                System.out.println(history.get(i) + " = " + results.get(i));
            }
            check = true;
        }

        if(!historyD.isEmpty()){
            System.out.println("The history of additional functions:");
            for(int i=0; i<historyD.size(); i++){
                System.out.println(historyD.get(i) + " = " + resultsD.get(i));
            }
            check = true;
        }

        if(check){
            System.out.println("If the operation is undefined, the result was presented as '-1'.");
        }

        if(!check){
            System.out.println("Your history is empty! Use the calculator for to add some data!");
        }
        main2();
    }
}