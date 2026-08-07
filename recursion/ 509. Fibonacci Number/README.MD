# 509. Fibonacci Number

## Difficulty

Easy

## Topic

Recursion, Dynamic Programming, Math

## Problem

The **Fibonacci numbers** are defined as:

- `F(0) = 0`
- `F(1) = 1`
- `F(n) = F(n - 1) + F(n - 2)`, for `n > 1`

Given an integer `n`, return `F(n)`.

### Example 1

**Input**

```
n = 2
```

**Output**

```
1
```

### Example 2

**Input**

```
n = 3
```

**Output**

```
2
```

### Example 3

**Input**

```
n = 4
```

**Output**

```
3
```

## Constraints

- 0 <= n <= 30

---

## Approach

1. If `n` is `0` or `1`, return `n`.
2. Otherwise, recursively compute:
   - `fib(n - 1)`
   - `fib(n - 2)`
3. Return the sum of the two recursive calls.

---

## Algorithm

1. Check if `n < 2`.
2. If true, return `n`.
3. Otherwise, return `fib(n - 1) + fib(n - 2)`.

---

## Time Complexity

**O(2ⁿ)**

- Each recursive call branches into two more calls, leading to repeated computations.

---

## Space Complexity

**O(n)**

- Due to the recursion call stack.

---

## Java Solution

```java
class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
```