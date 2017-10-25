## NQueen Problem
This code helps you to understand the occurance of a word in a given matrix using backtracking.


### Code Requirements
The example code is in Java ([version 1.8](https://java.com/en/download/) or higher will work). 

### Description
Backtracking is a general algorithm for finding all (or some) solutions to some computational problems, notably constraint satisfaction problems, that incrementally builds candidates to the solutions, and abandons each partial candidate ("backtracks") as soon as it determines that the candidate cannot possibly be completed to a valid solution.

Given a 2D matrix of char­ac­ters. Check whether the word exist in the matrix or not. If it exists then print its path. All move­ments are allowed (right, left, up, down and diagonally).

For more information, [see](http://algorithms.tutorialhorizon.com/backtracking-search-a-word-in-a-matrix/)

<img src="https://github.com/akshaybahadur21/StringRecognitionUsingBacktracking/blob/master/matrix.png">


```java

 if(solveMaze(a,sol,x+1,y,str,n,l,count)==1)
				 return 1;
			 if(solveMaze(a,sol,x,y+1,str,n,l,count)==1)
				 return 1;
			  if(solveMaze(a,sol,x-1,y,str,n,l,count)==1)
				 return 1;
			  if(solveMaze(a,sol,x,y-1,str,n,l,count)==1)
				 return 1;
			 sol[x][y]='\0';//backtracking
			 return -1;
			 

``` 

### Execution
To compile the code, simply run the `javac BackTrack.java`.
To run the code, type `java BackTrack`

```
javac BackTrack.java
java BackTrack
```
