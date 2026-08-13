# 387. First Unique Character in a String

## Difficulty

**Easy**

## Topic

**HashMap, String, Frequency Counting**

## Problem

Given a string `s`, find the **first non-repeating character** and return its index.

If no unique character exists, return `-1`.

### Example 1

**Input**

```text
s = "leetcode"
```

**Output**

```text
0
```

### Example 2

**Input**

```text
s = "loveleetcode"
```

**Output**

```text
2
```

### Example 3

**Input**

```text
s = "aabb"
```

**Output**

```text
-1
```

## Constraints

* `1 <= s.length <= 10^5`
* `s` consists of lowercase English letters.

---

## Approach

1. Use a `HashMap` to store the frequency of each character.
2. Traverse the string and count how many times each character appears.
3. Traverse the string again from left to right.
4. Check the frequency of each character.
5. The first character with a frequency of `1` is the answer.
6. Return its index.
7. If no unique character is found, return `-1`.

---

## Algorithm

1. Initialize a `HashMap<Character, Integer>`.
2. Traverse the string and store the frequency of each character.
3. Traverse the string again using its index.
4. Check whether the current character has frequency `1`.
5. If yes, return its index.
6. If the traversal finishes without finding a unique character, return `-1`.

---

## Time Complexity

**O(n)**

* One traversal is used to count frequencies.
* A second traversal is used to find the first unique character.
* Overall complexity is **O(n)**.

## Space Complexity

**O(k)**

* `k` represents the number of distinct characters.
* Since the string contains lowercase English letters, `k <= 26`.
* Therefore, the extra space is effectively **O(1)**.
