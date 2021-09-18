import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Samex{
 public static void main(String[] args) throws IOException, InterruptedException{ 
    File ff=new File("validityOfSamex.txt");
    if(ff.exists()==false) {
		File version=new File("samex_version.txt");
	version.createNewFile();
	FileWriter ver=new FileWriter(version);
    ver.write("1.1");
	ver.close();
    	File default_file=new File("Main_File.txt");
    	default_file.createNewFile();
    	ff.createNewFile();
    	System.out.println("You can now use Samex!");
    }
    else if(ff.exists()==true){
    	SamexRun runFinal=new SamexRun();
        	   runFinal.run("Main_File.txt");
    }
	}     
 } 

