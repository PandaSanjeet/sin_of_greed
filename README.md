# sin_of_greed

### Problem Statement

Ganga is at a food festival. There are N shops located in a row. Shop at position i has xᵢ amount of chocolates. Ganga can move from shop 1 to N in only one direction.

At any shop, Ganga may decide to steal all the chocolates from the shop. However once she steals from shop i, the next two shops (i+1 and i+2) are alerted, and Ganga has to skip those.

Find the maximum number of chocolates Ganga can steal from the food festival.

### Input Format

- The first line contains the number of shops N.
- The next N lines contain the amount of chocolates in shop i.

### Constraints

- 0 ≤ N ≤ 10⁵
- 0 ≤ xᵢ ≤ 10⁴
  
### Output Format

Single line containing a integer denoting max number of chocolates stealable.

### Sample Input 0

```
4
3
2
5
3
```

### Sample Output 0

```
6
```

### Explanation 0

Ganga can steal from shop 1, then skip 2 and 3 and then steal from shop 4 which would give 6 as the max amount of chocolates that can be stolen.

### Sample Input 1

```
3
5
6
1
```

### Sample Output 1

```
6
```

### Explanation 1

If Ganga choses shop 1, she has to skip 2 and 3.

The optimum choice will be to steal from shop 2 and get 6 chocolates
