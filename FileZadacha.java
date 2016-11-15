import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileZadacha {

	
		
public static final String VALIDATION_OF_ABSOLUTE_PATH = "([a-zA-Z]:)?(\\\\[^<>:\"\\/|\\?\\*].+)+\\\\?";
		
		public static void main(String[] args) throws IOException   {  
			Scanner input= new Scanner(System.in);
			BufferedReader br = null;
			BufferedWriter bw = null;
			String currentLine= null; 
			FileWriter fileWriter = null;
		//	String enteredName = getFileName(input);
			
			System.out.println("Enter the name of the file: 'something.txt");
			String fName = input.next();
			File file = new File(fName);
			
			boolean isCreated = file.createNewFile();
			
			if(isCreated == true)
			{
				System.out.println("The file was created successfully");
			}
			
			else
			{
				System.out.println("The file has already been created");
			}
			
			br = new BufferedReader(new FileReader(fName));
			System.out.println("The sorted data is : ");
			System.out.println("-----------------------");
			try {		
				while((currentLine = br.readLine()) != null){
				//System.out.println(readedFromFile);
					separatingPeople(currentLine);
					
				}	
				
				
			}
				
			catch(FileNotFoundException e){
				System.out.println("Please enter the file path again");
			}
				catch(IOException e)
				{
					System.out.println("Something wrong happened when reading/writing");
				}
			
		
			finally {
				if (br != null) {
					br.close();        
				}
				if (bw != null) {
					bw.close();
				}
			}
			
		}
	
 

	public static void separatingPeople(String currentLine){
	
	
		String[] splitted = currentLine.split("\\*");
		People[] array = new People[splitted.length/4];
	//	System.out.println(array.length);
		for (int i = 0, j=0; i < splitted.length; i = i + 4) {
			Integer.parseInt(splitted[i]);
			array[j]=new People(Integer.parseInt(splitted[i]), splitted[i+1], splitted[i+2], Integer.parseInt(splitted[i+3]));
	//	System.out.println(splitted[i]);
	
		j++;
		
		}
		sortingPeople(array);
	}
	
	
public static void sortingPeople(People[] array){
	int i, j;
	People swap;
	
	for(i=0; i<(array.length-1); i++){
		for(j=0; j<(array.length)-i-1; j++){
			if(array[j].getNumber()>array[j+1].getNumber()){
				swap = array[j];
				array[j]= array[j+1];
				array[j+1]=swap;
			}
		}
	}
	for(i=0; i<array.length; i++){

		System.out.println(array[i].getNumber()+ " " + array[i].getName() + " " + 
		array[i].getFamName() + " " + array[i].getYearOfBirth());
	}
	
}



	



/*	public static String getFileName(Scanner console) {
		String enteredName;
		Pattern pattern = Pattern.compile(VALIDATION_OF_ABSOLUTE_PATH);
		Matcher matcher;
		do{
			System.out.println("Enter the path to the file:  ");
		enteredName = console.nextLine();
		matcher = pattern.matcher(enteredName);
		}while(matcher.matches() == false);
		return enteredName;
	}*/

}
	 
	

