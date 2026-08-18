# 151. Reverse Words in a String

## Difficulty

Medium

## Topic

String, StringBuilder

## Problem

Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in the output should be separated by a **single space**, with no leading or trailing spaces.

### Example 1

**Input**

```text
s = "the sky is blue"
```

**Output**

```text
"blue is sky the"
```

### Example 2

**Input**

```text
s = "  hello world  "
```

**Output**

```text
"world hello"
```

### Example 3

**Input**

```text
s = "a good   example"
```

**Output**

```text
"example good a"
```

## Constraints

* `1 <= s.length <= 10^4`
* `s` contains English letters, digits, and spaces.
* There is at least one word in `s`.

---

## Approach

1. Remove leading and trailing spaces from the string.
2. Split the string into words using `\\s+` so that multiple spaces are handled correctly.
3. Traverse the words from the last word to the first.
4. Append each word to a `StringBuilder`.
5. Add a single space between words.
6. Return the constructed string.

---

## Algorithm

1. Create a `StringBuilder`.
2. Remove leading and trailing spaces using `strip()`.
3. Split the string using `\\s+`.
4. Start from the last word and move toward the first word.
5. Append each word to the `StringBuilder`.
6. Add a space between words, but not after the final word.
7. Return the resulting string.

---

## Time Complexity

**O(n)**

* The string is processed a constant number of times.
* `n` is the length of the input string.

## Space Complexity

**O(n)**

* The split array and `StringBuilder` require space proportional to the input size.
