# Theoretical Background
## Big O Notation and Algorithm Analysis
Big O notation is a mathematical representation of how an algorithm's runtime or space requirements grow as the input size (n) increases. It provides an upper bound on complexity, focusing on the worst-case scenario while ignoring constant factors and lower-order terms.

## Why it matters for e-commerce search:

Helps predict performance at scale (100 vs 1,000,000 products)

Allows comparison of different algorithms objectively

Guides decisions about which algorithm to implement

Identifies potential performance bottlenecks before they occur

## Search Operation Scenarios
### 1. Linear Search Characteristics:


Best Case:    O(1)  - Target product is the first item checked
Average Case: O(n)  - Target is found after checking half the items (n/2 comparisons)
Worst Case:   O(n)  - Target is last item or not present (full array traversal)

### 2. Binary Search Characteristics:


Best Case:    O(1)  - Target is exactly at the middle position
Average Case: O(log n) - Typical case with halving search space each iteration
Worst Case:   O(log n) - Maximum number of divisions needed

### Time Complexity Comparison
Factor	Linear Search	Binary Search
Preprocessing	None	Requires O(n log n) sorting
Small datasets	Fast	Slightly slower due to sort overhead
Large datasets	Slow	Extremely fast
Dynamic data	Handles changes well	Requires re-sorting after changes
Implementation	Simple	More complex


> ✅ **Linear search** is ideal for small/unsorted data  
> ✅ **Binary search** is much faster but **requires sorting**

## Platform-Specific Recommendations
### When to use Linear Search:

Product catalog changes frequently (daily/hourly)

Small inventory (<1000 items)

Searching by non-ordered attributes (e.g., product name)

When simplicity is prioritized over speed

When to use Binary Search:

Large, relatively static product catalogs

Frequent searches on the same dataset

When products have unique, sortable IDs

For price range searches (when sorted by price)

Production-grade solutions:

Hybrid Approach: Use linear for small subsets, binary for large ones

Hash Tables: O(1) lookup for exact ID matches

Search Trees: Balanced BSTs for dynamic data with O(log n) operations

Database Indexing: Let the DBMS handle optimization

Caching: Store frequent search results

##  How to Compile and Run

```bash
javac SearchFunction.java
java SearchFunction