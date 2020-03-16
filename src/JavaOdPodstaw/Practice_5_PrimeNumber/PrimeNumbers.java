package JavaOdPodstaw.Practice_5_PrimeNumber;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println((-9+ " - is a prime number? - ")+primeNumber(-9));
        System.out.println((-7+ " - is a prime number? - ")+primeNumber(-7));
        System.out.println((0+ " - is a prime number? - ")+primeNumber(0));
        System.out.println((1+ " - is a prime number? - ")+primeNumber(1));
        System.out.println("-----------------------------");
        System.out.println((3+ " - is a prime number? - ")+primeNumber(3));
        System.out.println((5+ " - is a prime number? - ")+primeNumber(5));
        System.out.println((7+ " - is a prime number? - ")+primeNumber(7));
        System.out.println((11+ " - is a prime number? - ")+primeNumber(11));
        System.out.println((13+ " - is a prime number? - ")+primeNumber(13));
        System.out.println("-----------------------------");
        System.out.println((4+ " - is a prime number? - ")+primeNumber(4));
        System.out.println((6+ " - is a prime number? - ")+primeNumber(6));
        System.out.println((8+ " - is a prime number? - ")+primeNumber(8));
        System.out.println((9+ " - is a prime number? - ")+primeNumber(9));
        System.out.println((10+ " - is a prime number? - ")+primeNumber(10));


    }


    public static boolean primeNumber(int Number) {
        boolean PrimeNumberTest = true;

        if (Number == 1 || Number < 1) {
            PrimeNumberTest = false;
        }

        for (int i = (Number - 1); i > 1; --i)
            if (Number % i == 0) {
                PrimeNumberTest = false;
                break;
                }
        return PrimeNumberTest;
    }
}