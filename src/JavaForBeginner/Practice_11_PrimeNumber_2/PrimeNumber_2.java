package JavaForBeginner.Practice_11_PrimeNumber_2;

public class PrimeNumber_2 {

    public void numberRange(int firstNumber, int lastNumber){
        System.out.print("Prime numbers between "+ firstNumber + " and " + lastNumber + " : ");
        for (int i = firstNumber; i <= lastNumber ; i++) {
            if (PrimeTest(i)==true){
                System.out.print(i + ", ");
            }
        }
    }
    public boolean PrimeTest(int checkedNumber){
        boolean PrimeNumberTest = true;

        if (checkedNumber == 1 || checkedNumber < 1) {
            PrimeNumberTest = false;
        }

        for (int i = (checkedNumber - 1); i > 1; --i)
            if (checkedNumber % i == 0) {
                PrimeNumberTest = false;
                break;
            }
        return PrimeNumberTest;
    }
    }