## 🔹 Bitwise Operators

### ✅ AND (`&`)
0 & a = 0
1 & a = a

✔ Used for masking and checking bits

---

### ✅ OR (`|`)
0 | a = a
1 | a = 1

✔ Used to set bits

---

### ✅ XOR (`^`)
0 ^ a = a
1 ^ a = ~a (bit flip)
a ^ a = 0

✔ Properties:
- Same numbers cancel out
- Order does not matter

✔ Used in:
- Single number problems
- Swapping values
- Bit flipping

---

### ✅ Complement (`~`)
~a → flips all bits

Example (8-bit):
a = 00001010 (10)
~a = 11110101

---

## 🔹 Shift Operators

### ✅ Left Shift (`<<`)
10 << 1 → 1010 << 1 → 10100 → 20

Formulas:
a << 1 = a * 2
a << b = a * (2^b)

✔ Fast multiplication by powers of 2

---

### ✅ Right Shift (`>>`)
a >> 1 = a / 2

✔ Fast division by 2  
✔ Preserves sign bit

---

## 🔹 Even / Odd Check (LSB)

### Least Significant Bit
n & 1 == 1 → Odd
n & 1 == 0 → Even

---

## 🔹 Find Single Number (Others Appear Twice)

### XOR Trick
a ^ a = 0
a ^ 0 = a

### Java
```
int single = 0;
for (int num : arr) {
    single ^= num;
}
```
✔ Time: O(n)  
✔ Space: O(1)

🔹 Find ith Bit  
num & (1 << (i - 1))  
✔ Checks whether ith bit is set

🔹 Set ith Bit  
num | (1 << (i - 1))  
✔ Sets ith bit to 1

🔹 Reset (Clear) ith Bit  
num & ~(1 << (i - 1))  
✔ Sets ith bit to 0

🔹 Negative of a Number (2’s Complement)  
Example: -10

1️⃣ Binary of 10  
00001010
  
2️⃣ 1’s Complement  
11110101
  
3️⃣ Add 1 → 2’s Complement  

11110110  
✔ This is how negative numbers are stored

🔹 Range of Signed Integers  
8-bit signed integer


-128 to 127  
General formula:  
-(2^(n-1)) to (2^(n-1) - 1)


🔹 Find Rightmost Set Bit

n & (-n)  
✔ Extracts lowest set bit  
✔ Very important trick  

🔹 Number of Digits in Base b

(int)(log(n) / log(b)) + 1  


🔹 Pascal Triangle – Sum of nth Row
2^(n-1)
Using bit shift:
1 << (n - 1)


🔹 Check if Number is Power of 2
Best Method

n > 0 && (n & (n - 1)) == 0  
✔ Power of 2 has exactly one set bit

🔹 Count Set Bits (1s in Binary)  
Brian Kernighan’s Algorithm
```
int count = 0;
while (n > 0) {
    n = n & (n - 1);
    count++;
}
```
Alternative:

n = n - (n & -n)  
✔ Time depends on number of set bits

🔹 Important Bit Identities (🔥 Must Remember)  
n & 0 = 0  
n | 0 = n  
n ^ 0 = n  
n ^ n = 0  
n & (n - 1) → removes lowest set bit  
n & (-n) → extracts lowest set bit  

### Single Number

{2, 2, 3, 2} = 2

Complete problem - [Solution](src/main/java/bitManupulations/SingleNum.java)

### Magic Number (Bit Manipulation – Power of 5)
 
for n=1 -> 5, n=2(10) -> 25, n=3(11) -> 30 etc

Complete problem - [Solution](src/main/java/bitManupulations/MagicNum.java)

### Power of Num

3^6 = 3^(110) = 3^4 * 3^2 * 3^0

Complete problem - [Solution](src/main/java/bitManupulations/PowerNum.java)

### Range XOR

Complete problem - [Solution](src/main/java/bitManupulations/RangeXOR.java)

### Flip Image

Complete problem - [Statement](https://leetcode.com/problems/flipping-an-image/description/)
Complete problem - [Solution](src/main/java/bitManupulations/FlipImage.java)

