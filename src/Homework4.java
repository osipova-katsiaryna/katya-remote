package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
	}
		// TODO Auto-generated method stub
		public static int SIZE = 3;
	    public static int DOTS_TO_WIN = 3;
	    public static final char DOT_EMPTY = '•';
	    public static final char DOT_X = 'X';
	    public static final char DOT_O = 'O';
	    public static char[][] map;
	    public static Scanner sc = new Scanner(System.in);
	    public static Random rand = new Random();
	    
	      
	    // Solution when dots number the same as board size
	    public static boolean checkWin1(char symb) {
	    	boolean resultD1 = true; // diagonal 1 check result
	    	boolean resultD2 = true; // diagonal 2 check result
	    	for (int i = 0; i < SIZE; i++) {
	    		resultD1 = resultD1 && map[i][i] == symb;
	    		resultD2 = resultD2 && map[i][SIZE - i - 1] == symb;
	    		
	    		boolean resultR = true; // row check result
	    		boolean resultC = true; // column check result 		
	    		
	    		for (int j = 0; j < SIZE; j++) {
	    			resultR = resultR && map[i][j] == symb;
	    			resultC = resultC && map[j][i] == symb;
	    		}
	    		if (resultR || resultC) {
	    			return true;
	    		}
	    	}
	    	
	    	return resultD1 || resultD2;
	        /*if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
	        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
	        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
	        
	        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
	        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
	        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
	        
	        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
	        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
	        return false;*/
	    }
	    
	    // Solution when dot number different from the board size. Logic should cover also checkWin1() case
	    public static boolean checkWin2(char symb) {
	    	for (int i = 0; i < SIZE; i++) {
	    		for (int j = 0; j < SIZE; j++) {
	    			if (map[i][j] == symb) {
    					if (checkColumn(symb, i, j) || // check items on the right side
    							checkRow(symb, j, i) ||  // check items  below
    							checkDiagonalDown(symb, i, j) ||
    							checkDiagonalUp(symb, i, j)) {
    						return true;
    					}
	    			}	    			
	    		}	    		
	    	}
	    	return false;
	    }
	    
	    public static boolean checkRow(char symb, int i, int j) {
	    	j++;
	    	int count = 1;
			while ( j < SIZE && count < DOTS_TO_WIN && map[i][j] == symb) {
				count++;
				j++;
			}
			return count == DOTS_TO_WIN;
	    	
	    }
	    public static boolean checkColumn(char symb, int i, int j) {
			i++;
	    	int count = 1;
			while ( i < SIZE && count < DOTS_TO_WIN && map[i][j] == symb) {
				count++;
				i++;
			}
			return count == DOTS_TO_WIN;
	    	
	    }
	    
	    public static boolean checkDiagonalDown(char symb, int i, int j) {
	    	i++;
	    	j++;
			int count = 1;
			while ( i < SIZE && j < SIZE && count < DOTS_TO_WIN && map[i][j] == symb) {
				count++;
				i++;
				j++;
			}
			return count == DOTS_TO_WIN;	    	
	    }
	    public static boolean checkDiagonalUp(char symb, int i, int j) {
	    	i--;
	    	j++;
			int count = 1;
			while ( i >= 0 && j < SIZE && count < DOTS_TO_WIN && map[i][j] == symb) {
				count++;
				i-- ;
				j++;
			}
			return count == DOTS_TO_WIN;	    	
	    }
	    
	    
	    
	    public static boolean isMapFull() {
	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                if (map[i][j] == DOT_EMPTY) return false;
	            }
	        }
	        return true;
	    }
	    public static void aiTurn() {
	        int x, y;
	        do {
	            x = rand.nextInt(SIZE);
	            y = rand.nextInt(SIZE);
	        } while (!isCellValid(x, y));
	        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
	        map[y][x] = DOT_O;
	    }
	    public static void humanTurn() {
	        int x, y;
	        do {
	            System.out.println("Введите координаты в формате X Y");
	            x = sc.nextInt() - 1;
	            y = sc.nextInt() - 1;
	        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
	        map[y][x] = DOT_X;
	    }
	    public static boolean isCellValid(int x, int y) {
	        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
	        if (map[y][x] == DOT_EMPTY) return true;
	        return false;
	    }
	    public static void initMap() {
	        map = new char[SIZE][SIZE];
	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                map[i][j] = DOT_EMPTY;
	            }
	        }
	    }
	    public static void printMap() {
	        for (int i = 0; i <= SIZE; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        for (int i = 0; i < SIZE; i++) {
	            System.out.print((i + 1) + " ");
	            for (int j = 0; j < SIZE; j++) {
	                System.out.print(map[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	

	}


