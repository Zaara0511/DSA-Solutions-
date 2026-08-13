# 349. Intersection of Two Arrays

## Difficulty

**Easy**

## Topic

**HashSet, Array**

## Problem

Given two integer arrays `nums1` and `nums2`, return an array containing their **intersection**.

Each element in the result must be **unique**, and the order of the result does not matter.

### Example 1

**Input**

```text
nums1 = [1,2,2,1]
nums2 = [2,2]
```

**Output**

```text
[2]
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
* Each element in the result must be unique.

---

## Approach

1. Create a `HashSet` called `set` to store all unique elements from `nums1`.
2. Create another `HashSet` called `same` to store the common elements.
3. Traverse `nums1` and add every element to `set`.
4. Traverse `nums2`.
5. For each element, check whether it exists in `set` using `contains()`.
6. If it exists, add it to `same`.
7. Since `same` is a `HashSet`, duplicate common elements are automatically ignored.
8. Create an integer array of size `same.size()`.
9. Copy all elements from `same` into the result array.
10. Return the result.

---

## Algorithm

1. Initialize two HashSets: `set` and `same`.
2. Add all elements of `nums1` into `set`.
3. Traverse `nums2`.
4. If `set.contains(x)` is true, add `x` to `same`.
5. Create an array with size equal to `same.size()`.
6. Traverse `same` and store its elements in the result array.
7. Return the result.

---

## Time Complexity

**O(n + m)**

* `n` = length of `nums1`
* `m` = length of `nums2`
* Adding elements to the first HashSet takes `O(n)` average time.
* Checking elements of `nums2` takes `O(m)` average time.
* Converting the result set to an array takes `O(n + m)` in the worst case.

## Space Complexity

**O(n + m)**

* `set` stores unique elements from `nums1`.
* `same` stores unique common elements.
* The result array also requires additional space.
