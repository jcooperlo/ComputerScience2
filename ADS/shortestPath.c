#include <stdio.h>

void main(void)
{
	int MAX_INT = 100;             //creates the max integer for the chart    ASK CAIN
	int listInt = 0;               //int used to iterate through the list
	int chartInt = 0;              //int used to find the position on the three column chart
	int rows = 0;                  //int used to iterate through the rows of the adjMatrix
	int cols = 0;		       //int used to iterate through the columns of the adjMatrix
	int trueChecker;	       //int used to find if a certain letter has already been visited
	int costVariable = MAX_INT;    //int used help find the total cost of a trip between nodes
	int prevInt = 0;	       //int used to store the previously visited node
	int finalCost;		       //int used at the end to show the final cost
	char finalChar;		       //int used at the end to show the character in the final chart 
	char finalLetter;	       //int used at the end ot show the final letter visited

	//double array used as an adjacency matrix that stores the distance between nodes
	int adjMatrix[5][5] = {
		{0, 6, 0, 1, 0},
		{6, 0, 5, 2, 2},
		{0, 5, 0, 0, 5},
		{1, 2, 0, 0, 1},
		{0, 2, 5, 1, 0}
	};

	//single array used to the cost between nodes
	int costChart[5]; 
	costChart[0] = 0;
	costChart[1] = MAX_INT;
	costChart[2] = MAX_INT;
	costChart[3] = MAX_INT;
	costChart[4] = MAX_INT;	

	//single array used at the end to show the letters for the final chart
	char letterChart[5];
	letterChart[0] = 'a';
	letterChart[1] = 'b';
	letterChart[2] = 'c';
	letterChart[3] = 'd';
	letterChart[4] = 'e';

	//single array used to store values as '1' or '0' to show 'true' or 'false' meaning 'visited' and 'not visited'
	int booleanChart[5];
	booleanChart[0] = 0;
	booleanChart[1] = 0;
	booleanChart[2] = 0;
	booleanChart[3] = 0;
	booleanChart[4] = 0;

	//single array used to store the previous node visited
	char prevChart[5];
	prevChart[0] = '-';			
	prevChart[1] = '-';			
	prevChart[2] = '-';			
	prevChart[3] = '-';			
	prevChart[4] = '-';			

	//for loop used to go thorugh the entire adjMatrix
	int a;
	for(a = 0; a < 25; a++)
	{	
		//if statement that checks if the distance traveled is 0
		if(adjMatrix[rows][cols] != 0)
		{
			//if statement used to check if the node has already been visited
			if(booleanChart[chartInt] != 1)
			{
				//if statement used to check if the current distance is less than the current distance in the adjMatrix
				if(adjMatrix[rows][cols] + costChart[prevInt] < costChart[chartInt])
				{
					//if and if else statements used to assign letters to the prevChart array based on the row it is in
					if(rows == 0)
					{
						prevChart[chartInt] = 'a';
					}//IF
					else if(rows == 1)
					{
						prevChart[chartInt] = 'b';
					}//ELSEIF
					else if(rows == 2)
					{
						prevChart[chartInt] = 'c';
					}//ELSEIF
					else if(rows == 3)
					{
						prevChart[chartInt] = 'd';
					}//ELSEIF
					else if(rows == 4)
					{
						prevChart[chartInt] = 'e';
					}//ELSEIF

					//assigns the current # in the adjMatrix to the costChart
					costChart[chartInt] = adjMatrix[rows][cols];

					//if and else if statements that find the previously node and adds up the total distance
					if(prevChart[chartInt] == 'a')
					{
						costChart[chartInt] += costChart[0];
					}//IF
					else if(prevChart[chartInt] == 'b')
					{
						costChart[chartInt] += costChart[1];
					}//ELSEIF
					else if(prevChart[chartInt] == 'c')
					{
						costChart[chartInt] += costChart[2];
					}//ELSEIF
					else if(prevChart[chartInt] == 'd')
					{
						costChart[chartInt] += costChart[3];
					}//ELSEIF
					else if(prevChart[chartInt] == 'e')
					{
						costChart[chartInt] += costChart[4];
					}//ELSEIF

					//runs if the cost to travel is still MAX_INT
					else
					{
						if(cols == 0)
						{
							costChart[chartInt] = costChart[0];
						}//IF
						else if(cols == 1)
						{
							costChart[chartInt] = costChart[1];
						}//ELSEIF
						else if(cols == 2)
						{
							costChart[chartInt] = costChart[2];
						}//ELSEIF
						else if(cols == 3)
						{
							costChart[chartInt] = costChart[3];
						}//ELSEIF
						else if(cols == 4)
						{
							costChart[chartInt] = costChart[4];
						}//ELSEIF
					}//ELSE
				}//IF
			}//IF					
		}//IF

		//increases cols and chartInt to continue to the next place in the chart
		//and sets the prevInt to the current row
		cols++;
		chartInt++;
		prevInt = rows;

		//if statement that runs when the end of the column is reached
		if(cols == 5)
		{
			//set the current row as visited and resets trueChecker for another iteration
			booleanChart[rows] = 1;
			trueChecker = 0;
			
			//for and if statement that checks for visited nodes
			int b;
			for(b = 0; b < 5; b++)
			{
				if(booleanChart[b] == 1)
				{
					trueChecker++;
				}//IF
			}//FOR

			//if statement that runs if there are still unvisited nodes
			if(trueChecker != 5)
			{
				int c;
				for(c = 0; c < 5; c++)
				{
					if(booleanChart[c] == 0 && (costChart[c] < costVariable))
					{
						costVariable = costChart[c];
						rows = c;
					}//IF
				}//FOR
			}//IF
			

			//resets costVariable, chartInt, and cols to iterate through the chart again
			costVariable = MAX_INT;
			chartInt = 0;
			cols = 0;

		}//IF		
	}//FOR
	
	//prints the final chart
	int d;
	for(d = 0; d < 5; d++)
	{
		finalChar = letterChart[d];
		finalCost = costChart[d];
		finalLetter = prevChart[d];

		printf("%c", finalChar);
		printf(": ");
		printf("%d", finalCost);
		printf(" %c\n", finalLetter);
	}//FOR
}//MAIN
