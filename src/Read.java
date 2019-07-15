import java.util.Scanner;


public class Read {
    public String iCheck;


    public String getiCheck() {
        return iCheck;
    }


    public String readNext() {
        ConvertToDecimal convertD = new ConvertToDecimal();
        Scanner sc = new Scanner(System.in);
        int input;
        String inputR = "";
        if (sc.hasNextInt()) {
            iCheck = "Decimal number";
            input = sc.nextInt();
            inputR = String.valueOf(input);
        }
        else {
            iCheck = "Roman number";
            inputR = sc.next();
            inputR = convertD.romanConvert(inputR);
        }
        return inputR;
    }



}
