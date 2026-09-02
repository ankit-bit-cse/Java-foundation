# Day 4 — Arrays & Strings Practice

## 🎯 Goal

Day 4 ka main goal:

* Arrays ko access karna
* Array indexing samajhna
* Single `for` loop use karna
* `array.length` use karna
* Array elements par conditions lagana
* `sum` aur `count` jaise variables use karna
* Strings ke characters ko `charAt()` se access karna
* Basic String operations practice karna

> **Note:** Abhi 2D Arrays aur User Input practice nahi karni hai.

---

# 🟢 Array Practice

## Q1. Print All Elements

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Task

Single `for` loop use karke saare elements print karo.

### Expected Output

```text
10
20
30
40
50
```

---

## Q2. Print Elements with Index

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Task

Single `for` loop use karke index aur value print karo.

### Expected Output

```text
Index 0 = 10
Index 1 = 20
Index 2 = 30
Index 3 = 40
Index 4 = 50
```

### Hint

`i` aur `numbers[i]` dono use honge.

---

## Q3. Print Even Numbers

Given:

```java
int[] numbers = {12, 7, 4, 9, 20, 15, 8};
```

### Task

Single `for` loop aur `if` use karke sirf even numbers print karo.

### Expected Output

```text
12
4
20
8
```

---

## Q4. Calculate Sum

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Task

Single `for` loop use karke array ke saare elements ka sum calculate karo.

### Expected Output

```text
150
```

### Hint

```java
int sum = 0;
```

Loop ke andar `sum` ko update karo.

---

## Q5. Find Maximum Number

Given:

```java
int[] numbers = {25, 10, 75, 40, 60};
```

### Task

Single `for` loop use karke maximum number find karo.

### Expected Output

```text
75
```

### Hint

Ek `max` variable rakho.

---

## Q6. Count Numbers Greater Than 20

Given:

```java
int[] numbers = {10, 25, 30, 15, 40, 18, 50};
```

### Task

Single `for` loop use karke count karo ki kitne numbers `20` se greater hain.

### Expected Output

```text
4
```

Numbers:

```text
25
30
40
50
```

### Hint

```java
int count = 0;
```

Condition true hone par `count` increase karo.

---

# 🟡 String Practice

## Q7. Print Each Character

Given:

```java
String name = "ANKIT";
```

### Task

Single `for` loop use karke har character ko alag line me print karo.

### Expected Output

```text
A
N
K
I
T
```

### Hint

```java
name.charAt(i)
```

---

## Q8. Count a Particular Character

Given:

```java
String name = "BANANA";
```

### Task

Single `for` loop use karke count karo ki `'A'` kitni baar aaya hai.

### Expected Output

```text
3
```

### Hint

```java
if (name.charAt(i) == 'A')
```

---

## Q9. Count Vowels

Given:

```java
String word = "PROGRAMMING";
```

### Task

Single `for` loop use karke count karo ki String me kitne vowels hain.

Vowels:

```text
a, e, i, o, u
```

### Expected Output

```text
3
```

### Hint

`charAt(i)` se character nikalo aur `if` condition se check karo.

---

# 🧠 Important Patterns

### Array Traversal

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### String Traversal

```java
for (int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}
```

### Counting

```java
int count = 0;

for (...) {
    if (condition) {
        count++;
    }
}
```

### Sum

```java
int sum = 0;

for (...) {
    sum = sum + value;
}
```

---

# 📌 Day 4 Terms

| Term           | Meaning                                     |
| -------------- | ------------------------------------------- |
| Array          | Same type ki multiple values ka collection  |
| Index          | Element ki position, starting from `0`      |
| `array.length` | Array me total elements                     |
| Traversal      | Array ke elements ko one-by-one visit karna |
| `charAt()`     | String ka character access karna            |
| String         | Text/data of characters                     |
| `count`        | Kisi cheez ki quantity track karna          |
| `sum`          | Values ka total                             |
| `max`          | Maximum value store karna                   |
| `min`          | Minimum value store karna                   |

---

# 🎯 Day 4 Practice Order

Solve in this order:

```text
Q1 → Basic Array Traversal
 ↓
Q2 → Index + Value
 ↓
Q3 → Loop + if
 ↓
Q4 → Loop + Accumulator
 ↓
Q5 → Loop + if + max
 ↓
Q6 → Loop + if + counter
 ↓
Q7 → String Traversal
 ↓
Q8 → String + Counter
 ↓
Q9 → String + Loop + Condition + Counter
```

## Main Focus

> **Har question me pehle loop ka structure khud likho.**

Array:

```java
for (int i = 0; i < numbers.length; i++) {

}
```

String:

```java
for (int i = 0; i < word.length(); i++) {

}
```

Phir socho ki loop ke andar **exactly kya kaam karna hai**.

**Day 4 ka target hard problems solve karna nahi hai. Target hai `for` loop ko naturally use karna seekhna.**
