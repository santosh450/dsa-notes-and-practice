## Mid Index Calculation (Java)

- `left + (right - left) / 2` ✅ safe & recommended
- `(left + right) / 2` ❌ may overflow
- `(left + right) >>> 1` ❌ overflow still happens (addition first)

📌 Always use `left + (right - left) / 2` (Binary Search, Merge Sort).
