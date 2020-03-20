package JavaOdPodstaw.Practice_7_Decoder_Encoder;


    public class Encode {


        public static void main(String[] args) {


            //enter the text you want to encode
            String textToEncode = "To be, or not to be, that is the question";

            //enter 8 different secretcode characters
            String secretCode = "sw3rgp01";






            textToEncode = textToEncode.toLowerCase();
            char[] textToCode_Split = textToEncode.toCharArray();


            if (secretCode.length() != 8) {
                System.out.println("Secret code must have 8 char");
                System.exit(0);
            }

            char[] secretCode_Split = secretCode.toCharArray();
            for (int i = 0; i < secretCode.length() ; i++) {
                for (int j = 0; j < secretCode.length(); j++) {
                    if (i == j){
                        continue;
                    }
                    else if (secretCode_Split[i] == secretCode_Split[j]){
                        System.out.println("Secret code must have 8 different characters");
                        System.exit(0);
                }

                }

            }
            char[][] secretTable =
                    {{'b', '0', 's', '_', 'k', '{','$', ' ' },
                    {'/', '4', 'h', '<', ']', '9','!',':'},
                    {'-', 'u', ';', 'z', 'a', 'j','r','_'},
                    {'l', '3', 'c', '8', '#', '"','i','1'},
                    {'w', '7', 'o', '2', 'y', 'p','(','}'},
                    {',', 'd', 'n', '*', 't', '%','g','['},
                    {'x', '?', '=', 'e', '+', '6',')','q'},
                    {'.', 'm', '@', '>', '5', '&','f', '\n' }};

            int[] result_row;
            result_row = new int[textToEncode.length()];

            int[] result_column;
            result_column = new int[textToEncode.length()];


            for (int i = 0; i < textToEncode.length(); i++) {

                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        if (textToCode_Split[i] == secretTable[r][c]){
                            result_row[i] = r;
                            result_column[i] = c;
                        }
                    }
                }
            }

            String [] resultCode;
            resultCode = new String[textToEncode.length()];


            for (int k = 0; k <= textToEncode.length()-1; k++) {

                resultCode[k] = (secretCode.toCharArray()[result_row[k]]
                        + String.valueOf(secretCode.toCharArray()[result_column[k]]));
            }

            for (int i = 0; i < textToEncode.length() ; i++) {
                System.out.print(resultCode[i]);

            }

    }

}