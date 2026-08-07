# 229. Majority Element II

## Difficulty

Medium

## Topic

Array, Boyer-Moore Voting Algorithm

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

### Example 1

**Input**

```
nums = [3,2,3]
```

**Output**

```
[3]
```

### Example 2

**Input**

```
nums = [1]
```

**Output**

```
[1]
```

### Example 3

**Input**

```
nums = [1,2]
```

**Output**

```
[1,2]
```

## Constraints

- `1 <= nums.length <= 5 × 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`

---

## Approach

1. Since we need elements occurring more than `n/3` times, there can be at most **two** such elements.
2. Use the **Extended Boyer-Moore Voting Algorithm** to find two potential majority candidates.
3. Traverse the array again to count the actual frequency of both candidates.
4. Add the candidates whose frequency is greater than `⌊n / 3⌋` to the answer.

---

## Algorithm

1. Initialize two candidates and their corresponding counts.
2. Traverse the array:
   - If the current element matches one of the candidates, increment its count.
   - If a candidate's count becomes `0`, assign the current element as the new candidate.
   - Otherwise, decrement both counts.
3. Reset both counts.
4. Traverse the array again to count the occurrences of both candidates.
5. If a candidate appears more than `⌊n / 3⌋` times, add it to the result.
6. Return the list of majority elements.

---

## Time Complexity

**O(n)**

- One traversal to determine the two potential candidates.
- One traversal to verify their frequencies.

Overall:

- **O(n)**

---

## Space Complexity

**O(1)**

- Only a constant number of extra variables are used.