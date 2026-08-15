# 2643. Row With Maximum Ones

## Difficulty

Easy

## Topic

Array / Matrix

## Problem

Given a binary matrix `mat`, find the row that contains the maximum number of `1`s.

Return an array containing:

* The index of the row with the maximum number of `1`s.
* The number of `1`s in that row.

If multiple rows have the same number of `1`s, return the row with the smallest index.

### Example 1

**Input**

```text
mat = [[0,1],[1,1]]
```

**Output**

```text
[1,2]
```

### Example 2

**Input**

```text
mat = [[0,0,0],[0,1,1]]
```

**Output**

```text
[1,2]
```

## Constraints

* `1 <= mat.length, mat[i].length <= 100`
* `mat[i][j]` is either `0` or `1`.

---

## Approach

1. Initialize `row` to store the index of the row with the maximum number of `1`s.
2. Initialize `max` to store the maximum number of `1`s found so far.
3. Traverse each row of the matrix.
4. For every row, count the number of `1`s using a variable `count`.
5. If the current row has more `1`s than `max`, update `max` and `row`.
6. Since we only update when `count > max`, the smaller row index is automatically retained when two rows have the same number of `1`s.
7. Return `{row, max}`.

---

## Algorithm

1. Set `row = 0` and `max = 0`.
2. Traverse each row using `i`.
3. Set `count = 0` for the current row.
4. Traverse all elements in the current row.
5. If an element is `1`, increment `count`.
6. After processing the row:

   * If `count > max`, update `max = count` and `row = i`.
7. Return the row index and maximum count.

---

## Time Complexity

**O(m × n)**

* Every element of the matrix is visited once.

## Space Complexity

**O(1)**

* Only a few variables are used apart from the returned array.
