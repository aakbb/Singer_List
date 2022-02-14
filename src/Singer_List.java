import java.util.ArrayList;

public class Singer_List {
    private ArrayList<String> singer_List = new ArrayList<String>();

    public void Print_Singers(){
        System.out.printf("There are %d singer in this list.\n" , singer_List.size());
        for (int i =0; i<singer_List.size(); i++){
            System.out.println(singer_List.get(i));
        }
    }

    public void Add_Singer(String name){
        singer_List.add(name);
        System.out.println("The list is updated...");
    }

    public void Change_Singer_Name(int position  , String new_name){
        singer_List.set(position, new_name);
        System.out.println("The list is updated...");
        System.out.printf("Updated the name of the singer in position %d. to %s.%n" , position , new_name);
    }

    public void Remove_Singer(int position){
        String name  = singer_List.get(position);
        singer_List.remove(position);
        System.out.printf("%s is deleted from the list\n" , name);
    }

    public void Research_Singer(String name){
        int position = singer_List.indexOf(name);
        if ( position >=0){
            System.out.println("Singer Found");
            System.out.printf("%s on the %d. position\n" , name , position);
        }else{
            System.out.println("Singer Not Found...");
        }
    }
}
