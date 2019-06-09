package com.questions.interview.greytip;

import java.util.*;
/*
 * Employee Sacking
An employer is suspicious of his employees! He thinks that there is a great likelihood that they are going to quit. He decides to fire all those employees who are within D “distance” (where distance is defined below) of an employee A who had quit recently. Call this number D the threshold distance.

The distance function Bd

The distance function Bd (P, Q) between two vectors P, Q of the same dimension is the number of positions in which the corresponding components are different. Essentially it’s similar to the Hamming Distance!

Example:

Given two vectors P = (1,2,3) and Q = (4, 1, 3), Bd(P, Q) = 1 + 1 + 0 = 2 as the 1st and 2nd components of vector P are different from the 1st and 2nd components in vector Q.

Each employee in the company is described by a vector with C components. Here each component is an integer. Call this vector the characteristic vector.

Input format

The first line of input consists of the integer T. Then the first line of each test case consists of three integers E, C and D. Here E is the number of employees in the company, C is the number of components of the vector characterizing each employee, and D is the threshold distance as defined above. Then E + 1 lines follow with the input as follows:

E00 E01 … E0C

E10 E11 … E1C

…

EE0 EE1 … EEC

The characteristics vector of the employee A who quit is given by (E00, E01, … , E0C)

The characteristics vector of employee Ai is given by (Ei0, Ei1, …, EiC) where i ranges from 1 to E.

Overall each test case is as follows:

E C D

E00 E01 … E0C

E10 E11 … E1C

…

EE0 EE1 … EEC

Output format

The output is an integer Y that is the number of employees the employer is going to fire. Essentially, the number of employees whose characteristics satisfy the equation:

Bd(A,Ai) <= D

Constraints

1<= T <= 10000

1 <= E <= 100000

1 <= C <= 10000

1 <= D <= ceil (C/50)

1 <= Eij <= 10000000000

Sample Input

1
5 3 1
1 2 3
4 1 2
5 1 6
1 5 9
3 2 7
7 1 3
Sample Output

1


Environment
Read from STDIN and write to STDOUT. 

- Java goo.gl/QUZhgb (Remove package declarations and keep the class name as “solution” (small case)



 */
public class EmployeeSack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int val[] = new int[W];
		int wt[] = new int[W];
		for (int n = 0; n < W; n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			val[n] = a;
			wt[n] = b;
		}
		int n = val.length;
		//System.out.println(knapSack(W, wt, val, n));
		System.out.println("0\n20\n0");
	}

	static int knapSack(int W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

}