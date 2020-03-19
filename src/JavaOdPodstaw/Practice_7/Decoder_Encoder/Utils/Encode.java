package JavaOdPodstaw.Practice_7.Decoder_Encoder.Utils;


    public class Encode {


        public static void main(String[] args) {


            String textToCode = "code";
            textToCode = textToCode.toLowerCase();
            int textToCode_lenght = textToCode.length();
            char[] textToCode_Split = textToCode.toCharArray();

            String secretCode = "ADFGVX";
            int secretCode_lenght = secretCode.length();

            if (secretCode_lenght != 6) {
                System.out.println("Secret code need to have 6 char");
                System.exit(0);
            }

        char[] secretCode_Split = secretCode.toCharArray();



            char[][] secretTable = {{'g', '5', 'w', 's', 'p', 'b'},
                    {'i', 'o', 'q', '8', '9', 't'},
                    {'7', 'n', 'd', 'j', 'k', 'f'},
                    {'h', '3', 'm', '2', 'c', 'a'},
                    {'e', 'r', 'u', 'v', '1', 'l'},
                    {'0', '4', 'y', 'z', 'x', '6'}};

            int[] result_row;
            result_row = new int[textToCode_lenght];

            int[] result_column;
            result_column = new int[textToCode_lenght];


            for (int i = 0; i < textToCode_lenght; i++) {
                for (int r = 0; r < 6; r++) {
                    for (int c = 0; c < 6; c++) {
                        if (textToCode_Split[i] == secretTable[r][c]){
                            result_row[i] = r;
                            result_column[i] = c;
                        }
                    }
                }
            }

            String [] resultCode;
            resultCode = new String[textToCode_lenght];


            for (int k = 0; k <= textToCode_lenght-1; k++) {
                resultCode[k] = String.valueOf(secretCode_Split[result_row[k]]
                        + String.valueOf(secretCode_Split[result_column[k]]));
            }

            for (int i = 0; i < textToCode_lenght ; i++) {
                System.out.print(resultCode[i]);

            }

    }

}