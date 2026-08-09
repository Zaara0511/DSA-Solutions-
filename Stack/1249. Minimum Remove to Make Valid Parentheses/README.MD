# 1249. Minimum Remove to Make Valid Parentheses

## Difficulty

Medium

## Topic

String, Stack, StringBuilder

## Problem

Given a string `s` containing lowercase English letters, `'('`, and `')'`, remove the minimum number of parentheses so that the resulting string is valid.

Return any valid string.

A parentheses string is valid when every opening parenthesis has a matching closing parenthesis and the parentheses are correctly nested.

## Examples

### Example 1

```text
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
```

The extra closing parenthesis `)` is removed.

### Example 2

```text
Input: s = "a)b(c)d"
Output: "ab(c)d"
```

The unmatched closing parenthesis `)` is removed.

### Example 3

```text
Input: s = "))(("
Output: ""
```

All parentheses are unmatched, so they are removed.

## Constraints

* `1 <= s.length <= 10^5`
* `s[i]` is a lowercase English letter, `'('`, or `')'`

---

## Approach

Use a **stack** to keep track of unmatched opening parentheses.

While traversing the string:

* If the character is a lowercase letter, add it to the `StringBuilder`.
* If it is `'('`, add it to the `StringBuilder` and store its position in the stack.
* If it is `')'`:

  * If the stack is not empty, it matches an earlier `'('`, so pop the stack and add `')'`.
  * If the stack is empty, this `')'` is invalid, so don't add it.
* After traversing the string, any `'('` positions remaining in the stack are unmatched and must be removed.

The stack stores the **index of each opening parenthesis in the `StringBuilder`**, not its index in the original string. This is important because invalid closing parentheses are not added to the `StringBuilder`.

## Algorithm

1. Create an empty `StringBuilder` and `Stack<Integer>`.
2. Traverse the string:

   * For a lowercase character, append it.
   * For `'('`, append it and push its index in `StringBuilder` onto the stack.
   * For `')'`, if the stack is not empty, pop and append it; otherwise ignore it.
3. While the stack is not empty:

   * Pop the index of an unmatched `'('`.
   * Delete that character from the `StringBuilder`.
4. Return the resulting string.

## Time Complexity

The string is traversed once, and the remaining unmatched parentheses are processed once.

**Time Complexity: O(n)**

Even though there are two traversals, `O(n) + O(n) = O(2n) = O(n)`.

## Space Complexity

The `StringBuilder` can store up to `n` characters and the stack can store up to `n` indices.

**Space Complexity: O(n)**

`O(n) + O(n) = O(2n) = O(n)`.
