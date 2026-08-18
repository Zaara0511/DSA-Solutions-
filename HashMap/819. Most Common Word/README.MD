# 819. Most Common Word

## Difficulty

Easy

## Topic

HashMap, HashSet, String

## Problem

Given a string `paragraph` and an array of banned words, return the most common word in the paragraph that is **not banned**.

The paragraph may contain punctuation and uppercase letters. Words are considered case-insensitive.

### Example 1

**Input**

```text
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
```

**Output**

```text
"ball"
```

### Example 2

**Input**

```text
paragraph = "a."
banned = []
```

**Output**

```text
"a"
```

## Constraints

* `1 <= paragraph.length <= 1000`
* `0 <= banned.length <= 100`
* `1 <= banned[i].length <= 10`
* `paragraph` consists of English letters, spaces, or punctuation.
* Every word in `banned` consists of lowercase English letters.
* The answer is guaranteed to be unique.

---

## Approach

1. Use a `HashSet` to store all banned words for fast lookup.
2. Convert the paragraph to lowercase so that words are treated case-insensitively.
3. Replace punctuation characters with spaces so that words can be separated correctly.
4. Split the cleaned paragraph into individual words using whitespace.
5. Use a `HashMap` to store the frequency of each word.
6. Traverse the frequency map and ignore words that are present in the banned set.
7. Keep track of the word with the highest frequency.
8. Return that word as the answer.

---

## Algorithm

1. Create a `HashMap<String, Integer>` for word frequencies.
2. Create a `HashSet<String>` and add every banned word.
3. Convert `paragraph` to lowercase.
4. Replace punctuation characters with spaces.
5. Split the paragraph using `\\s+`.
6. Traverse all words:

   * Add each word to the frequency map.
   * Increase its frequency using `getOrDefault()`.
7. Initialize `max = 0` and an empty answer.
8. Traverse the frequency map:

   * If the word is not banned and its frequency is greater than `max`, update the answer.
9. Return the most frequent non-banned word.

---

## Time Complexity

**O(n + b)**

* `n` is the length of the paragraph.
* `b` is the number of banned words.
* Building the banned set takes `O(b)`.
* Processing the paragraph and counting frequencies takes `O(n)`.
* Traversing the frequency map takes `O(n)` in the worst case.

## Space Complexity

**O(n + b)**

* The `HashMap` stores the distinct words and their frequencies.
* The `HashSet` stores the banned words.
