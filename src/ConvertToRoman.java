
public class ConvertToRoman {
    private int[]    decimBase = {1000, 500, 100, 50, 10, 5, 1};
    private String[] romanBase = {"M", "D", "C", "L", "X", "V", "I"};

    public String convertToRoman(int decim) {
        int result = 0;
        int remainder = 0;
        String resultRoman = "";
        for(short i = 0; i < decimBase.length; i += 2) {
            result = decim / decimBase[i];
            remainder = decim % decimBase[i];
            if(result > 0 && result < 4) {
                for(short j = 0; j < result; j++) {
                    resultRoman += romanBase[i];
                }
            }
            else if(result >= 4 && result < 9) {
                for(short j = (short)result; j < 5; j++) {
                    resultRoman += romanBase[i];
                }
                resultRoman += romanBase[i - 1];
                for(short j = 5; j < result; j++) {
                    resultRoman += romanBase[i];
                }
            }
            else if(result == 9) {
                resultRoman += romanBase[i] + romanBase[i - 2];
            }
            if(remainder == 0) break;
            decim = remainder;
        }

        return resultRoman;
    }

}