### Sieve of Eratosthenes
```java
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
```
[Java Code](src/main/java/maths/PrimesSieve.java)

### Binary Search Square root

[Java Code](src/main/java/maths/BinarySearchSquareRoot.java)

### Newton’s Method (Newton–Raphson) for Square Root

Newton Square Root

Formula:
x = (x + n / x) / 2

Steps:
1. Start with x = n
2. Iterate until |x - prev| < precision
3. Return x

Advantages:
- Faster than binary search
- Constant space

[Java Code](src/main/java/maths/NewtonSQRT.java)

### Factors of numbers  
[Java Code](src/main/java/maths/Factors.java)

### GCD (Euclidean Algorithm)

Formula:
gcd(a, b) = gcd(b, a % b)

Base case:
b == 0 → a is GCD

Time Complexity:
O(log min(a, b))

HCF:
- Highest common factor
- Common primes with lowest power
- 12 (1, 2, 3, 4, 6, 12), 18 (1, 2, 3, 6, 9, 18) => 1, 2, 3, 6 => 6
- 12 (2² × 3), 18 (2 × 3²) => 2 * 3 => 6

LCM:
- Least common multiple
- All primes with highest power
- 12 (12, 24, 36, 48, 60, ...), 18 (18, 36, 54, 72, ...) => 36, 72.. => 36 
- 12 (2² × 3), 18 (2 × 3²) => 2² × 3² => 36

Method:
1. Prime factorize numbers
2. HCF → min powers
3. LCM → max powers

Relation:
LCM × HCF = a × b

