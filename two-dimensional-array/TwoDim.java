public class TwoDim {
	public static void main(String[] args) {
		
		String [] [] studentNames = {{"Tony", "Montana"},
              									 {"Rocky", "Balboa"}, 
              									 {"Lara", "Croft"}};
		int    [][] matrix        = {{1,3,2,4}, 
									               {2,3,4,5}};
    
		//double [][] jaggedbalances      ={{1.0,1.5,2.6}, {1.7,2.5}, {1.3}}; //you can 

		/*
		 * Datatype [][] identifier = new Datatype [rows][columns];
		 * Datatype [][] identifier ={{elem1,elem2},{elem1, elem2},{null,null}}; 
		 */
		//print all elements in 2d array
		for (int i = 0; i< studentNames.length; ++i) {
			System.out.println("Student:");
			for (int j =0; j<studentNames[i].length;++j) {
				System.out.print(" "+studentNames[i][j]);
			}
			System.out.println("\n~~~~~~~~~~~~~~~~~~~");
		}
    
		for (int row = 0; row< matrix.length; ++row) {
			for (int col =0; col<matrix[row].length;++col) {
				System.out.print(" "+matrix[row][col]);
			}
			System.out.println();
		}
		
		
		/*
		//Print all the last names of the students ONLY
		for(int i = 0;i < studentNames.length;++i) {
			System.out.println(studentNames[i][1]);
		}
		//Print  All the First names only
		for (int j = 0; j<studentNames.length; ++j) {
			System.out.println(studentNames[j][0]);
		}
		System.out.println("**********************");
		//Change first name of Lara Croft to Jason
		studentNames[2][0]="Jason";
		System.out.println(studentNames[2][0]);
		
		// To change the last name of Tony Montana to Soprano
		studentNames[0][1] = "Soprano";
		
		//Change all the first names to Joe
		for(int i =0; i<studentNames.length; ++i) {
			studentNames[i][0]= "Joe";
		}
		//Change all the last names to Doe
		for (int i=0; i<studentNames.length;++i) {
			studentNames[i][1]= "Doe";
		}
		*/
	}
}
