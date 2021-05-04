

/**
 * Play a game of tic tac toe with the program.
 *
 * @author (Sienna)
 * @version (1.0)
 */

import java.util.Scanner;

public class TicTacToe
{
    static void clear()
    {
        System.out.print('\u000C');
    }
    
    static void tutorial(boolean tOrF)
    {
        if (tOrF)
        {
            System.out.println("Displaying: Tutorial");
            System.out.println(" ");
            System.out.println("The goal of Tic Tac Toe is to get three of your marks (horizontal,");
            System.out.println("vertical, or diagonal) in a row. You and the program will each be");
            System.out.println("assigned an \"X\" or an \"O\". X will always start the game. You and");
            System.out.println("the program will take turns filling in open spaces in an attempt to get");
            System.out.println("three of their marks in a row.");
            System.out.println("");
            System.out.println(" ");
            System.out.println("Good luck! Enjoy Memory Match!");
            System.out.println(" ");
        }
    }
    
    static void printBoard(String[][] lineUpDown, String[] lineCross, String[][] gridWhole, String[][] coordinates, int p, String[][] symbolSpaces)
    {
        //for (int j = 1; j < 6; j++)
        //{
            //gridWhole[0][j] = coordinates[1][j];
        //}
        
        //for (int s = 1; s < 5; s++)
        //{
            //gridWhole[s][0] = coordinates[0][s];
        //}
        
        for (int x = 0; x < 3; x++)
        {
            for (int a = 0; a < 3; a++)
            {
                for (int b = 0; b < 19; b++)
                {
                    if (a == 2)
                    {
                        if (a==2)
                        {
                            p = 0;
                        }
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(symbolSpaces[p][l]);
                        }
                    }
                    else 
                    {
                        System.out.print(lineUpDown[a][b]);
                    }
                }
                System.out.println(" ");
            }
            
            if (x==2)
            {
                break;
            }
            
            System.out.println(lineCross[0]);
        }
    }
    
    static void detectWin()
    {
        
    }
    
    static void gridSpace(String userSpace, int idk)
    {
        if (userSpace.equals("A1") || userSpace.equals("a1"))
        {
            
        }
        else if (userSpace.equals("A2") || userSpace.equals("a2"))
        {
            
        }
        else if (userSpace.equals("A3") || userSpace.equals("a3"))
        {
            
        }
        else if (userSpace.equals("B1") || userSpace.equals("b1"))
        {
            
        }
        else if (userSpace.equals("B2") || userSpace.equals("b2"))
        {
            
        }
        else if (userSpace.equals("B3") || userSpace.equals("b3"))
        {
            
        }
        else if (userSpace.equals("C1") || userSpace.equals("c1"))
        {
            
        }
        else if (userSpace.equals("C2") || userSpace.equals("c2"))
        {
            
        }
        else if (userSpace.equals("C3") || userSpace.equals("c3"))
        {
            
        }
        else
        {
            idk = 1;
        }
    }
    
    static void userGuess()
    {
        
    }
    
    public static void main(String[] args)
    {
        boolean play = false;
        Scanner input = new Scanner(System.in);
        
        String[][] coordinates = {{"A", "B", "C"},{"1", "2", "3"}};
        String[][] lineUpDown = {{" ", " ", " ", " ", " "," ", " ", "|", " ", " ", " "," ", " ", " ", " ", "|", " ", " ", " "," ", " ", " ", " "},{" ", " ", " ", " "," ", " ", " ", "|", " "," ", " ", " ", " ", " ", " ", "|", " "," ", " ", " ", " ", " ", " "},{" ", " ", " "," ", " ", " ", " ", "|", " "," ", " ", " ", " ", " ", " ", "|"," ", " ", " ", " ", " ", " ", " "}};
        //insert x/o [2][4/13/20]
        String[][] symbolSpaces = {{"   ", "@", "   ", "|", "   ","@", "   ", "|", "   ","@", "   "},{" ", " ", " ", " "," ", " ", " ", "|", " "," ", " ", " ", " ", " ", " ", "|", " "," ", " ", " ", " ", " ", " "},{" ", " ", " "," ", " ", " ", " ", "|", " "," ", " ", " ", " ", " ", " ", "|"," ", " ", " ", " ", " ", " ", " "}};
        String[] lineCross = {"-------|-------|-------"};
        String[][] gridWhole = {{" ", " ", " "},{""}};
        
        do{
            String ynAnswer = " ";
            boolean tOrF = false;
            String ready;
            int p = 0;
            String userSpace;
            String programSpace;
            int idk = 0;
            
            //intro
            clear();
            
            System.out.println("Tic Tac Toe!");
            System.out.println(" ");
            System.out.println("Would you like a tutorial of how to play? (Type \"yes\" or \"no\")");
            ynAnswer = input.next();
            
            clear();
            if (ynAnswer.equals("yes") || ynAnswer.equals("Yes") || ynAnswer.equals("YES") || ynAnswer.equals("Y") || ynAnswer.equals("y"))
            {
                tOrF = true;
            }
            else if (ynAnswer.equals("no") || ynAnswer.equals("No") || ynAnswer.equals("NO") || ynAnswer.equals("N") || ynAnswer.equals("n"))
            {
                tOrF = false;
            }
            else
            {
                tOrF = true;
                System.out.println("Input not recognized; playing tutorial");
                System.out.println(" ");
            }
            
            tutorial(tOrF);
            
            System.out.println("Type anything when you are redy to continue.");
            ready = input.next();
            clear();
            
            printBoard(lineUpDown, lineCross, gridWhole, coordinates, p, symbolSpaces);
            
            System.out.println("What space would you like to occupy?");
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Vertical Coordinate (letter A, B, C): ");
            userSpace = input.next();
            
            System.out.println("Would you like to play again? (Type \"yes\" or \"no\")");
            ynAnswer = input.next();
            if (ynAnswer.equals("yes") || ynAnswer.equals("Yes") || ynAnswer.equals("YES") || ynAnswer.equals("Y") || ynAnswer.equals("y"))
            {
                play = true;
            }
            else if (ynAnswer.equals("no") || ynAnswer.equals("No") || ynAnswer.equals("NO") || ynAnswer.equals("N") || ynAnswer.equals("n"))
            {
                play = false;
            }
            else
            {
                play = false;
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Input not recogized; ending program");
            }
        } while (play);
    }
}

/**
 * NOTES
 * 
 * 3x3 grid, labeled with x and y coordinates
 * optional tutorial
 * 
 * methods
 *      program needs to have an idea of how to react to certain circumstances
 * 
 * allow the user to pick whether they will play as X or O
 * 
 * !
 * ask user to pick a space to put their symbol
 * print the board with the user's move
 * then ask to input anything when they are ready to continue
 * clear the screen, then reprint the board
 *      when board is reprinted, print with the program's response
 * 
 * continue from ! until one side wins or all 9 spaces are filled
 * 
 * program must detect horizontal, vertical, and diagonal wins
 */