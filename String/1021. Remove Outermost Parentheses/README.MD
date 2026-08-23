# 1021. Remove Outermost Parentheses

## Difficulty

Easy

## Topic

Stack, String, StringBuilder

## Problem

A valid parentheses string is made up of one or more **primitive valid parentheses strings**.

A primitive valid parentheses string cannot be split into two non-empty valid parentheses strings.

Given a valid parentheses string `s`, remove the **outermost parentheses** of every primitive string and return the resulting string.

### Example 1

**Input**

```text
s = "(()())(())"
```

**Output**

```text
"()()()"
```

### Example 2

**Input**

```text
s = "(()())(())(()(()))"
```

**Output**

```text
"()()()()(())"
```

## Constraints

```text
1 <= s.length <= 10^5
s[i] is either '(' or ')'
s is a valid parentheses string.
```

---

## Approach

1. Use a **Stack** to keep track of the currently open parentheses.
2. If the stack is empty and the current character is `(`, it is the **outermost opening bracket**, so skip it and push its index.
3. When we encounter another `(` while the stack is not empty, push it and add it to the `StringBuilder` because it is an **inner bracket**.
4. When we encounter `)`, pop from the stack.
5. After popping:

   * If the stack is empty, this `)` is the **outermost closing bracket**, so skip it.
   * Otherwise, it is an inner `)`, so append it.
6. Return the `StringBuilder` as the final answer.

---

## Algorithm

1. Create an empty `StringBuilder` `sb`.
2. Create a `Stack<Integer>` `st`.
3. Traverse every character of the string:

   * If the stack is empty:

     * If the character is `(`, push its index.
   * Otherwise:

     * If the character is `)`:

       * Pop the stack.
       * If the stack is not empty, append `)` to `sb`.
     * If the character is `(`:

       * Push its index.
       * Append `(` to `sb`.
4. Return `sb.toString()`.

---

## Time Complexity

**`O(n)`**

* We traverse the string once.
* Each parenthesis is pushed and popped at most once.

## Space Complexity

**`O(n)`**

* The stack can contain up to `n` elements in the worst case.
* The `StringBuilder` can also store up to `n` characters.
