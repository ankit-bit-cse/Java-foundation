# Day 3 — Loops in Java

Loops ka use tab hota hai jab hume kisi code ko **baar-baar repeat** karna ho.

For example, agar hume `1` se `100` tak numbers print karne hain, to 100 baar `System.out.println()` likhne ke bajay loop use karenge.

---

## 📚 Topics Covered

* `for` loop
* `while` loop
* `do-while` loop
* Nested loops
* `break`
* `continue`
* Multiplication tables
* Sum of numbers
* Factorial
* Prime number checking
* Pattern printing

---

# 1. What is a Loop?

Loop ek programming structure hai jo kisi code ko repeatedly execute karta hai jab tak ek condition true hoti hai.

### Without Loop

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

### With Loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Loop se code **short, clean aur efficient** hota hai.

---

# 2. `for` Loop

`for` loop tab useful hai jab hume pata ho ki loop ko approximately kitni baar chalana hai.

### Syntax

```java
for (initialization; condition; update) {
    // code
}
```

### Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Execution

```text
int i = 1
   ↓
i <= 5 ? → Yes
   ↓
print i
   ↓
i++
   ↓
i <= 5 ?
```

Jab condition `false` ho jaati hai, loop stop ho jata hai.

---

# 3. Important Parts of `for` Loop

```java
for (int i = 1; i <= 10; i++)
```

### Initialization

```java
int i = 1
```

Loop variable ki starting value set karta hai.

### Condition

```java
i <= 10
```

Jab tak condition `true` hai, loop chalega.

### Update

```java
i++
```

Har iteration ke baad `i` ki value increase karega.

---

# 4. Increment and Decrement

### Increment

```java
i++;
```

Same as:

```java
i = i + 1;
```

### Decrement

```java
i--;
```

Same as:

```java
i = i - 1;
```

### Other Examples

```java
i += 2;
```

Means:

```java
i = i + 2;
```

```java
i *= 2;
```

Means:

```java
i = i * 2;
```

---

# 5. Print Even Numbers

```java
for (int i = 1; i <= 20; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
```

`%` ko **modulus operator** kehte hain.

It gives the remainder.

```text
10 % 2 = 0
11 % 2 = 1
```

Agar:

```java
number % 2 == 0
```

to number even hai.

---

# 6. `while` Loop

`while` loop tab useful hota hai jab hume exact number of iterations pehle se pata nahi ho.

### Syntax

```java
while (condition) {
    // code
}
```

### Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Important

`while` loop me update karna mat bhoolna.

Wrong:

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}
```

Ye **infinite loop** ban jayega kyunki `i` kabhi change nahi ho raha.

---

# 7. `do-while` Loop

`do-while` loop me code **kam se kam ek baar** execute hota hi hai.

### Syntax

```java
do {
    // code
} while (condition);
```

### Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Main Difference

`while`:

```java
condition check
↓
code execute
```

`do-while`:

```java
code execute
↓
condition check
```

Isliye `do-while` minimum **one time** execute hota hai.

---

# 8. Nested Loops

Ek loop ke andar doosra loop = **Nested Loop**

Example:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {
        System.out.println(i + " " + j);
    }
}
```

Nested loops ka use mostly:

* Patterns
* Tables
* 2D arrays
* Matrix
* Grid problems

me hota hai.

---

# 9. `break`

`break` loop ko immediately stop kar deta hai.

Example:

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

Jab `i == 5` hua, loop terminate ho gaya.

---

# 10. `continue`

`continue` current iteration ko skip karta hai.

Example:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

`3` skip ho gaya.

### Difference

```text
break     → complete loop stop
continue  → current iteration skip
```

---

# 11. Multiplication Table

Example: 5 ka table

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(5 * i);
}
```

Better formatted version:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

Output:

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

# 12. Sum of Numbers

`1` se `10` tak sum:

```java
int sum = 0;

for (int i = 1; i <= 10; i++) {
    sum = sum + i;
}

System.out.println(sum);
```

Output:

```text
55
```

### Important Concept: Accumulator

`sum` ko **accumulator** kehte hain.

Accumulator ek variable hota hai jo repeatedly values ko collect/store karta hai.

Example:

```text
sum = 0
sum = 0 + 1  → 1
sum = 1 + 2  → 3
sum = 3 + 3  → 6
...
```

---

# 13. Factorial

Factorial of `5`:

```text
5! = 5 × 4 × 3 × 2 × 1
   = 120
```

Java:

```java
int n = 5;
int factorial = 1;

for (int i = 1; i <= n; i++) {
    factorial = factorial * i;
}

System.out.println(factorial);
```

Output:

```text
120
```

---

# 14. Prime Number

Prime number wo number hota hai jo sirf:

```text
1
```

aur

```text
itself
```

se divide hota hai.

Examples:

```text
2, 3, 5, 7, 11, 13...
```

### Prime Checker

```java
int n = 17;
boolean isPrime = true;

if (n <= 1) {
    isPrime = false;
}

for (int i = 2; i < n; i++) {

    if (n % i == 0) {
        isPrime = false;
        break;
    }
}

if (isPrime) {
    System.out.println("Prime");
} else {
    System.out.println("Not Prime");
}
```

### Important Concepts

Is example me:

* `boolean`
* `if`
* `for`
* `%`
* `break`

sab combine hue.

---

# 15. Pattern Printing

Nested loops ka common use pattern printing hai.

### Pattern

```text
*
**
***
****
*****
```

Code:

```java
for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

### Important

`print()`:

```java
System.out.print("*");
```

same line par print karta hai.

`println()`:

```java
System.out.println();
```

next line par le jata hai.

---

# 16. Day 3 Important Terms

| Term           | Meaning                               |
| -------------- | ------------------------------------- |
| Loop           | Code ko repeatedly execute karna      |
| Iteration      | Loop ka ek execution                  |
| Initialization | Starting value set karna              |
| Condition      | Decide karta hai loop chalega ya nahi |
| Update         | Loop variable ko change karna         |
| Increment      | Value increase karna                  |
| Decrement      | Value decrease karna                  |
| Modulus `%`    | Remainder find karna                  |
| Accumulator    | Values ko continuously collect karna  |
| Nested Loop    | Loop ke andar loop                    |
| Infinite Loop  | Aisa loop jo stop nahi hota           |
| `break`        | Complete loop stop                    |
| `continue`     | Current iteration skip                |

---

# 🧠 Day 3 Quick Revision

### `for`

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

Use when iterations are mostly known.

### `while`

```java
while (condition) {
    // code
}
```

Use when condition-based repetition is more important.

### `do-while`

```java
do {
    // code
} while (condition);
```

Runs at least once.

### `break`

```java
break;
```

Loop completely stop.

### `continue`

```java
continue;
```

Current iteration skip.

---

# 📝 Practice Questions

## Beginner

1. Print numbers from `1` to `10`.
2. Print numbers from `10` to `1`.
3. Print all even numbers from `1` to `50`.
4. Print all odd numbers from `1` to `50`.
5. Print the multiplication table of `7`.
6. Print numbers from `1` to `100` using a `while` loop.
7. Find the sum of numbers from `1` to `100`.

## Intermediate

8. Find the factorial of a number.
9. Check whether a number is prime.
10. Count the digits of a number.
11. Reverse a number.
12. Find the sum of digits of a number.
13. Print all prime numbers from `1` to `100`.
14. Use `break` to stop a loop when the number reaches `50`.
15. Use `continue` to skip all even numbers.

## Pattern Practice

16. Print:

```text
*
**
***
****
*****
```

17. Print:

```text
*****
****
***
**
*
```

18. Print:

```text
1
12
123
1234
12345
```

19. Print:

```text
1
22
333
4444
55555
```

---

# 🎯 Day 3 Takeaway

Day 3 ka main goal hai **repetition ko control karna**.

Ab tak:

```text
Day 1 → Data handle karna
        Variables, Data Types, Operators, Input

Day 2 → Decision lena
        if, else, comparisons, logical operators

Day 3 → Repetition karna
        for, while, do-while, break, continue
```

Ab tum Java me basic programs bana sakte ho jisme:

```text
Input
   ↓
Condition
   ↓
Loop
   ↓
Output
```

ye sab combine ho sakta hai.
