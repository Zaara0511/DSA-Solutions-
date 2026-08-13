# 350. Intersection of Two Arrays II

## Difficulty

**Easy**

## Topic

**HashMap, Array, Frequency Counting**

## Problem

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must appear as many times as it shows in **both arrays**.

The order of the result does not matter.

### Example 1

**Input**

```text
nums1 = [1,2,2,1]
nums2 = [2,2]
```

**Output**

```text
[2,2]
```

### Example 2

**Input**

```text
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
```

**Output**

```text
[4,9]
```

## Constraints

* `1 <= nums1.length, nums2.length <= 1000`
* `0 <= nums1[i], nums2[i] <= 1000`
* The order of the output does not matter.

---

## Approach

1. Create a `HashMap<Integer, Integer>` to store the frequency of every element in `nums1`.
2. Traverse `nums1` and increment the frequency of each number.
3. Traverse `nums2`.
4. For each number, check whether it exists in the HashMap and whether its remaining frequency is greater than `0`.
5. If available:

   * Add the number to the result list.
   * Decrease its frequency in the HashMap.
6. Convert the result list into an integer array.
7. Return the result.

---

## Algorithm

1. Initialize a HashMap to store frequencies of elements in `nums1`.
2. For every element `x` in `nums1`:

   * Increment its frequency using `getOrDefault()`.
3. Initialize an `ArrayList<Integer>` for the answer.
4. For every element `y` in `nums2`:

   * Check if `y` exists in the map.
   * Check if its frequency is greater than `0`.
   * If both conditions are true:

     * Add `y` to the list.
     * Decrease its frequency by `1`.
5. Create an array of size `list.size()`.
6. Copy all elements from the list into the result array.
7. Return the result.

---

## Time Complexity

**O(n + m)**

* `n` = length of `nums1`
* `m` = length of `nums2`
* Building the frequency map takes `O(n)`.
* Traversing `nums2` takes `O(m)`.
* Converting the list to an array takes `O(m)` in the worst case.
* Overall: **O(n + m)**.

## Space Complexity

**O(min(n, m))**

* The HashMap stores frequencies of elements from `nums1`.
* The result list stores the intersection elements.
* Overall auxiliary space is **O(n + m)** in the general case.
