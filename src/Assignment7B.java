import java.util.Scanner;
public class Assignment7B
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create Player 1");
        System.out.print("Enter X position: ");
        int p1_xPos = scan.nextInt();
        System.out.print("Enter Y position: ");
        int p1_yPos = scan.nextInt();
        System.out.print("Enter Z position: ");
        int p1_zPos = scan.nextInt();
        System.out.print("Enter Player Hitbox Width: ");
        int p1_width = scan.nextInt();
        System.out.print("Enter Player Hitbox Height: ");
        int p1_height = scan.nextInt();
        System.out.print("Enter Player Hitbox Depth: ");
        int p1_depth = scan.nextInt();

        System.out.println("\nCreate Player 2");
        System.out.print("Enter X position: ");
        int p2_xPos = scan.nextInt();
        System.out.print("Enter Y position: ");
        int p2_yPos = scan.nextInt();
        System.out.print("Enter Z position: ");
        int p2_zPos = scan.nextInt();
        System.out.print("Enter Player Hitbox Width: ");
        int p2_width = scan.nextInt();
        System.out.print("Enter Player Hitbox Height: ");
        int p2_height = scan.nextInt();
        System.out.print("Enter Player Hitbox Depth: ");
        int p2_depth = scan.nextInt();

        Player player1 = new Player(p1_width, p1_height, p1_depth, p1_xPos, p1_yPos, p1_zPos);
        Player player2 = new Player(p2_width, p2_height, p2_depth, p2_xPos, p2_yPos, p2_zPos);

        boolean collision = false;

        do
        {
            System.out.println("\nPlayer 1 is at (" + player1.getX_Position() + "," + player1.getY_Position() + "," + player1.getZ_Position() +
                    ") and Player 2 is at (" + player2.getX_Position() + "," + player2.getY_Position() + "," + player2.getZ_Position() + ")");
            System.out.print("Which one do you want to move? ");
            int choice = scan.nextInt();
            System.out.print("Which direction should Player " + choice + " move (up, down, left, right, forward, or backward?) ");
            String movement = scan.next().toLowerCase();
            System.out.print("How far should Player " + choice + " move? ");
            int distance = scan.nextInt();
            if (choice == 1)
            {
                switch(movement)
                {
                    case "up":
                    case "down":
                        player1.move_Y(distance);
                        break;
                    case "left":
                    case "right":
                        player1.move_X(distance);
                        break;
                    case "forward":
                    case "backward":
                        player1.move_Z(distance);
                        break;
                }
            }
            else if (choice == 2)
            {
                switch(movement)
                {
                    case "up":
                    case "down":
                        player2.move_Y(distance);
                        break;
                    case "left":
                    case "right":
                        player2.move_X(distance);
                        break;
                    case "forward":
                    case "backward":
                        player2.move_Z(distance);
                        break;
                }
            }
            if(player1.didTheyCollide(player2))
            {
                System.out.print("\nPlayer 1 is at (" + player1.getX_Position() + "," + player1.getY_Position() + "," + player1.getZ_Position() +
                        ") and Player 2 is at (" + player2.getX_Position() + "," + player2.getY_Position() + "," + player2.getZ_Position() + ")");
                collision = true;
            }

        }while(!collision);




    }
}
