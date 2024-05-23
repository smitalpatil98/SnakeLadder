

public class SnakeLadder{
    public static void main(String[] args)
    {
        int diceRoll = 0;
        int current_position = 1;
        int max_position = 100;
        int Snake_Array[]={6,12,26,35,42,67,88,92};
        int Ladder_Array[]={3,15,36,49,55,77,82,90};

        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting Position of the Player = 0");

        for(current_position=1;current_position < 100;current_position++)
        {
            diceRoll = (int) ((Math.random() * 6) );
            System.out.println("Dice Number :" + diceRoll);

            current_position = current_position +diceRoll;
            current_position = current_position-1;

            System.out.println("Current position: "+current_position);

            if(diceRoll==0){
                current_position = current_position - diceRoll;
                System.out.println("You have to stay on the same position!");
            }
            if(current_position == Ladder_Array[0]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[1]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[2]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[3]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[4]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[5]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[6]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Ladder_Array[7]){
                current_position += diceRoll;
                System.out.println("You got a ladder");
                System.out.println("You at position: "+current_position);
            }

            if(current_position == Snake_Array[0]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[1]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[2]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[3]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[4]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[5]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[6]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }
            else if(current_position == Snake_Array[7]){
                current_position -= diceRoll;
                System.out.println("You got a snake.");
                System.out.println("You at position: "+current_position);
            }

            if(current_position <0)
                current_position = 0;


            if(current_position == max_position){
                System.out.println("Congratulations, You win the game!");
            }

        }
    }
}