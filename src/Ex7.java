import java.util.Scanner;

public class Ex7 {
    public static final int SIZE_BOARD = 9;
    public static void main(String[] args) {
        char[] board = new char[SIZE_BOARD];
        printBoard(board);
        char sign = 'X';
        int countOfSignInBoard = 0;
        boolean isThereWinner =false;
        do {
            int position = getPositionFromUser(board);
             isThereWinner = placeSymbolOnBoard(board,position,sign);
            countOfSignInBoard++;
            if(countOfSignInBoard%2 !=0){
                sign = 'O';
            }
            else{
                sign = 'X';
            }
            if(countOfSignInBoard == 9){
                isThereWinner = true;
            }
            System.out.println("The game is over? "+isThereWinner);
        }while (!isThereWinner);
        if(countOfSignInBoard == 9 && checkWinner(board) != 'X' && checkWinner(board) != 'O') {
            System.out.println("Tie");
        }
        


    }
    public static void printBoard(char[] board){
        int count = 0;
        for (int i = 0; i < board.length; i++){
            System.out.print(board[i] + " ");
            count++;
            if(count%3 == 0){
                System.out.println("");
            }
        }
    }

    public static boolean isAvailable(char[]chars,int index){
        if(chars[index] == 'X' || chars[index] == 'O'){
            return false;
        }
        return true;
    }

    public static int getPositionFromUser(char[]board){
        Scanner scanner = new Scanner(System.in);
        int position;
        do {
            System.out.println("Enter a number between 1 - 9: ");
            position = scanner.nextInt();
            if(position <1 || position >9){
                System.out.println("The number not in range! ");
                System.out.println("Enter a number again ");
            }
            else if(!isAvailable(board,position-1)){
                System.out.println("There is value in your chose!");
                System.out.println("Enter a number again ");  
            }

        } while (position <1 || position >9  || !isAvailable(board,position-1)  );
        return position;
    }

    public static char checkWinner(char[] board){
        if((board[0]=='X'||board[0]=='O') && board[0] == board[1] && board[1]== board[2]){
            return board[0];
        }
        else if((board[3]=='X'||board[3]=='O') && board[3] == board[4] && board[4]== board[5]){
            return board[3];
        }
        else if((board[6]=='X'||board[6]=='O') && board[6] == board[7] && board[7]== board[8]){
            return board[6];
        }
        else if((board[0]=='X'||board[0]=='O') && board[0] == board[4] && board[4]== board[8]){
            return board[0];
        }
        else if((board[2]=='X'||board[2]=='O') && board[2] == board[4] && board[4]== board[6]){
            return board[2];
        }
        else if((board[0]=='X'||board[0]=='O') && board[0] == board[3] && board[3]== board[6]){
            return board[0];
        }
        else if((board[1]=='X'||board[1]=='O') && board[1] == board[4] && board[4]== board[7]){
            return board[1];
        }
        else if((board[2]=='X'||board[2]=='O') && board[2] == board[5] && board[5]== board[8]){
            return board[2];
        }
        else{
            return '-';
        }
    }

    public static boolean placeSymbolOnBoard(char[] board, int index, char sign){ //השמה של הסמן בלוח
        board[index-1]  = sign;
        printBoard(board);
        if(checkWinner(board) == 'X' || checkWinner(board) == 'O'){
            System.out.println("The winner is: " + checkWinner(board));
            return true;
        }
        return false;
    }
}
