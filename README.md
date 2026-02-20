# BridgeLabz-Training
## 📅 Week 6 – Day 1- Java 8 Features & Lambda Expressions  

### 📝 Topics Covered

- Introduced **Java 8 features** and how they simplify code while improving readability and performance.
- Learned **Lambda Expressions** to write concise implementations of functional interfaces.
- Explored **Functional Interfaces** such as `Predicate`, `Function`, `Consumer`, and `Supplier`.
- Used **Java Streams API** for declarative data processing: filtering, mapping, sorting, and aggregation.
- Applied **method references** (`Class::method`) as a cleaner alternative to lambdas where applicable.
- Understood **default and static methods in interfaces** and their role in backward compatibility.
- Practiced **Optional** to avoid `NullPointerException` and write safer null-handling logic.
- Explored **forEach, map, filter, reduce, collect** operations on collections.
- Compared **imperative vs functional programming** styles using real examples.

🔗 **Code:**  
👉 [Day 1- Java 8 Features & Lambda Expressions](https://github.com/Ananya-Shukla99/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)

---
## 📅 Week 6 - Day 2 – Functional Interfaces in Java  

### 📝 Topics Covered

- Understood the concept of **Functional Interfaces** and their role in enabling lambda expressions.
- Learned the purpose of the `@FunctionalInterface` annotation and its compile-time safety benefits.
- Explored **built-in functional interfaces** from `java.util.function`:
  - `Predicate<T>` for boolean conditions
  - `Function<T, R>` for data transformation
  - `Consumer<T>` for performing actions
  - `Supplier<T>` for providing values
- Implemented **custom functional interfaces** for domain-specific operations.
- Practiced **lambda expressions vs anonymous classes** and identified when to use each.
- Learned **functional interface composition** using `andThen()`, `compose()`, `and()`, `or()`, and `negate()`.
- Used **method references** as a clean alternative to lambda expressions.
- Combined functional interfaces with **Streams API** for real-world data processing.

🔗 **Code:**  
👉 [Day 2 - Functional Interfaces](https://github.com/Ananya-Shukla99/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com)

---
## 📅  Week 6 - Day 3 – Streams API in Java 

### 📝 Topics Covered

Learned the fundamentals of the **Java Streams API** and how it enables functional-style data processing.
- Understood the difference between **Streams vs Collections** and when to use each.
- Explored **stream creation techniques** from collections, arrays, files, and generators.
- Practiced **intermediate operations** such as `filter()`, `map()`, `flatMap()`, `distinct()`, `sorted()`, and `limit()`.
- Implemented **terminal operations** like `forEach()`, `collect()`, `reduce()`, `count()`, `min()`, and `max()`.
- Used **Collectors** (`toList()`, `toSet()`, `toMap()`, `groupingBy()`, `partitioningBy()`, `joining()`).
- Learned **lazy evaluation** and how streams process data only when a terminal operation is invoked.
- Explored **parallel streams**, their performance benefits, and when to avoid them

🔗 **Code:**  
👉 [Day 3- Streams API in Java]

---
## 📅 Week 6 - Day 4  – Collectors in Java 8
**(Date: 29-Jan-2026)**

### 📝 Topics Covered

- **Purpose of Collectors**  
  Collectors in Java 8 are utility methods used with `Stream.collect()` to transform, aggregate, and summarize data efficiently.

- **Data Transformation & Aggregation**  
  They convert streams into collections or values using methods like `toList()`, `toSet()`, `toMap()`, and `joining()`.

- **Grouping & Partitioning Data**  
  `groupingBy()` classifies elements into groups, while `partitioningBy()` splits data into two categories based on a predicate.

- **Statistical Operations**  
  Collectors such as `summarizingInt()` provide statistics like count, sum, min, max, and average in a single operation.

- **Clean & Readable Stream Pipelines**  
  Collectors offer ready-made reductions that make stream-based code concise, readable, and maintainable.

🔗 **Code:**  
👉 [Day 4 - Collectors in Java 8]

---

## 📅 Week 6 - Day 5 – Smart City Transport & Service Management System

### 📝 Topics Covered

Designed and implemented a **Smart City Transport & Service Management System** using modern **Java 8 features** to handle real-time transport data, scheduling, and analytics.

- Applied **Lambda Expressions** to filter and sort transport services based on user preferences such as lowest fare and earliest departure time.
- Used **Method References** for clean printing of service details, logging, and invoking utility methods.
- Implemented **Default Methods in Interfaces** to provide common behavior (`printServiceDetails()`) across all transport services.
- Utilized **Static Methods in Interfaces** (`calculateDistance()`) for computing distances between locations.
- Leveraged the **Streams API** to process transport and passenger data efficiently.
- Used `forEach()` to dynamically display live transport schedules on the dashboard.
- Applied **Collectors**:
  - `groupingBy()` to group passengers by route.
  - `partitioningBy()` to classify peak vs non-peak trips.
  - `summarizingDouble()` to calculate total, average, and maximum fare collection.
- Defined and implemented **Interfaces** (`TransportService`) for extensible transport types.
- Implemented **Functional Interfaces** (`FareCalculator`) using lambda expressions.
- Used **Marker Interfaces** (`EmergencyService`) to detect and prioritize emergency transport services.
- Designed the system to be **easily extensible**, allowing new services like Ferry or Bike Rentals to be added with minimal changes.

🔗 **Submission:**  
👉 [Smart City Transport & Service Management System](https://github.com/Ananya-Shukla99/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com/smartcitytransport)

### 📅 Week 6 - Day 6 - Java Stream API – Real-Time Scenario Based Questions  

● Practiced real-world data processing using **Java 8 Stream API**.  
● Applied functional programming concepts like filtering, mapping, sorting, grouping, and aggregation.

● Basic Filtering & Mapping – Filtered students by rank, age, city, department and extracted names.  
● Sorting & Limiting – Sorted students by rank, age, and name with top/bottom results.  
● Grouping & Aggregation – Grouped students by department, city, gender and calculated counts & averages.  
● Min / Max Operations – Found best/worst ranks, youngest/oldest students.  
● FlatMap Operations – Processed multiple contact numbers and extracted unique values.  
● Conditional Matching – Used anyMatch, allMatch, noneMatch for validation scenarios.  
● Gender-Based Analysis – Analyzed age, count, and ranking based on gender.  
● Department-Specific Queries – Filtered and ranked students within departments.  
● Advanced Stream Operations – Converted collections to Maps and applied custom filters.  
● Bonus Challenges – Partitioning, top-N results, and maximum/minimum grouping logic.

🔗 **Submission:**  
👉 [Java Stream API Real-Time Problems](https://github.com/Ananya-Shukla99/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenario-based-codebase/Java8ScenarioBased/src/com/employeemanager)

---

✨ More updates coming as I continue my Java journey...
