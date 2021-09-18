import java.io.File;
public class Uninstall {
 public static void method(){
	File samex=new File("Samex.class");
	String path=samex.getAbsolutePath();
	if(samex.delete()==true) {
	System.out.println(path + " has been deleted.");
	}
	else if(samex.delete()==false) {
		System.out.println("Deletion of " + path + " was unsuccessful.");
	}
	File samexRun=new File("samexRun.class");
	String path_2=samexRun.getAbsolutePath();
	if(samexRun.delete()==true) {
		System.out.println(path_2 + " has been deleted.");
	}
	else if(samexRun.delete()==false) {
		System.out.println("Deletion of" + path_2 + " was unsuccessful.");
	}
	File validity=new File("validiyOfSamex.txt");
	String path_3=validity.getAbsolutePath();
	if(validity.delete()==true) {
		System.out.println(path_3 + " has been deleted.");
	}
	else if(validity.delete()==false) {
		System.out.println("Deletion of " + path_3 + " was unsuccessful.");
	}
	File def=new File("Main_File.txt");
	if(def.exists()==true){
		String path_4=def.getAbsolutePath();
		if(def.delete()==true) {
			System.out.println(path_4 + " has been deleted.");
		}
		else if(def.delete()==false) {
			System.out.println("Deletion of " + path_4 + " was unsuccessful.");
		}
	}
	File ff=new File("Samex_Password.txt");
	   String path_6=ff.getAbsolutePath();
	    if(ff.delete()==true) {
		 	System.out.println(path_6 + " has been deleted.");
		}
	    if(ff.delete()==false) {
		 	System.out.println("Deletion "+path_6 + " was unsuccessful.");
		}
	 File validit=new File("Updates.class");
	String path_u=validity.getAbsolutePath();
	if(validit.delete()==true) {
		System.out.println(path_u + " has been deleted.");
	}
	if(validit.delete()==false) {
		 	System.out.println("Deletion "+path_u + " was unsuccessful.");
		}
  }
	public static void main(String[] args){
	 method();	
	}
 }

