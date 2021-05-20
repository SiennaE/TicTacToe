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
    
    static void exampleBoard(String[][] lineUpDown, String[] lineCross, String[][] coordinates,  String[][] symbolSpaces)
    {
        for (int x = 0; x < 3; x++)
        {
            for (int a = 0; a < 3; a++)
            {
                for (int b = 0; b < 5; b++)
                {
                    if (x == 0 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(symbolSpaces[0][l]);
                        }
                        break;
                    }
                    else if (x == 1 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(symbolSpaces[1][l]);
                        }
                        break;
                    }
                    else if (x == 2 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(symbolSpaces[2][l]);
                        }
                        break;
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
    
    static void printBoard(String[][] lineUpDown, String[] lineCross, String[][] coordinates, String[][] exampleCords)
    {
        for (int x = 0; x < 3; x++)
        {
            for (int a = 0; a < 3; a++)
            {
                for (int b = 0; b < 5; b++)
                {
                    if (x == 0 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(exampleCords[0][l]);
                        }
                        break;
                    }
                    else if (x == 1 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(exampleCords[1][l]);
                        }
                        break;
                    }
                    else if (x == 2 && a==1)
                    {
                        for (int l = 0; l < 11; l++) 
                        {
                            System.out.print(exampleCords[2][l]);
                        }
                        break;
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
    
    static void printExample(int displayExample, String[][] lineUpDown, String[] lineCross, String[][] coordinates, String[][]exampleCords)
    {
        if (displayExample==1)
            {
                exampleBoard(lineUpDown, lineCross, coordinates, exampleCords);
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------|");
                System.out.println(" ");
            }
    }
    
    
    static void detectWin()
    {
        
    }
    
    static void gridSpace(String userSpace, int idk, String[][] symbolSpaces, String userSymbol)
    {
        if (userSpace.equals("A1") || userSpace.equals("a1"))
        {
            //symbolSpaces[0][1]
            symbolSpaces[0][1] = userSymbol;
        }
        else if (userSpace.equals("A2") || userSpace.equals("a2"))
        {
            //symbolSpaces[0][5]
            symbolSpaces[0][5] = userSymbol;
        }
        else if (userSpace.equals("A3") || userSpace.equals("a3"))
        {
            //symbolSpaces[0][9]
            symbolSpaces[0][9] = userSymbol;
        }
        else if (userSpace.equals("B1") || userSpace.equals("b1"))
        {
            //symbolSpaces[1][1]
            symbolSpaces[1][1] = userSymbol;
        }
        else if (userSpace.equals("B2") || userSpace.equals("b2"))
        {
            //symbolSpaces[1][5]
            symbolSpaces[1][5] = userSymbol;
        }
        else if (userSpace.equals("B3") || userSpace.equals("b3"))
        {
            //symbolSpaces[1][9]
            symbolSpaces[1][9] = userSymbol;
        }
        else if (userSpace.equals("C1") || userSpace.equals("c1"))
        {
            //symbolSpaces[2][1]
            symbolSpaces[2][1] = userSymbol;
        }
        else if (userSpace.equals("C2") || userSpace.equals("c2"))
        {
            //symbolSpaces[2][5]
            symbolSpaces[2][5] = userSymbol;
        }
        else if (userSpace.equals("C3") || userSpace.equals("c3"))
        {
            //symbolSpaces[2][9]
            symbolSpaces[2][9] = userSymbol;
        }
        else
        {
            idk = 1;
        }
    }
    
    static void printBoards(int displayExample, String[][] lineUpDown, String[] lineCross, String[][] coordinates, String[][]exampleCords, String[][] symbolSpaces)
    {
        printExample(displayExample, lineUpDown, lineCross, coordinates, exampleCords);
     
        printBoard(lineUpDown, lineCross, coordinates, symbolSpaces);
    }
    
    static void programResponse(String[][] symbolSpaces, String programSymbol, String userSymbol)
    {
        //horizontal responses
        //a1 = a2; respond a3
        if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[0][5].equals(userSymbol))
        {
            symbolSpaces[0][9] = programSymbol;
        }
        //a2 = a3; respond a1
        else if (symbolSpaces[0][5].equals(userSymbol) && symbolSpaces[0][9].equals(userSymbol))
        {
            symbolSpaces[0][1] = programSymbol;
        }
        //a1 = a3; respond a2
        else if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[0][9].equals(userSymbol))
        {
            symbolSpaces[0][5] = programSymbol;
        }
        //b1 = b2; respond b3
        else if (symbolSpaces[1][1].equals(userSymbol) && symbolSpaces[1][5].equals(userSymbol))
        {
            symbolSpaces[1][9] = programSymbol;
        }
        //b2 = b3; respond b1
        else if (symbolSpaces[1][5].equals(userSymbol) && symbolSpaces[1][9].equals(userSymbol))
        {
            symbolSpaces[1][1] = programSymbol;
        }
        //b1 = b3; respond b2
        else if (symbolSpaces[1][1].equals(userSymbol) && symbolSpaces[1][9].equals(userSymbol))
        {
            symbolSpaces[1][5] = programSymbol;
        }
        //c1 = c2; respond c3
        else if (symbolSpaces[2][1].equals(userSymbol) && symbolSpaces[2][5].equals(userSymbol))
        {
            symbolSpaces[2][9] = programSymbol;
        }
        //c2 = c3; respond c1
        else if (symbolSpaces[2][5].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[2][1] = programSymbol;
        }
        //c1 = c3; respond c2
        else if (symbolSpaces[2][1].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[2][5] = programSymbol;
        }
        //vertical//
        //a1 = b1; respond c1
        else if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[1][1].equals(userSymbol))
        {
            symbolSpaces[2][1] = programSymbol;
        }
        //b1 = c1; respond a1
        else if (symbolSpaces[1][1].equals(userSymbol) && symbolSpaces[2][1].equals(userSymbol))
        {
            symbolSpaces[0][1] = programSymbol;
        }
        //a1 = c1; respond b1
        else if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[2][1].equals(userSymbol))
        {
            symbolSpaces[1][1] = programSymbol;
        }
        //a2 = b2; respond c2
        else if (symbolSpaces[0][5].equals(userSymbol) && symbolSpaces[1][5].equals(userSymbol))
        {
            symbolSpaces[2][5] = programSymbol;
        }
        //b2 = c2; respond a2
        else if (symbolSpaces[1][5].equals(userSymbol) && symbolSpaces[2][5].equals(userSymbol))
        {
            symbolSpaces[0][5] = programSymbol;
        }
        //a2 = c2; respond b2
        else if (symbolSpaces[0][5].equals(userSymbol) && symbolSpaces[2][5].equals(userSymbol))
        {
            symbolSpaces[1][5] = programSymbol;
        }
        //a3 = b3; respond c3
        else if (symbolSpaces[0][9].equals(userSymbol) && symbolSpaces[1][9].equals(userSymbol))
        {
            symbolSpaces[2][9] = programSymbol;
        }
        //b3 = c3; respond a3
        else if (symbolSpaces[1][9].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[0][9] = programSymbol;
        }
        //a3 = c3; respond b3
        else if (symbolSpaces[0][9].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[1][9] = programSymbol;
        }
        //diagonal//
        //a1 = b2; respond c3
        else if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[1][5].equals(userSymbol))
        {
            symbolSpaces[2][9] = programSymbol;
        }
        //b2 = c3; respond a1
        else if (symbolSpaces[1][5].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[0][1] = programSymbol;
        }
        //a1 = c3; respond b2
        else if (symbolSpaces[0][1].equals(userSymbol) && symbolSpaces[2][9].equals(userSymbol))
        {
            symbolSpaces[1][5] = programSymbol;
        }
        //a3 = b2; respond c1
        else if (symbolSpaces[0][9].equals(userSymbol) && symbolSpaces[1][5].equals(userSymbol))
        {
            symbolSpaces[2][1] = programSymbol;
        }
        //b2 = c1; respond a3
        else if (symbolSpaces[1][5].equals(userSymbol) && symbolSpaces[2][1].equals(userSymbol))
        {
            symbolSpaces[0][9] = programSymbol;
        }
        //a3 = c1; respond b2
        else if (symbolSpaces[0][9].equals(userSymbol) && symbolSpaces[2][1].equals(userSymbol))
        {
            symbolSpaces[1][5] = programSymbol;
        }
    }
    
    public static void main(String[] args)
    {
        boolean play = false;
        Scanner input = new Scanner(System.in);
        
        
        
        do{
            String[][] coordinates = {{"A", "B", "C"},{"1", "2", "3"}};
            String[][] lineUpDown = {{"       ", "|", "       ", "|", "       "},{"       ", "|", "       ", "|", "       "},{"       ", "|", "       ", "|","       "}};
            //insert x/o [2][4/13/20]
            String[][] symbolSpaces = {{"   ", "@", "   ", "|", "   ","@", "   ", "|", "   ","@", "   "},{"   ", "@", "   ", "|", "   ","@", "   ", "|", "   ","@", "   "},{"   ", "@", "   ", "|", "   ","@", "   ", "|", "   ","@", "   "}};
            String[][] exampleCords = {{"  ", "A1", "   ", "|", "  ","A2", "   ", "|", "   ","A3", "  "},{"  ", "B1", "   ", "|", "  ","B2", "   ", "|", "   ","B3", "   "},{"  ", "C1", "   ", "|", "  ","C2", "   ", "|", "   ","C3", "   "}};
            String[] lineCross = {"-------|-------|-------"};
            int displayExample = 0;
            
            String ynAnswer = " ";
            boolean tOrF = false;
            String ready;
            int p = 0;
            String userSpace;
            String programSpace;
            int idk = 0;
            int symbolInt = 0;
            String userSymbol = " ";
            String programSymbol = " ";
            boolean recognized = true;
            
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
            
            System.out.println("Type anything when you are ready to continue.");
            ready = input.next();
            clear();
            
            do {
                System.out.println("Would you like to be X's (type \"1\") or O's (type \"2\")?");
                symbolInt = input.nextInt();
                if (symbolInt==1)
                {
                    userSymbol = "X";
                }
                else if (symbolInt==2)
                {
                    userSymbol = "O";
                }
                else
                {
                    System.out.println("Input not recogized; please re-enter");
                    System.out.println(" ");
                    recognized = false;
                }
            } while (!recognized);
            
            if (userSymbol.equals("X"))
            {
                programSymbol = "O";
            }
            else if (userSymbol.equals("O"))
            {
                programSymbol = "X";
            }
            
            clear();
            
            exampleBoard(lineUpDown, lineCross, coordinates, exampleCords);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Here is a guide to the board's coordinates.");
            System.out.println("Would you like to keep this guide throughout the program? (Type \"1\" for yes; \"2\" for no)");
            displayExample = input.nextInt();
            clear();
            
            printBoards(displayExample, lineUpDown, lineCross, coordinates,exampleCords, symbolSpaces);
            ///////////////////
            //do {
                System.out.println("What space would you like to occupy?");
                System.out.println(" ");
                System.out.println(" ");
                System.out.print("Coordinate (ex: A1, B2, etc.): ");
                userSpace = input.next();
                    
                gridSpace(userSpace, idk, symbolSpaces, userSymbol);
                    
                clear();
                
                printBoards(displayExample, lineUpDown, lineCross, coordinates,exampleCords, symbolSpaces);
                
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Type anything to continue.");
                
                programResponse(symbolSpaces, programSymbol, userSymbol);
                
                clear();
            //} while (!win);
            //////////////////////////
            
            //DELETE LATER
            printBoards(displayExample, lineUpDown, lineCross, coordinates,exampleCords, symbolSpaces);
            //DELETE LATER
            
            do {
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
                    recognized = false;
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Input not recogized; ending program");
                }
            } while (!recognized);
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