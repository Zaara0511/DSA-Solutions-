# 28. Find the Index of the First Occurrence in a String

## Difficulty

Easy

## Topic

String

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`.

If `needle` is not present in `haystack`, return `-1`.

### Example 1

**Input**

```text
haystack = "sadbutsad"
needle = "sad"
```

**Output**

```text
0
```

### Example 2

**Input**

```text
haystack = "leetcode"
needle = "leeto"
```

**Output**

```text
-1
```

## Constraints

* `1 <= haystack.length, needle.length <= 10^4`
* `haystack` and `needle` contain only lowercase English letters.

---

## Approach

1. Find the length of `needle` and `haystack`.
2. Traverse `haystack` from index `0`.
3. At each index `i`, take a substring of length `needle`.
4. Compare the substring with `needle`.
5. If they are equal, return the current index.
6. If no match is found, return `-1`.

---

## Algorithm

1. Set `n = needle.length()`.
2. Set `h = haystack.length()`.
3. Loop while `i <= h - n`.
4. Check `haystack.substring(i, i + n).equals(needle)`.
5. If true, return `i`.
6. Return `-1` if no occurrence is found.

---

## Time Complexity

**O(h × n)**

* We check up to `h - n + 1` positions.
* Each substring comparison can take up to `O(n)` time.

## Space Complexity

**O(n)**

* `substring()` creates a temporary string of length `n`.
