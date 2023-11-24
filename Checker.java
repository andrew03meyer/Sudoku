import java.util.ArrayList;
import java.util.HashMap;
public class Checker {
    public Boolean horizontalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        //vertical Check
        for(ArrayList<Integer> row:grid){
            HashMap hm1 = new HashMap();
            for(Integer value: row){
                if(!hm1.containsKey(value)){
                    hm1.put(value, 1);
                }
                else{
                    valid = false;
                }
            }
        }

        //Print validity
        if(valid){
            System.out.println("This is horizontally valid");
        }
        else{
            System.out.println("This is horizontally not valid");
        }
        return valid;
    }

    public Boolean verticalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        //vertical check
        for(int x = 0; x < grid.size(); x++){
            HashMap hm1 = new HashMap();
            for(int y = 0; y < grid.get(x).size(); y++){
                if(!hm1.containsKey(grid.get(y).get(x))){
                    hm1.put(grid.get(y).get(x), 1);
                }
                else{
                    valid = false;
                }
            }
        }

        //print validity
        if(valid){
            System.out.println("This is vertically valid");
        }
        else{
            System.out.println("This is vertically not valid");
        }
        return valid;
    }

    public Boolean threeByThreeCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;
        HashMap hash1 = new HashMap();

        int col = 0;
        int row = 0;

        while(col < 9 && row < 9 && valid) {

            //Checks the hash's contents
            if (!hash1.containsKey(grid.get(row).get(col))) {
                hash1.put(grid.get(row).get(col), 1);
            } else {
                valid = false;
            }

            //If at the end of the grid and row
            if (col == 8 && (row == 2 || row == 5)) {
                col = 0;
                row++;
                hash1 = new HashMap();
            }
            else {
                if(col == 2 || col == 5 || row == 3 || row == 6) {
                    //If at the end of a column 3x3
                    if (col == 2 || col == 5) {
                        col -= 2;
                        row++;
                    }
                    //if at the end of a row 3x3
                    if (row == 3 || row == 6) {
                        row -= 3;
                        col += 3;
                        hash1 = new HashMap();
                    }
                }
                //Takes you out of while
                else{
                    col++;
                }
            }
        }
        System.out.println(valid);

        return valid;
    }
}
