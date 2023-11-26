import java.util.ArrayList;
import java.util.HashMap;
public class Checker {

    public Boolean process(ArrayList<ArrayList<Integer>> grid){
        if(horizontalCheck(grid) && verticalCheck(grid) && threeByThreeCheck(grid)){
            return true;
        }
        else{
            return false;
        }
    }
    private Boolean horizontalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        for(ArrayList<Integer> row:grid){
            ArrayList<Integer> values = new ArrayList<Integer>();
            for(Integer value: row){
                if(!values.contains(value)){
                    values.add(value);
                }
                else{
                    valid = false;
                }
            }
        }
        return valid;
    }

    private Boolean verticalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        //vertical check
        for(int x = 0; x < grid.size(); x++){
            ArrayList<Integer> values = new ArrayList<Integer>();
            for(int y = 0; y < grid.get(x).size(); y++){
                if(!values.contains(grid.get(y).get(x))){
                    values.add(grid.get(y).get(x));
                }
                else{
                    valid = false;
                }
            }
        }
        return valid;
    }

    private Boolean threeByThreeCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;
        ArrayList<Integer> values = new ArrayList<Integer>();

        int col = 0;
        int row = 0;

        while(col < 9 && row < 9 && valid) {

            //Checks the hash's contents
            if (!values.contains(grid.get(row).get(col))) {
                values.add(grid.get(row).get(col));
            } else {
                valid = false;
            }

            //If at the end of the grid and row
            if (col == 8 && (row == 2 || row == 5)) {
                col = 0;
                row++;
                values = new ArrayList<Integer>();
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
                        values = new ArrayList<Integer>();
                    }
                }
                //Increments column if no other condition met
                else{
                    col++;
                }
            }
        }

        return valid;
    }
}
