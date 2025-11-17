
# Java Access Modifiers – Quick Notes

## 🔹 What are Access Modifiers?

Access Modifiers in Java are **keywords that define the visibility and accessibility** of classes, methods, constructors, and variables.

---

## 🔹 Types of Access Specifiers

### **1. `public`**

* Accessible from **anywhere** (same class, same package, outside package, subclass).
* Only modifier allowed for making a class accessible across packages.

### **2. `protected`**

* Accessible in:

  * Same class
  * Same package
  * **Subclasses outside the package (via inheritance)**
* Not accessible outside the package without inheritance.

### **3. Default (Package-Private)**

* No keyword used.
* Accessible **only within the same package**.
* Not visible outside the package.

### **4. `private`**

* Accessible **only within the same class**.
* Not accessible in subclasses or any other class.

---

## 🔹 Visibility Hierarchy (Most → Least)

```
public → protected → default → private
```

---

## 🔹 Class-Level Access Rules

* **Only `public` or default** is allowed for top-level classes.
* `private` and `protected` cannot be used for class declarations.

---


## 🔹 Important Interview Notes

* ✔ Protected works across packages **only through inheritance**.
* ✔ Default = package-private (no keyword).
* ✔ Private = only within class → not inherited.
* ✔ Public = accessible everywhere.
* ✔ Top-level classes can only be **public** or **default**.
* ✔ Access modifiers are key for **encapsulation and data hiding**.

---
