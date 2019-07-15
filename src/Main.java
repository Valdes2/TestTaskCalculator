import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
        Read read = new Read();
        Scanner sc = new Scanner(System.in);
        String check1, check2;
        String r1 = "", r2 = "";
        int one, two;
        int func, result = 0, exit;


        do {
            System.out.print("Введите первое число: ");
            r1 = read.readNext();
            check1 = read.getiCheck();
            System.out.print("Введите второе число: ");
            r2 = read.readNext();
            check2 = read.getiCheck();
            one = Integer.parseInt(r1);
            two = Integer.parseInt(r2);

            Calculator calculator = new Calculator(one, two);

            System.out.println("Выберите действие:");
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. / ");
            System.out.println("4. * ");
            System.out.println("");
            System.out.print("Введите номер действия: ");

            func = sc.nextInt();
            switch (func) {
                case 1:
                    result = calculator.sum();
                    break;
                case 2:
                    result = calculator.sub();
                    break;
                case 3:
                    result = calculator.div();
                    break;
                case 4:
                    result = calculator.mult();
                    break;
                default:
                    System.out.println("Вы ввели неверный номер");
            }

            if (check1 == "Roman number" & check2 == "Roman number") {
                ConvertToRoman convertR = new ConvertToRoman();
                System.out.println(convertR.convertToRoman(result));
            } else if (check1 == "Decimal number" & check2 == "Decimal number") {
                System.out.println(result);
            } else {
                System.out.println("Некорректное выражение");
            }
            System.out.println("Для выхода из программы введите 0, продолжить - введите другое число");
            exit = sc.nextInt();
            System.out.println("");
        }
        while (exit != 0);

    }
}