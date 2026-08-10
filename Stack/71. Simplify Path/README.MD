# 71. Simplify Path

## Difficulty

Medium

## Topic

Stack, String

## Problem

Given an absolute Unix-style path, simplify it into its canonical path.

## Examples

```text
Input:  "/home/"
Output: "/home"
```

```text
Input:  "/home//foo/"
Output: "/home/foo"
```

```text
Input:  "/home/user/../docs"
Output: "/home/docs"
```

```text
Input:  "/../"
Output: "/"
```

## Constraints

* `1 <= path.length <= 3000`
* `path` consists of English letters, digits, `.`, and `/`.
* `path` is an absolute path.

---

## Approach

Use a **Stack** to store valid directory names.

* `"."` → ignore it.
* `""` → ignore it because it is created by consecutive `/`.
* `".."` → go to the parent directory by popping from the stack if possible.
* Any other string → valid directory, so push it into the stack.

Finally, build the answer by adding `/` before every directory in the stack.

## Algorithm

1. Split the path using `/`.
2. Create an empty `Stack<String>`.
3. Traverse every part:

   * If it is `".."`, pop if the stack is not empty.
   * If it is `"."` or `""`, skip it.
   * Otherwise, push it into the stack.
4. Create a `StringBuilder`.
5. Append `/` and each directory from the stack.
6. Return the resulting string.

## Time Complexity

**O(n)**

Each part of the path is processed once.

## Space Complexity

**O(n)**

The stack can contain up to `n` directory names in the worst case.
