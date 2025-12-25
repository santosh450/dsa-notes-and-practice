# Recursion

[YouTube Playlist](https://youtube.com/playlist?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&si=4VZFMra2RIyVpjtI)

Basic Problem - [Print numbers from 1 to n](src/main/java/recursion/PrintNumbers.java)

- Recursion
- Base Case
- Stack Overflow / Stack space
- Recursion Tree

1. Print Name N times - [Link](src/main/java/recursion/PrintNTimes.java)
2. Print numbers from 1 to N - [ink](src/main/java/recursion/Print1ToN.java)
3. Print numbers from N to 1 - [Link](src/main/java/recursion/PrintNTo1.java)
4. Back Tracking - Print numbers from 1 to N - [Link](src/main/java/recursion/Print1ToNBT.java)
5. Back Tracking - Print numbers from N to 1 - [Link](src/main/java/recursion/PrintNTo1BT.java)

### Parameterized Recursion
    function with parameters
 Sum of first N natural numbers - [Link](src/main/java/recursion/SumNFunctional.java)

### Functional Recursion
    function with return type
 Sum of first N natural numbers - [Link](src/main/java/recursion/SumNFunctional.java)
 Factorial of a number - [Link](src/main/java/recursion/Factorial.java)

## Problems on Functional Recursion

1. Reverse Array

```java
public class ReverseArray {

 static void reverse(int i, int[] arr){
  int n = arr.length;
  if(i >= n/2){
   return;
  }

  swap(i, n-1-i, arr);
  reverse(i+1, arr);

 }

 static void swap(int start, int end, int[] arr){
  int temp = arr[start];
  arr[start] = arr[end];
  arr[end] = temp;
 }

 public static void main(String[] args) {
  int[] arr = {7, 3, 2, 4, 5, 10};
  reverse(0, arr);
  System.out.println(Arrays.toString(arr));
 }
}
```
Optimal Way

```java
static void reverse(int left, int right, int[] arr){
 if(left >= right) return;

 int temp = arr[left];
 arr[left] = arr[right];
 arr[right] = temp;

 reverse(left + 1, right - 1, arr);
}

public static void main(String[] args) {
 int[] arr = {7, 3, 2, 4, 5, 10};
 reverse(0, arr.length - 1, arr);
 System.out.println(Arrays.toString(arr));
}
```
2. Palindrome Check

```java
public class Palindrome {

 static boolean isPalindrome(int l, int r, String s){
  if(l>=r){
   return true;
  }
  if(s.charAt(l)!=s.charAt(r)){
   return false;
  }
  return isPalindrome(l+1, r-1, s);
 }

 public static void main(String[] args) {
  String s = "madam";
  System.out.println(s+" is Palindrome: " +isPalindrome(0, s.length()-1, s));
 }
}
```
## Multiple recursion calls
```java
public class Fibonacci {

    static int fib(int n){
        if(n<=1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println("Fibonacci of "+n+" is: "+fib(n));
    }
}
```

## SubSequences
```java
public class SubSequences {

    static void printSequence(int i, int n, int[] org, List<Integer> l){
        if(i==n){
            System.out.println(l);
            return;
        }

        //Take
        l.add(org[i]);
        printSequence(i+1, n, org, l);

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        printSequence(i+1, n, org, l);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        printSequence(0, 3, arr, new ArrayList<>());
    }
}
```

### print subsequences whose sum is K
```java
public class SubSequencesSumK {

    static void printSequence(int i, int n, int[] org, List<Integer> l, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                System.out.println(l);
            }
            return;
        }

        //Take
        l.add(org[i]);
        currentSum += org[i];
        printSequence(i+1, n, org, l, currentSum, expected);

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        currentSum -= org[i];
        printSequence(i+1, n, org, l, currentSum, expected);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int expectedSum = 2;
        printSequence(0, 3, arr, new ArrayList<>(), 0, expectedSum);
    }
}
```

### print one subsequence whose sum is K
```java
public class SubSequencesSumKAnyone {

    static boolean printSequence(int i, int n, int[] org, List<Integer> l, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                System.out.println(l);
                return true;
            }
            return false;
        }


        //Take
        l.add(org[i]);
        currentSum += org[i];
        if(printSequence(i+1, n, org, l, currentSum, expected)){
            return true;
        }

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        currentSum -= org[i];
        if(printSequence(i+1, n, org, l, currentSum, expected)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int expectedSum = 2;
        System.out.println(printSequence(0, 3, arr, new ArrayList<>(), 0,expectedSum));
    }
}
```

### 🔥 Important Difference — `return true` vs `return;`

- **`return true`**  
  ➡️ *"I found the answer — stop EVERYTHING now."*
 - Stops the entire recursion tree
 - Prevents exploring any remaining branches
 - Used when you want **only ONE** valid answer

- **`return;`**  
  ➡️ *"I finished THIS path — continue exploring others."*
 - Only ends the current function call
 - Recursion continues into other branches
 - Used when you want **ALL** valid answers (all subsequences)


### count of subsequences whose sum is K
```java
public class SubSequencesCountSumK {

    static int printSequence(int i, int n, int[] org, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                return 1;
            }
            return 0;
        }

        //Take
        currentSum += org[i];
        int left = printSequence(i+1, n, org, currentSum, expected);

        // Not take → remove the last added element
        currentSum -= org[i];
        int right = printSequence(i+1, n, org, currentSum, expected);
        return left+right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int expectedSum = 2;
        System.out.println(printSequence(0, 3, arr, 0, expectedSum));
    }
}
```
### 🔥 Important Notes
- print all -> parameterized
- print one -> return true/false & avoid further recursive calls if it is true
- print count -> return 1/0 and call all fun()

## More Problems

### Leet Code 39. Combination Sum

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]

```java
public class CombinationSum {

    static void display(int[] arr, int sum, int index, int currentSum, ArrayList<Integer> list){
        if(currentSum == sum){
            System.out.println(list);
            return;
        }
        if(currentSum> sum || index== arr.length){
            return;
        }

        // Take
        list.add(arr[index]);
        display(arr, sum, index, currentSum+arr[index], list);

        // Not Take and Move to Next
        list.remove(list.size()-1);
        display(arr, sum, index+1, currentSum, list);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int sum = 7;
        display(arr, sum, 0,0, new ArrayList<Integer>());
    }
}
```
### SubSet sum
```java
public class SubsetSumI {

    static void display(int[] arr, int index, int totalElements, int sum){
        if(index == totalElements){
            System.out.println(sum);
            return;
        }
        // Take and move to next index
        display(arr, index+1, totalElements, sum+arr[index]);
        // NOT Take and move to next index
        display(arr, index+1, totalElements, sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2};
        int noOfElements = arr.length;
        display(arr,0 ,noOfElements, 0);

    }
}
```
# Kunal's Notes

### check if array is sorted
```java
public class SortedArray {

    static boolean isSorted(int[] arr, int index){
        if(arr.length-1 == index){
            return true;
        }

        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 88, 96, 100};
        System.out.println(isSorted(arr, 0));
        int[] arr2 = {1, 5, 88, 96, 10};
        System.out.println(isSorted(arr2, 0));

    }
}
```

## Linear Search
### Search - check if target is found

isElement found - return true  
isElement found - return index element  
isElement found - return list of indexes  
isElement found - return Last index  
isElement found - **return Last index Back Tracking** 🔥  

different references but same object  
vs  
different objects  
```java
// ArrayList<Integer> list inside parameter - Makes different references but all points to same object
    private static ArrayList<Integer> foundAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return foundAllIndex(arr, target, index+1,list);
    }

    // ArrayList<Integer> list inside function - new object objects
    private static ArrayList<Integer> foundAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer>  ansFromBelowCalls = foundAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
```

Complete problem - [Solution](src/main/java/recursion/SearchElement.java)

## Rotated Binary Search

Complete problem - [Solution](src/main/java/recursion/RotatedBinarySearch.java)


### Patterns

Complete problem - [Solution](src/main/java/recursion/Patterns01.java)

```java
static void printPattern(int row, int column){
        if(row==0){
            return;
        }
        if(row == column){
            System.out.println();
            printPattern(row-1, 0);
            return;
        }
        System.out.print("* ");
        printPattern(row, column+1);
    }
```
### vs

```java
static void printPattern01(int row, int column){
        if(row==0){
            return;
        }
        if(row == column){
            System.out.println();
            printPattern01(row-1, 0);
        } else {
            System.out.print("* ");
            printPattern01(row, column + 1);
        }
    }
```
⚠️ **Important:** Always return recursive calls.

### Bubble Sort

Complete problem - [Solution](src/main/java/recursion/BubbleSort.java)

### Selection Sort

Complete problem - [Solution](src/main/java/recursion/SelectionSort.java)


### skip character

Complete problem - [Solution](src/main/java/recursion/Strings01.java)

## SubSequences
```java
public class SubSeq {

    public static void main(String[] args) {
        subSequence("", "abc");
    }

    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //take
        subSequence(p+up.charAt(0), up.substring(1));
        //Not take
        subSequence(p, up.substring(1));
    }
}
```
Complete problem - [Solution](src/main/java/recursion/SubSeq.java)

### Permutations

```java
public class Permutations {

    public static void main(String[] args) {
        permutations("", "abc");
    }

    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations(f+ch+s, up.substring(1));
        }
    }
}
```
### 🌳 Recursion Tree
```
"" , "abc"
 └─ "a" , "bc"
    ├─ "ba" , "c"
    │   ├─ "cba"
    │   └─ "bca"
    └─ "ab" , "c"
        ├─ "cab"
        └─ "acb"

```
Complete problem - [Solution](src/main/java/recursion/Permutations.java)

## 17. Letter Combinations of a Phone Number

Leet Code 17 - [Problem](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)  
Complete problem - [Solution](src/main/java/recursion/PhoneKeyPad.java)

## Single dice 
4 -> {1111, 112, 121, 13, 211, 22, 31, 4 }
```java
public class Dice01 {

    public static void main(String[] args) {
        diceComb("", 4);
    }

    static void diceComb(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            diceComb(p+i, target-i);
        }
    }
}
```

# Maze, BackTracking

(3,3) -> (1,1)  (Consider only Right, Down)  
Complete problem - [Solution](src/main/java/recursion/backTracking/Maze.java)  
```java
static int count01(int r, int c) {
    if(r==1 || c==1){
        return 1;
    }
    int right = count(r-1, c);
    int down = count(r, c-1);
    return right+down;
}

static void path01(String p, int r, int c) {
    if(r==1 && c==1){
        System.out.println(p);
        return;
    }
    if(r>1) {
        path01(p + 'D', r - 1, c);
    }
    if(c>1) {
        path01(p + 'R', r, c - 1);
    }
}
```
### BackTracking

consider Right, Down, Up and Left  
## All Paths in Matrix (Backtracking)

- true  → free cell
- false → visited cell

Algorithm:
1. Mark current cell as visited
2. Explore D, R, U, L
3. If destination reached → print path
4. Before returning → unmark cell (backtrack)

Key Insight:
Backtracking = Do → Explore → Undo

```java
static void allPaths(String p,boolean[][] maze,  int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // consider this block in my path
        maze[r][c] = false;
        
        if(r<maze.length-1) {
            allPaths(p + 'D', maze, r + 1, c);
        }
        if(c<maze[0].length-1) {
            allPaths(p + 'R', maze, r, c + 1);
        }
        if(r>0){
            allPaths(p + 'U', maze, r-1, c);
        }
        if(c>0){
            allPaths(p + 'L', maze, r, c-1);
        }

        //this line is  where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
```
Complete problem - [Solution](src/main/java/recursion/backTracking/AllPaths.java)  


### N-Queens

## N-Queens Backtracking

Rules:
- One queen per row
- No same column
- No diagonals

Algorithm:
1. Try placing queen row by row
2. For each column:
    - Check vertical & diagonals
3. If safe → place queen
4. Recurse to next row
5. Backtrack after return

Pattern:
PLACE → EXPLORE → UNDO

Complete problem - [Solution](src/main/java/recursion/backTracking/NQueens.java)

## N-Knights Problem (Backtracking)

Place **K knights** on an **N×N chessboard** such that **no two knights attack each other**.
Print all valid boards and return the **count of solutions**. 

Complete problem - [Solution](src/main/java/recursion/backTracking/NKnights.java)

## Sudoku Solver (Backtracking)

- Board: int[9][9]
- 0 → empty cell
- Try numbers 1–9

Steps:
1. Find first empty cell
2. Try all numbers
3. Check row, column, 3×3 box
4. Place number
5. Recurse
6. Undo if failed

Pattern:
PLACE → EXPLORE → UNDO

Complete problem - [Solution](src/main/java/recursion/backTracking/Sudoku.java)