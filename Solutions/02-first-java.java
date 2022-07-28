import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.println("Hello " + name + "!");
    }
}

class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount(in INR): ");
        int p = input.nextInt();
        System.out.print("Enter Time(in Years): ");
        int t = input.nextInt();
        System.out.print("Enter Rate(in %): ");
        int r = input.nextInt();
        System.out.println("Simple Intrest = " + (p * r * t));
    }
}

class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number 1: ");
            int n1 = input.nextInt();
            System.out.print("Enter Operator: ");
            char op = input.next().trim().charAt(0);
            System.out.print("Enter Number 2: ");
            int n2 = input.nextInt();
            if (op == '+') {
                System.out.println("Result = " + (n1 + n2));
            } else if (op == '*' || op == 'x') {
                System.out.println("Result = " + (n1 * n2));
            } else if (op == '-') {
                System.out.println("Result = " + (n1 - n2));
            } else if (op == '/') {
                if (n2 != 0) {
                    System.out.println("Result = " + (n1 / n2));
                } else {
                    System.out.println("Result = invalid (Divided By Zero)");
                }
            } else if (op == '%') {
                System.out.println("Result = " + (n1 % n2));
            } else if (op == 'e' || op == 'q') {
                System.out.println("Thank you For Using it !");
                break;
            } else {
                System.out.println("Invalid Opeartion = " + op);
            }
            System.out.println("To Exit/Quit -- write operator as 'e' or 'q' \n");
        }
    }
}

class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = input.nextInt();
        if (n1 > n2) {
            System.out.println("Number 1 i.e, " + n1 + " is Greater than " + n2);
        } else if (n2 > n1) {
            System.out.println("Number 2 i.e, " + n2 + " is Greater than " + n1);
        } else {
            System.out.println("Both Numbers are Equal i.e, " + n1);
        }
    }
}

class CurrencyInUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount (in INR): ");
        float amount = input.nextFloat();
        System.out.println("Amount (in USD) = " + (amount / 72.83));
    }
}

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (num < 1) {
            System.out.print(0);
        } else {
            int n3 = n1+n2;
            System.out.print("0 1 ");
            for (int i = 1; i < num; i++) {
                System.out.print((n3)+" ");
                n1 = n2; n2 = n3;
                n3 = n1+n2;
            }
        }
    }
}

class Palindrome {
    public static void main(String[] args) {
        boolean palindrome = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.next();
        int lstr = str.length();
        int mid_str = (int)(lstr/2);
        for (int i = 0; i < mid_str; i++) {
            if (str.charAt(i) != str.charAt(lstr-i-1)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = input.nextInt();
        for (int i = n1; i < n2; i++) {
            String istr = Integer.toString(i);
            int num = 0;
            for (int j = 0; j < istr.length(); j++) {
                int stri = Integer.parseInt(""+istr.charAt(j));
                num = num + stri*stri*stri;
            }
            if (num == i) {
                System.out.println("Number "+num+" is an Armstrong Number");
            }

        }
    }
}
