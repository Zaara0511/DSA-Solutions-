# 84. Largest Rectangle in Histogram

## Difficulty

Hard

## Topic

Stack, Monotonic Stack, Arrays

## Problem

Given an array of integers `heights` representing the histogram's bar heights where the width of each bar is `1`, return the area of the largest rectangle in the histogram.

### Input

```text
heights = [2,1,5,6,2,3]
```

### Output

```text
10
```

## Constraints

* `1 <= heights.length <= 10^5`
* `0 <= heights[i] <= 10^4`

---

## Approach

1. For every bar, find the **first smaller bar on its left**.
2. Store the starting index of the maximum possible rectangle for each bar in the `left[]` array.
3. Find the **first smaller bar on its right** for every bar.
4. Store the ending index of the maximum possible rectangle for each bar in the `right[]` array.
5. Use a **monotonic increasing stack** to efficiently find the smaller elements.
6. For each bar:

   * Calculate its width using:
     `right[i] - left[i] + 1`
   * Calculate its rectangle area:
     `width * heights[i]`
7. Keep track of the maximum area.

## Algorithm

```text
1. Create a stack and left[] and right[] arrays.

2. Traverse from left to right:
   - Remove indices whose heights are greater than or equal to
     the current height.
   - If the stack is empty, left[i] = 0.
   - Otherwise, left[i] = stack.peek() + 1.
   - Push the current index.

3. Clear the stack.

4. Traverse from right to left:
   - Remove indices whose heights are greater than or equal to
     the current height.
   - If the stack is empty, right[i] = n - 1.
   - Otherwise, right[i] = stack.peek() - 1.
   - Push the current index.

5. For every bar:
   - width = right[i] - left[i] + 1
   - area = width * heights[i]
   - Update the maximum area.

6. Return the maximum area.
```

## Time Complexity

**O(n)** — Each index is pushed and popped from the stack at most once during each traversal.

## Space Complexity

**O(n)** — The `left[]`, `right[]`, and stack can each require O(n) space.
