import java.util.Scanner;

public class Test {
    public static Singer_List singer = new Singer_List();
    public static Scanner in = new Scanner(System.in);

    public static void Show_Options(){
        String options ="\t 1. Print the Singer List\n"
                +"\t 2. Add the Singers To List\n"
                +"\t 3. Change the Singer's Name\n"
                +"\t 4. Remove Singer from the List\n"
                +"\t 5. Research the Singer in the List\n"
                +"\t 6. For Quit\n";
        System.out.println(options);
    }

    public static void print_singer(){
        singer.Print_Singers();
    }

    public static void add_singer(){
        System.out.print("Enter the name of the singer you want to add: ");
        String name = in.nextLine();
        singer.Add_Singer(name);
    }

    public static void change_singer(){
        System.out.print("Enter the Singer's Position: ");
        int position = in.nextInt();
        in.nextLine();
        System.out.print("Enter the New Name: ");
        String new_name = in.nextLine();
        singer.Change_Singer_Name(position-1, new_name);

    }

    public static void remove_singer(){
        System.out.print("Enter the Singer's Position: ");
        int position = in.nextInt();
        singer.Remove_Singer(position-1);
    }

    public static void research_singer(){
        System.out.println("Enter a Singer's Name: ");
        String name = in.nextLine();
        singer.Research_Singer(name);
    }
    public static void main(String[] args) {
        System.out.println("...Welcome to Singers Program...");
        Show_Options();

        boolean quit = false;
        int option;

        while(!quit){

            System.out.print("Please Choose an Option= ");
            option = in.nextInt();
            in.nextLine();

            switch(option){
                case 1:
                    print_singer();
                    break;
                case 2:
                    add_singer();
                    break;
                case 3:
                    change_singer();
                    break;
                case 4:
                    remove_singer();
                    break;
                case 5:
                    research_singer();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Quiting from the Singers Program...\nHave a Nice Day :)");
            }
        }
    }
}