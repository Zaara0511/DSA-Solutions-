# 217. Contains Duplicate

## Difficulty

**Easy**

## Topic

**HashMap, Array**

## Problem

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

### Example 1

**Input**

```text
nums = [1,2,3,1]
```

**Output**

```text
true
```

### Example 2

**Input**

```text
nums = [1,2,3,4]
```

**Output**

```text
false
```

### Example 3

**Input**

```text
nums = [1,1,1,3,3,4,3,2,4,2]
```

**Output**

```text
true
```

## Constraints

* `1 <= nums.length <= 10^5`
* `-10^9 <= nums[i] <= 10^9`

---

## Approach

1. Create a `HashMap` to keep track of the elements already encountered.
2. Traverse the array from left to right.
3. For every element, check whether it already exists in the HashMap using `containsKey()`.
4. If it exists, a duplicate has been found, so return `true`.
5. Otherwise, add the element to the HashMap.
6. If the complete array is traversed without finding a duplicate, return `false`.

---

## Algorithm

1. Initialize an empty `HashMap`.
2. Traverse every element `k` in `nums`.
3. Check:

   * If `map.containsKey(k)` is `true`, return `true`.
   * Otherwise, add `k` to the map.
4. After the loop, return `false`.

---

## Time Complexity

**O(n)**

* Each element is checked once.
* HashMap insertion and lookup take **O(1)** average time.
* Overall: **O(n)**.

## Space Complexity

**O(n)**

* In the worst case, all elements are unique and must be stored in the HashMap.
