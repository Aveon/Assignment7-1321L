import java.util.Scanner;
public class Assignment7A
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Rectangle width: ");
        float width = scan.nextFloat();
        System.out.print("Rectangle height: ");
        float height = scan.nextFloat();
        System.out.print("Fill color: ");
        String fill_color = scan.next();
        System.out.print("Stroke color: ");
        String stroke_color = scan.next();

        SVGRect o1 = new SVGRect(width, height, fill_color, stroke_color);
        boolean stopProg = false;
        do
        {
            System.out.println("\nWhat would you like to do? ");
         System.out.println("1) Change the Rectangle size");
         System.out.println("2) Update the Fill and Stroke settings");
         System.out.println("3) Move the Rectangle");
         System.out.println("4) Print valid XML");
         System.out.println("5) Quit");
         System.out.print("Option: ");
         int userChoice = scan.nextInt();

         switch(userChoice)
         {
             case 1:
                 System.out.print("\nEnter a width: ");
                 float new_width = scan.nextFloat();
                 System.out.print("Enter a height: ");
                 float new_height = scan.nextFloat();
                 if(o1.setDimensions(new_width, new_height))
                 {
                     System.out.println("Rectangle updated!");
                 }
                 else
                 {
                     System.out.println("Invalid input - rectangle not changed.");
                 }
                 break;
             case 2:
                 System.out.print("\nEnter a new fill color: ");
                 String fill = scan.next();
                 System.out.print("Enter a new stroke color: ");
                 String stroke = scan.next();
                 System.out.print("Enter a new stroke width: ");
                 float strokeWidth = scan.nextFloat();
                 if(o1.set_fill_stroke(fill, stroke, strokeWidth))
                 {
                     System.out.println("Rectangle updated!");
                 }
                 else
                 {
                     System.out.println("Invalid input - rectangle not changed.");
                 }
                 break;
             case 3:
                 System.out.print("\nEnter a new offset x: ");
                 float new_X = scan.nextFloat();
                 System.out.print("Enter a new offset y: ");
                 float new_Y = scan.nextFloat();
                 o1.setOffsets(new_X, new_Y);
                 System.out.println("Rectangle updated!");
                 break;
             case 4:
                 o1.print_XML();
                 break;
             case 5:
                 System.out.println("\nClosing!");
                 stopProg = true;
                 break;
         }

        } while(!stopProg);
    }
}
