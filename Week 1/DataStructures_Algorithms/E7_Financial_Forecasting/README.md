#  Week1 : Exercise 7: Financial Forecasting

##  Description

We developed a **financial forecasting tool** that predicts future values based on past data using **recursion**.

This tool calculates compound growth based on a fixed historical growth rate over a number of years.

---

##  What We Learned

###  Recursive Algorithms

- **Recursion** is a programming technique where a function calls itself to solve a smaller version of the same problem.
- It’s useful when the result of a step depends on the result of the previous one.
- In this exercise, we use recursion to calculate future value:  
  `futureValue(n) = futureValue(n - 1) * (1 + rate)`

---

## Implementation Steps

1. **Input Handling**
   - Takes user input for:
     - Initial investment
     - Annual growth rate (%)
     - Forecast duration (years)
   - Validates all inputs (no negative or non-numeric values allowed)

2. **Recursive Calculation**
   - The program uses a recursive method to calculate compound interest based on the growth rate and years.

3. **Output**
   - Displays a formatted summary including the initial amount, rate, years, and forecasted future value.


---

##  Time & Space Complexity

### Time Complexity: **O(n)**  
- The function makes `n` recursive calls (1 for each year).
- There is no branching or repeated subproblems.

### Space Complexity: **O(n)**  
- Each recursive call adds a new frame to the call stack, using linear space.

---

## Optimization

While the recursive approach is acceptable for small inputs, it can be **optimized**:

### For financial forecasting, the iterative approach is generally preferred because:

1.It has the same time complexity but better constant factors

2.Uses constant space (O(1) instead of O(n))

3.No risk of stack overflow

4.Easier to understand and maintain for this particular problem

