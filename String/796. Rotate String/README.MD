# 796. Rotate String

## Difficulty

Easy

## Topic

String

## Problem

Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after performing some number of shifts on `s`.

A shift moves the leftmost character to the rightmost position.

### Example 1

**Input**

```text
s = "abcde"
goal = "cdeab"
```

**Output**

```text
true
```

### Example 2

**Input**

```text
s = "abcde"
goal = "abced"
```

**Output**

```text
false
```

## Constraints

* `1 <= s.length, goal.length <= 100`
* `s` and `goal` consist of lowercase English letters.

---

## Approach

1. First, check whether `s` and `goal` have the same length. If not, they cannot be rotations.
2. Find every position in `goal` where the first character of `s` occurs.
3. Treat each such position as a possible starting point of the rotation.
4. Compare the characters of `s` with `goal` starting from that position.
5. Use modulo `%` to wrap the `goal` index back to `0` when it reaches the end.
6. If all characters match for any starting position, return `true`.
7. If no starting position produces a complete match, return `false`.

---

## Algorithm

1. Store the length of `s` in `n`.
2. If the lengths of `s` and `goal` are different, return `false`.
3. If the strings are empty, return `true`.
4. Traverse every index `i` of `goal`.
5. If `goal[i]` is not equal to `s[0]`, continue to the next index.
6. Set:

   * `j = 0` → index for `s`
   * `k = i` → index for `goal`
7. Compare `s[j]` and `goal[k]`.
8. If they are different, stop checking this starting position.
9. Move `j` forward and update `k` using:

   ```java
   k = (k + 1) % n;
   ```
10. If all `n` characters match, return `true`.
11. If no starting position works, return `false`.

---

## Time Complexity

**O(n²)**

* There can be up to `n` possible starting positions.
* For each starting position, we may compare up to `n` characters.

## Space Complexity

**O(1)**

* Only a few variables are used.
* No additional data structures are required.
