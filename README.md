# N-Queen-Problem
N-Queens Solver in Java
Overview
This project implements the N-Queens problem using backtracking in Java. The program allows users to input the board size (N) and finds a valid arrangement of N queens on an N×N chessboard, ensuring that no two queens attack each other. If a solution exists, it prints the board; otherwise, it notifies the user.

How It Works
The user provides input for N, the size of the chessboard.

The program uses a recursive backtracking algorithm to place queens row by row.

It checks whether a queen can be safely placed at a given position.

If a valid arrangement is found, the solution is printed. Otherwise, the program indicates that no solution exists.

Technologies Used
Java

Backtracking Algorithm

Scanner for user input
 #for example 
Enter the value of N: 4
N-Queens Solution for N = 4:
 .  Q  .  . 
 .  .  .  Q 
 Q  .  .  . 
 .  .  Q  . 
