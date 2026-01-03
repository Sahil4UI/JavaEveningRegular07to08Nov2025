import java.util.Scanner;
public class Demo {
    String board [] = {"1","2","3","4","5","6","7","8","9"} ;

    // gameBoard
    void display(){
        for (int i=0;i<board.length;i++)
        {
          if ((i+1)%3==0)
            {
                System.out.print(board[i]+"\n");
                System.out.println("-------------");
            }   
            else{
                System.out.print(board[i]+"  |  ");
            }
        }
    }
    // cpu cannot move on my position and i cannot move on cpu's position
    // Who is the winner?
    // GUI

    // Computer vs Me
    void Player1(int pos){
        board[pos-1]="X";
        CPU();
    }
    void CPU(){
        // 0 to 8
        int cpu_pos = (int) (Math.random()*9);
        board[cpu_pos]="0";
        
    }
     
}

class TicTacToe{
    public static void main(String[] args) {
        Demo obj = new Demo();
        int pos;
        Scanner sc = new Scanner(System.in);
        while (true){
            obj.display();

            System.out.println("Enter Pos b/w 1to9 : ");
            pos = sc.nextInt();
            obj.Player1(pos);

        }


    }
}
