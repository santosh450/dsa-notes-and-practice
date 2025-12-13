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

### Search - check if target is found

isElement found - return true
isElement found - return index element
isElement found - return list of indexes
isElement found - return Last index
isElement found - return Last index Back Tracking 🔥

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







