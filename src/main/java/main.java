import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;


public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int i = sc.nextInt();
            System.out.println(value[i]);
            System.out.println("프로그램 종료");
            break;
        }
    }
}


//        System.out.println("hello 월드");
//
//        int a = 10;
//        float b = 0.12345f;
//        double c = 111111111;
//        char chr = 'a';
//        String str = "javaprac";
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(chr);
//        System.out.println(str);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("======for문입니다======");
//        System.out.print("숫자를 입력하세요: ");
//        int a = sc.nextInt();
//        int temp = 0;
//        //for문
//        for(int b=0;b<=a;b++){
//            temp += b;
//        }
//        int sum =temp;
//        System.out.printf("1부터 %d까지의 합은 %d입니다.\n\n\n",a,sum);
//
//        System.out.println("======while문입니다======");
//        System.out.print("숫자를 입력하세요: ");
//        int i = sc.nextInt();
//        int j = 0;
//        temp=0;
//
//        while(j<i){
//            j+=1;
//            temp +=j;
//        }
//        sum = temp;
//        System.out.printf("1부터 %d까지의 합은 %d입니다.",i,sum);
//        sc.close();

//        int length = 5;
//        System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요: ");
//        String[] ary = new String[length];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < length; i++) {
//        ary[i] = sc.next();
//        }
//        System.out.println("====== 입력 완료 ======");
//        System.out.println("====== 출력 시작 ======");
//        for (int i = 0; i < length; i++) {
//        System.out.println(ary[4 - i]);
//class Calculator {
//    int x;
//    int y;
//
//    public void printResult() {
//        System.out.printf("%d + %d = %d\n", x, y, x + y);
//        System.out.printf("%d - %d = %d\n", x, y, x - y);
//        System.out.printf("%d / %d = %d\n", x, y, x / y);
//        System.out.printf("%d * %d = %d\n", x, y, x * y);
//    }
//
//}
//public static void main(String args[]){
//    Calculator calculator = new Calculator();
//    calculator.x = 30;
//    calculator.y = 50;
//
//    calculator.printResult();
//}

//class Student {
//    String name;
//    int a;
//    int b;
//    int c;
//
//    Student(String name, int x, int y, int z) {
//        this.name = name;
//        this.a = x;
//        this.b = y;
//        this.c = z;
//    }
//    public float getAverage() {
//        int sum = a + b + c;
//        float avg = (float) sum / 3;
//        return avg;
//    }
//}
////
//Student student1 = new Student("코뮤", 100, 80, 75);
//    Student student2 = new Student("김변수", 96, 58, 90);
//        System.out.printf("%s의 평균 점수:%.6f\n", student1.name, student1.getAverage());
//                System.out.printf("%s의 평균 점수:%.6f\n", student2.name, student2.getAverage());