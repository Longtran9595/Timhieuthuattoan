// B1
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập a: ");
//        int A = number.nextInt();
//        System.out.println("kiem tra");
//        if (A % 2 == 0) {
//            System.out.println("số chẵn");
//        }else {
//            System.out.println("số lẻ");
//        }
//    }
//}

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("Input 3 numbers");
//        int a = number.nextInt();
//        int b = number.nextInt();
//        int c = number.nextInt();
//        System.out.println("the max number is:");
//        if (a >= b && a >= c){
//            System.out.println(a);
//        } else if (b >= a && b >= c) {
//            System.out.println(b);
//        }else {
//            System.out.println(c);}
//    }
//}


//import java.util.Scanner;
//
//class main {/223ppp[[ơddanglafm
//    public static void main(String[] args) {
//        Scanner triagleEdge = new Scanner(System.in);
//        System.out.println("nhập 3 cạnh của tam giác");
//        int a = triagleEdge.nextInt();
//        int b = triagleEdge.nextInt();
//        int c = triagleEdge.nextInt();
//
//        if (a > b + c || b > a + c || c > a + b) {System.out.println("not the triagle");}
//        else if (a == b && b== c) {System.out.println("tam giác đều");}
//        else if (a == b | a == c | b == c) {
//            System.out.println("tam giác cân");
//        } else if (a*a == b*b + c*c | a*a + b*b == c*c | b*b == a*a + c*c) {
//            System.out.println("tam giác vuông");
//        }else {
//            System.out.println("tam giác thường");
//    }
//    }
//}


//B2

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập số bánh");
//        int n = number.nextInt();
//        System.out.println("số lần rán:");
//        int b = (n / 9) + 1;
//        System.out.println(b);
//
//    }
//}

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner N = new Scanner(System.in);
//        System.out.println("nhập số tiền gửi");
//        int a = N.nextInt();
//        System.out.println("nhập lãi suất");
//        double b = N.nextDouble();
//        System.out.println("tiền nhận được là " + (a*b));
//    }
//}

//import java.util.Scanner;
//
//class  main {
//    public static void main(String[] args) {
//        Scanner diem = new Scanner(System.in);
//        System.out.println("nhập điểm");
//        double a = diem.nextDouble();
//        final double diemTrungBinh = 8.5;
//        if (a >= diemTrungBinh) {
//            System.out.println("hsg");
//        } else {
//            System.out.println("học sinh bình thường");
//        }
//    }
//}


//B3

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập a vả b");
//        int a = number.nextInt();
//        int b = number.nextInt();
//        if (a < b) {
//            System.out.println("các số lẻ giữa " + a + " và " + b);
//            for (int i = a + 1; i < b; i++) {
//                if (i % 2 != 0) {
//                    System.out.println(i);
//                }
//            }
//        } else {
//            System.out.println("không có");
//        }
//    }
//}

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập a vả b");
//        int a = number.nextInt();
//        int b = number.nextInt();
//        if (a > b) {
//            System.out.println("không có");
//        } else {
//            System.out.println("các số chính phương là");
//            for (int i = a + 1; i < b; i++) {
//                if (Math.sqrt(i) % 1 == 0) {
//                    System.out.println(i);
//                }
//            }
//        }
//    }
//}

//b4
//
//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        int sum = 0;
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập a vả b");
//        int a = number.nextInt();
//        int b = number.nextInt();
//        if (a > b) {
//            System.out.println("không có");
//        } else {
//            for (int i = a + 1; i < b; i++) {
//                sum = sum + i * i;
//            }
//            System.out.println("tổng là " + sum);
//        }
//    }
//}

