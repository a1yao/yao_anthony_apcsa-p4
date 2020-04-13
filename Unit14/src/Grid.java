//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;
   private String[] values;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		setGrid(rows, cols, vals);
		values = vals;
	}
	
	public void setGrid(int rows, int cols, String[] vals) {
		grid = new String[cols][rows];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				int ran = (int)(Math.random() * (vals.length));
				grid[i][j] = vals[ran]; 
				
			}
		}
	}
	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = countVals(vals[0]);
		String smax = vals[0];
		for (int i = 0; i < vals.length; i++) {
			if (max < countVals(vals[i])) {
				max = countVals(vals[i]);
				smax = vals[i];
			}
		}
		return smax;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				output = output + grid[i][j] + " ";
			}
			output = output + "\n";
		}
		output = output + "\n\n";
		output = output + findMax(values) + " occurs the most";
		return output;
	}
}