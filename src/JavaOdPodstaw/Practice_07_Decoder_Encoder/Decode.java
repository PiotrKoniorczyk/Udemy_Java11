package JavaOdPodstaw.Practice_07_Decoder_Encoder;


public class Decode {

    public static void main(String[] args) {


        //enter the text to decode
        String textToDecode = "j5jqktt5tsk559tsskjssjttsjksts5998tsskst8q59kttt59skqj5sktqj5559skst5t59sjk8sqtst5jqqjss99jqj5qj59jsjq5559ktsqsjqj55st59jsqjksjq55k559ktqjks59ktttj55tts595sjq5559k8tst5jqqjk5995tktts59jsjq55595sktsqstjsjq559559k8sjjq5559tkjq555tksts555559ktt55559t559jsst55qjsk59tssjk8ts55jqqj99t5jqk8sj5559jq59tstkjq5ss8sk55k55955ts59kt555s5tksjq5559tkts59ktts55jqqj95";

        //enter secret code characters
        String secretCode = "58sjtkq9";

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


