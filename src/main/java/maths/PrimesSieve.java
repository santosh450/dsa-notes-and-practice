package maths;

public class PrimesSieve {

    public static void main(String[] args) {
        primes(40);
    }

    static void primes(int n){
        boolean[] prime = new boolean[n+1];

        // false in array means number is prime
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

