# ☕ Java — Day 2

## 📚 Topics Covered

* Arithmetic Operators
* Assignment Operators
* Increment & Decrement Operators
* Comparison Operators
* Logical Operators
* Taking input using `Scanner`
* Basic calculations with user input

---

## 1. Arithmetic Operators

Arithmetic operators ka use mathematical calculations ke liye hota hai.

| Operator | Meaning        | Example  |
| -------- | -------------- | -------- |
| `+`      | Addition       | `10 + 5` |
| `-`      | Subtraction    | `10 - 5` |
| `*`      | Multiplication | `10 * 5` |
| `/`      | Division       | `10 / 5` |
| `%`      | Remainder      | `10 % 3` |

### Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
13
7
30
3
1
```

### `%` Remainder Operator

```java
10 % 3 = 1
```

Because:

```text
10 ÷ 3 = 3 remainder 1
```

---

## 2. Scanner + Arithmetic Operators

User se numbers input lekar calculation kar sakte hain.

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
```

### Example

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

---

## 3. Assignment Operators

Assignment operator ka use value assign karne ke liye hota hai.

```java
int x = 10;
```

Common assignment operators:

```text
=    +=    -=    *=    /=    %=
```

### Example

```java
int x = 10;

x += 5;

System.out.println(x);
```

Output:

```text
15
```

`x += 5` is equivalent to:

```java
x = x + 5;
```

---

## 4. Increment and Decrement

### Increment `++`

Value ko 1 se increase karta hai.

```java
int x = 10;

x++;

System.out.println(x);
```

Output:

```text
11
```

### Decrement `--`

Value ko 1 se decrease karta hai.

```java
int x = 10;

x--;

System.out.println(x);
```

Output:

```text
9
```

---

## 5. Comparison Operators

Comparison operators do values ko compare karte hain.

Result hamesha:

```text
true
```

ya

```text
false
```

hota hai.

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

### Example

```java
int a = 10;
int b = 20;

System.out.println(a > b);
System.out.println(a < b);
System.out.println(a == b);
```

Output:

```text
false
true
false
```

### `=` vs `==`

```java
int x = 10;
```

`=` → assignment

```java
x == 10
```

`==` → comparison

---

## 6. Logical Operators

Logical operators multiple conditions ko combine karne ke liye use hote hain.

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

### AND `&&`

Dono conditions true honi chahiye.

```java
int age = 20;

System.out.println(age >= 18 && age <= 60);
```

Output:

```text
true
```

### OR `||`

At least one condition true honi chahiye.

```java
int age = 20;

System.out.println(age < 18 || age > 60);
```

Output:

```text
false
```

### NOT `!`

True ko false aur false ko true karta hai.

```java
int age = 20;

System.out.println(!(age > 18));
```

Output:

```text
false
```

---

# 📝 Practice Questions

### Q1. Addition

User se 2 numbers input lo aur unka sum print karo.

### Q2. Remainder

User se 2 numbers input lo aur remainder print karo.

### Q3. Division & Remainder

Output find karo:

```java
int a = 10;
int b = 3;

System.out.println(a / b);
System.out.println(a % b);
```

### Q4. Increment

Output find karo:

```java
int x = 5;

x++;
x++;

System.out.println(x);
```

### Q5. Assignment vs Comparison

Explain the difference between:

```java
=
```

and

```java
==
```

---

# 🧠 Day 2 Quick Revision

```text
Arithmetic
+  -  *  /  %

Assignment
=  +=  -=  *=  /=  %=

Increment / Decrement
++  --

Comparison
==  !=  >  <  >=  <=

Logical
&&  ||  !
```

## ⭐ Most Important

Remember:

```text
=   → Assign
==  → Compare
%   → Remainder
++  → Increase by 1
--  → Decrease by 1
&&  → AND
||  → OR
!   → NOT
```

---

## 🚀 Next: Day 3

In Day 3, we will learn:

* `if`
* `if-else`
* `else-if`
* Nested `if`
* Conditions with `Scanner`
* Real-world decision-making programs
