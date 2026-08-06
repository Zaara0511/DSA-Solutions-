# 169. Majority Element

## Difficulty

Easy

## Topic

Array, Hashing, Boyer-Moore Voting Algorithm

## Problem

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

### Example 1

**Input**

```
nums = [3,2,3]
```

**Output**

```
3
```

### Example 2

**Input**

```
nums = [2,2,1,1,1,2,2]
```

**Output**

```
2
```

## Constraints

- n == nums.length
- 1 <= n <= 5 × 10⁴
- -10⁹ <= nums[i] <= 10⁹
- The majority element always exists.

---

## Approach

1. Maintain two variables:
   - `num` to store the current candidate.
   - `count` to store its vote count.
2. Traverse the array once.
3. If `count` becomes `0`, select the current element as the new candidate.
4. If the current element equals the candidate, increment `count`; otherwise, decrement it.
5. Since the problem guarantees a majority element exists, the final candidate is the answer.

---

## Algorithm

1. Initialize `count = 0` and `num = 0`.
2. Traverse each element in the array.
3. If `count == 0`, assign the current element to `num`.
4. If the current element equals `num`, increment `count`; otherwise, decrement `count`.
5. After the traversal, return `num`.

---

## Time Complexity

**O(n)**

- The array is traversed exactly once.

---

## Space Complexity

**O(1)**

- Only two extra variables (`count` and `num`) are used.

---

## Java Solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;

        for (int x : nums) {

            if (count == 0) {
                num = x;
            }

            if (x == num) {
                count++;
            } else {
                count--;
            }
        }

        return num;
    }
}
```