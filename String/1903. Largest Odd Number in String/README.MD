# 1903. Largest Odd Number in String

## Difficulty

Easy

## Topic

String, Greedy

## Problem

You are given a string `num` representing a large integer.

Return the **largest-valued odd integer** that is a non-empty substring of `num`, or return an empty string `""` if no odd integer exists.

A number is odd if its last digit is odd.

### Example 1

**Input**

```text
num = "52"
```

**Output**

```text
"5"
```

### Example 2

**Input**

```text
num = "4206"
```

**Output**

```text
""
```

### Example 3

**Input**

```text
num = "35427"
```

**Output**

```text
"35427"
```

## Constraints

```text
1 <= num.length <= 10^5
num consists only of digits.
num does not contain leading zeros.
```

---

## Approach

1. A number is odd only when its **last digit is odd**.
2. To get the largest odd number, we need to find the **rightmost odd digit** in the string.
3. Traverse the string from **right to left**.
4. For every character, convert it into a digit using:

   ```java
   ch - '0'
   ```
5. If the digit is odd, return the substring from index `0` to `i + 1`.
6. If no odd digit is found, return an empty string `""`.

---

## Algorithm

1. Set `n = num.length()`.
2. Start a loop from `n - 1` and move towards `0`.
3. Get the current character using `num.charAt(i)`.
4. Check whether the digit is odd:

   ```java
   (ch - '0') % 2 != 0
   ```
5. If it is odd, return:

   ```java
   num.substring(0, i + 1)
   ```
6. If the loop finishes without finding an odd digit, return `""`.

---

## Time Complexity

**`O(n)`**

* We scan the string from right to left.
* In the worst case, every character is checked once.

## Space Complexity

**`O(1)`**

* No extra data structure is used.
* Only a few variables are required.
