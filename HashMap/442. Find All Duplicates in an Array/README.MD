# 442. Find All Duplicates in an Array

## Difficulty

**Medium**

## Topic

**HashMap, Array, Frequency Counting**

## Problem

Given an integer array `nums` of length `n` where:

* Each integer appears **once or twice**.
* Return a list containing all the integers that appear **twice**.

The order of the returned elements does not matter.

### Example 1

**Input**

```text
nums = [4,3,2,7,8,2,3,1]
```

**Output**

```text
[2,3]
```

### Example 2

**Input**

```text
nums = [1,1,2]
```

**Output**

```text
[1]
```

### Example 3

**Input**

```text
nums = [1]
```

**Output**

```text
[]
```

## Constraints

* `n == nums.length`
* `1 <= n <= 10^5`
* `1 <= nums[i] <= n`
* Each element in `nums` appears **once or twice**.

---

## Approach

1. Create a `HashMap` to store the frequency of each number.
2. Traverse the array and update the frequency of every element.
3. Traverse the `HashMap` using `entrySet()`.
4. For each entry, check whether its frequency is at least `2`.
5. If the frequency is `2`, add the corresponding key to the result list.
6. Return the result list.

---

## Algorithm

1. Initialize an empty `ArrayList<Integer>` for the answer.
2. Create a `HashMap<Integer, Integer>`.
3. Traverse `nums`:

   * Get the current number.
   * Increase its frequency using `getOrDefault()`.
4. Traverse `map.entrySet()`.
5. For every entry:

   * Get the key using `getKey()`.
   * Get the frequency using `getValue()`.
   * If the frequency is `2`, add the key to the result.
6. Return the result.

---

## Time Complexity

**O(n)**

* Building the frequency map takes `O(n)`.
* Traversing the HashMap takes `O(n)` in the worst case.
* Overall: **O(n)**.

## Space Complexity

**O(n)**

* The HashMap can store up to `n` distinct elements.
* The result list can also contain up to `n/2` elements.
* Overall auxiliary space is **O(n)**.
