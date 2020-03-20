package JavaOdPodstaw.Practice_7_Decoder_Encoder;


public class Decode {

    public static void main(String[] args) {


        //enter the text to decode
        String textToDecode = "pgg3s1ss0rpss1g330s1p3g3pgs1pgg3s1ss0rpss1pgw33gpgs1r0s3s1pgw30rs1013w0rs3pgr0g3p3";

        //enter secretcode characters
        String secretCode = "sw3rgp01";




        char[] secretCode_Split = secretCode.toCharArray();


        char[][] secretTable =
                {{'b', '0', 's', '_', 'k', '{','$',' '},
                        {'/', '4', 'h', '<', ']', '9','!',':'},
                        {'-', 'u', ';', 'z', 'a', 'j','r','_'},
                        {'l', '3', 'c', '8', '#', '"','i','1'},
                        {'w', '7', 'o', '2', 'y', 'p','(','}'},
                        {',', 'd', 'n', '*', 't', '%','g','['},
                        {'x', '?', '=', 'e', '+', '6',')','q'},
                        {'.', 'm', '@', '>', '5', '&','f','\n'}};


        String[] textToDecode_Split_1 = textToDecode.split("(?<=\\G.{2})");

        int[] result_row;
        result_row = new int[(textToDecode.length()/2)];

        int[] result_column;
        result_column = new int[(textToDecode.length()/2)];

        for (int i = 0; i < (textToDecode.length()/2) ; i++) {
            char[] textToDecode_Split_2 = textToDecode_Split_1[i].toCharArray();
            for (int j = 0; j <= 1; j++) {
                char textToDecode_Split_3 = textToDecode_Split_2[j];
                for (int k = 0; k < secretCode.length() ; k++) {
                    if (j == 0) {
                        if (textToDecode_Split_3 == secretCode_Split[k]) {
                            result_row[i] = k;
                        }
                    } else if (j == 1) {
                        if (textToDecode_Split_3 == secretCode_Split[k]) {
                            result_column[i] = k;
                    }
                    }
                }
            }
        }

        for (int i = 0; i < result_row.length ; i++) {
            System.out.print(secretTable[result_row[i]][result_column[i]]);

        }
}
}


