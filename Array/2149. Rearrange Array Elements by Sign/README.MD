# 2149. Rearrange Array Elements by Sign

## Difficulty

Medium

## Topic

Array

## Problem

You are given a 0-indexed integer array `nums` of even length consisting of an equal number of positive and negative integers.

Rearrange the elements so that:

- Every consecutive pair contains one positive and one negative integer.
- The array starts with a positive integer.
- The relative order of positive integers is preserved.
- The relative order of negative integers is preserved.

Return the modified array.

### Example 1

**Input**

```
nums = [3,1,-2,-5,2,-4]
```

**Output**

```
[3,-2,1,-5,2,-4]
```

### Example 2

**Input**

```
nums = [-1,1]
```

**Output**

```
[1,-1]
```

## Constraints

- 2 <= nums.length <= 2 × 10⁵
- nums.length is even.
- Half of the integers are positive.
- Half of the integers are negative.

---

## Approach

1. Use two arrays to separate positive and negative numbers.
2. Make another array to store the answer in the required alternating format.
3. Traverse the positive and negative arrays simultaneously.
4. Place positive numbers at even indices and negative numbers at odd indices.

---

## Algorithm

1. Create two arrays:
   - `pos[]` for positive numbers.
   - `neg[]` for negative numbers.
2. Traverse the given array.
3. Store positive numbers in `pos[]`.
4. Store negative numbers in `neg[]`.
5. Create the result array.
6. Fill even indices with positive numbers.
7. Fill odd indices with negative numbers.
8. Return the result array.

---

## Time Complexity

**O(n)**

- One traversal to separate positive and negative numbers.
- One traversal to construct the answer array.

---

## Space Complexity

**O(n)**

- Extra arrays are used to store positive numbers, negative numbers, and the final answer array.