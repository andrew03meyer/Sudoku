import java.util.ArrayList;

public class Board {
    private ArrayList<ArrayList> rows = new ArrayList<ArrayList>();

    /*
    * constructor - takes string parameter
    * Creates a 2d ArrayList to store string as individual values
     */
    public Board(String strBoard){
        try {
            String[] strArr = strBoard.split(", ");
            for (int x = 0; x < 9; x++) {
                ArrayList<Integer> intArr = new ArrayList<Integer>();
                for(int y = 0; y < 9; y++){
                    intArr.add(Integer.parseInt(strArr[(x*9)+y]));
                }
                rows.add(intArr);
            }
        }
        catch(Exception e){
            System.out.println("Invalid board input: " + e);
        }
    }

    /*
    * print values in the grid
     */
    public void printGrid(){
        for(ArrayList<Integer> row:rows){
            for(Integer value:row){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList> getGrid(){
        return rows;
    }
}
