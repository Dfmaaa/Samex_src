import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
public class SamexRun {
	static String chstr(char[] a){
	 String re="";
	  for(int x=0;x<a.length;x++){
		  re+=a[x];
	  }
	   return re;
	}
	static String grc(){
	 Random r=new Random();
	  int till=10;//number of characters in the captcha code
	  char[] a=new char[till];
	  for(int n=0;n<a.length;n++){
           a[n]=(char)r.nextInt(126);
	  }
	 return chstr(a);	
	}
	static String encrypt(String str) {
		String fin=str;
		for(int x=0;x<=str.length()-1;x++) {
			if(str.charAt(x)=='a') {
				fin=fin.replace('a', 'k');
			}
			if(str.charAt(x)=='b') {
				fin=fin.replace('b', 't');
			}
			if(str.charAt(x)=='c') {
				fin=fin.replace('c', 'j');
			}
			if(str.charAt(x)=='d') {
				fin=fin.replace('d', 'u');
			}
			if(str.charAt(x)=='e') {
				fin=fin.replace('e', 'X');
			}
			if(str.charAt(x)=='f') {
				fin=fin.replace('f', 'N');
			}
			if(str.charAt(x)=='g') {
				fin=fin.replace('g', 'L');
			}
			if(str.charAt(x)=='h') {
				fin=fin.replace('h', 'J');
			}
			if(str.charAt(x)=='i') {
				fin=fin.replace('i', '}');
			}
			if(str.charAt(x)=='j') {
				fin=fin.replace('j', '>');
			}
			if(str.charAt(x)=='k') {
				fin=fin.replace('k', '<');
			}
			if(str.charAt(x)=='l') {
				fin=fin.replace('l', ';');
			}
			if(str.charAt(x)=='m') {
				fin=fin.replace('m', '!');
			}
			if(str.charAt(x)=='n') {
				fin=fin.replace('n', '+');
			}
			if(str.charAt(x)==' ') {
				fin=fin.replace(' ', '?');
			}
			if(str.charAt(x)=='o') {
				fin=fin.replace('o', 'Q');
			}
			if(str.charAt(x)=='p') {
				fin=fin.replace('p', 'Y');
			}
			if(str.charAt(x)=='q') {
				fin=fin.replace('q', ')');
			}
			if(str.charAt(x)=='r') {
				fin=fin.replace('r', '_');
			}
			if(str.charAt(x)=='s') {
				fin=fin.replace('s', '.');
			}
			if(str.charAt(x)=='t') {
				fin=fin.replace('t', ']');
			}
			if(str.charAt(x)=='u') {
				fin=fin.replace('u', ',');
			}
			if(str.charAt(x)=='v') {
				fin=fin.replace('v', ':');
			}
			if(str.charAt(x)=='w') {
				fin=fin.replace('w', '|');
			}
			if(str.charAt(x)=='x') {
				fin=fin.replace('x', '%');
			}
			if(str.charAt(x)=='y') {
				fin=fin.replace('y', '*');
			}
			if(str.charAt(x)=='z') {
				fin=fin.replace('z', '"');
			}
		}
		return fin;
	}
	static String decrypt(String str) {
		String fin=str;
		for(int x=0;x<=str.length()-1;x++) {
			if(str.charAt(x)=='k') {
				fin=fin.replace('k', 'a');
			}
			if(str.charAt(x)=='t') {
				fin=fin.replace('t', 'b');
			}
			if(str.charAt(x)=='j') {
				fin=fin.replace('j', 'c');
			}
			if(str.charAt(x)=='u') {
				fin=fin.replace('u', 'd');
			}
			if(str.charAt(x)=='X') {
				fin=fin.replace('X', 'e');
			}
			if(str.charAt(x)=='N') {
				fin=fin.replace('N', 'f');
			}
			if(str.charAt(x)=='L') {
				fin=fin.replace('L', 'g');
			}
			if(str.charAt(x)=='J') {
				fin=fin.replace('J', 'h');
			}
			if(str.charAt(x)=='}') {
				fin=fin.replace('}', 'i');
			}
			if(str.charAt(x)=='>') {
				fin=fin.replace('>', 'j');
			}
			if(str.charAt(x)=='<') {
				fin=fin.replace('<', 'k');
			}
			if(str.charAt(x)==';') {
				fin=fin.replace(';', 'l');
			}
			if(str.charAt(x)=='!') {
				fin=fin.replace('!', 'm');
			}
			if(str.charAt(x)=='+') {
				fin=fin.replace('+', 'n');
			}
			if(str.charAt(x)=='?') {
				fin=fin.replace('?', ' ');
			}
			if(str.charAt(x)=='Q') {
				fin=fin.replace('Q', 'o');
			}
			if(str.charAt(x)=='Y') {
				fin=fin.replace('Y', 'p');
			}
			if(str.charAt(x)==')') {
				fin=fin.replace(')', 'q');
			}
			if(str.charAt(x)=='_') {
				fin=fin.replace('_', 'r');
			}
			if(str.charAt(x)=='.') {
				fin=fin.replace('.', 's');
			}
			if(str.charAt(x)==']') {
				fin=fin.replace(']', 't');
			}
			if(str.charAt(x)==',') {
				fin=fin.replace(',', 'u');
			}
			if(str.charAt(x)==':') {
				fin=fin.replace(':', 'v');
			}
			if(str.charAt(x)=='|') {
				fin=fin.replace('|', 'w');
			}
			if(str.charAt(x)=='%') {
				fin=fin.replace('%', 'x');
			}
			if(str.charAt(x)=='*') {
				fin=fin.replace('*', 'y');
			}
			if(str.charAt(x)=='"') {
				fin=fin.replace('"', 'z');
			}
		}
		return fin;
	}
	static String ats(String[] a){
		int length=a.length-1;
		String sum="";
		for(int x=0;x<=length;x++){
			sum+=a[x];
		}
		return sum;
	}
	static String conv(String[] a){
		 String result="";
		 for(int x=0;x<=a.length-1;x++) {
			 result=result+a[x]+"\r\n";
		 }
		 return result;
	 }
	static boolean check(String[] a, String element){
		int length=a.length-1;
		int counter=0;
		for(int x=0;x<=length;x++) {
			if(a[x].equals(element)){
				counter++;
			}
		}
		if(counter>0) {
			return true;
		}
		else{
			return false;
		}
	}
	 public static void downloadFile(URL url, String fileName) throws Exception {
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
    }
    void run(String main_location) throws IOException, InterruptedException {
    	String location=main_location;
    	File pass=new File("Samex_Password.txt");
	   File main_loc=new File(main_location);
		Scanner input=new Scanner(System.in);
		System.out.println("\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
				+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
				+ "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
				+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀▄▀▄▀░░█████\r\n"
				+ "█░░░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
				+ "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
				+ "█░░░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
				+ "█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████");
		Thread.sleep(4000);
        if(pass.exists()==false) {
        	System.out.println("Enter a password for Samex. The text you enter will be your new password. It should be in LowerCase and have no special characters. Typing otherwise would result in your own harm.");
        	String new_pass=input.nextLine();
        	pass.createNewFile();
        	FileWriter j=new FileWriter(pass);
        	j.write(encrypt(new_pass));
        	j.close();
        }
        if(pass.exists()==true) {
        	boolean access=false;
        	String entered_pass=null;
        	try (FileReader fileStream = new FileReader(pass);
            BufferedReader bufferedReader = new BufferedReader(fileStream)) {
           String line = null;
           while ((line = bufferedReader.readLine())!= null) {
          	 entered_pass=line;
	   }   
        }
        	System.out.print("Password:");
        	String ask=input.nextLine();
        	if(ask.equals(decrypt(entered_pass))) {
        		access=true;
        		System.out.println("Access granted.");
        	}
        	else {
        		
        			System.out.println("Invalid password.");
			        Scanner for_cap=new Scanner(System.in);
			        
			        System.out.println("You must enter what we tell you to, to prove you are human(WARNING: IF YOU GET IT WRONG, ALL THE FILES WILL BE DELETED.)");
			        String captcha=grc();
			        try{
			        System.out.println("Enter " + captcha);
			        String entered_captcha=input.nextLine();
			        if(captcha.equals(entered_captcha)==false){
			          Uninstall uns=new Uninstall();
			          uns.method();
				}
			   else if(captcha.equals(entered_captcha)==true){
			          System.out.println("Ok! Run the file again!");
				}
				}
			     catch(Exception exp){
				     Uninstall n=new Uninstall();
				     n.method();
			     }
        		System.exit(0);
                	
        		}
        	}
        
        System.out.println("Samex 1.1 2021. Type help for a list of commands.");
        while(true) {
        	String inp=input.nextLine();
        	boolean inp_cd=check(inp.split(" "),"cd");
        	String with=ats(inp.split(" "));
        	String no_cd=ats(with.split("cd"));
        	String with_2=ats(with.split("dir"));
        	boolean inp_dir=check(inp.split(" "),"dir");
        	if(inp.equals("shutdown")) {
        	 System.exit(0);
          }
        	if(inp.equals("help")) {
        		System.out.println("Type \"shutdown\" to shutdown.");
        		System.out.println("Type \"content\" to see the contents of a file. ");
        		System.out.println("Type \"write\" to write into a file. ");
        		System.out.println("Type \"remove\" to delete files.");
        		System.out.println("Type \"create\" to create new files.");
        		System.out.println("Type \"exists\" to check if a file exists.");
        		System.out.println("Type \"cd [path] \" to open files");
        		System.out.println("Type \"dir [path]\" to view all the files in a directory or a folder.");
        		System.out.println("Type \"restart\" to restart.");
        		System.out.println("Type \"rename\" to rename a file.");
        		System.out.println("Type \"change password\" to change the password.");
				System.out.println("Type \"download\" to download files from the web.");
        	}
			if(inp.equals("download")){
				Scanner down=new Scanner(System.in);
				System.out.print("URL:");
				String addr=down.nextLine();
				URL ur=new URL(addr);
				System.out.print("Output file:");
				String output=down.nextLine();
				try{
					downloadFile(ur,output);
				}
				catch(Exception nn){
					System.out.println("Something went wrong.");
				}
			}
        	if(inp.equals("change password")) {
        		System.out.print("Enter your old password:");
        		String check=null;
        		String old_pass=input.nextLine();
        		try (FileReader fileStream = new FileReader(pass);
        	            BufferedReader bufferedReader = new BufferedReader(fileStream)) {
        	           String line = null;
        	           while ((line = bufferedReader.readLine())!= null) {
        	          	 check=decrypt(line);
        		   }   
        	        }
        		if(check.equals(old_pass)) {
        			System.out.print("New password:");
        			String enter_new=input.nextLine();
        			pass.delete();
        			pass.createNewFile();
        			FileWriter n=new FileWriter(pass);
        			n.write(encrypt(enter_new));
        			n.close();
        			System.out.println("New password set.");
        		}
        		else if(check.equals(decrypt(old_pass))==false){
        			System.out.println("Invalid old password.");
        		}
        	}
        	if(inp.equals("rename")){
        		System.out.println("Location:");
        		String loc=input.nextLine();
        		System.out.println("New name(with location):");
        		String new_loc=input.nextLine();
        		File old=new File(loc);
        		File new_old=new File(new_loc);
        		if(old.exists()==true&new_old.exists()==true) {
        		boolean flag=old.renameTo(new_old);
        		if(flag) {
        			System.out.println("File successfully renamed.");
        			if(flag==false) {
        				System.out.println("Failed.");
        			}
        		}
        		}
        		else {
        			System.out.println("One of the files does not exist.");
        		}
        	}
        	if(inp.equals("create")){
        		System.out.print("Enter location of the file:");
        		String loc=input.nextLine();
        		File f=new File(loc);
        		if(f.exists()==true){
        			System.out.println("The file already exists.");
        		}
        		else {
        			f.createNewFile();
        			System.out.println("File has been successfully created.");
        		}
        		f=null;
        	}
        	if(inp_cd==true) {
        		File f=new File(no_cd);
        		if(f.exists()==true) {
        			Desktop desktop=Desktop.getDesktop();
        			if(!Desktop.isDesktopSupported()) {
        				System.out.println("Not supported.");
        			}
        			else {
        				desktop.open(f);
        			}
        		}
        		f=null;
        	}
        	if(inp_dir==true){
        		File f=new File(with_2);
        		if(f.exists()==true) {
        			try {
        				System.out.println(conv(f.list()));
        			}
        			catch(java.lang.NullPointerException exp) {
        				System.out.println("Invalid directory.");
        			}
        		}
        		else {
        			System.out.println("Invalid location.");
        		}
        		f=null;
        	}
        	
        	if(inp.equals("content")) {
        		System.out.print("Location:");
        		String locat=input.nextLine();
        		 File fileToRead = new File(locat);
        		 FileWriter wr=new FileWriter(main_loc);
                 try (FileReader fileStream = new FileReader(fileToRead);
                      BufferedReader bufferedReader = new BufferedReader(fileStream)) {
                     String line = null;
                     while ((line = bufferedReader.readLine())!= null) {
                    	 System.out.println(line);
        	   }   
              }
        	 }
        	if(inp.equals("write")) {
        		System.out.print("Location:");
        		String name=input.nextLine();
        		 File file = new File(name);
                 FileWriter write = new FileWriter(file);
                 System.out.println("Enter the text you would like to write into " + file.getName());
                 String text=input.nextLine();
                 write.write(text);
                 write.close();
        	}
        	if(inp.equals("files")) {
        		System.out.println("You must be an old user, bad news. This feature has been removed for multiple reasons.");
        }
        if(inp.equals("remove")) {
        	System.out.print("location:");
        	String location_=input.nextLine();
        	File file_=new File(location);
            if(file_.delete()==true) {
            	System.out.println(file_.getName() + " has been successfully deleted.");
            }
            else {
            	System.out.println(file_.getName() + "can't be deleted for some reason.");
            }
            file_=null;
        }
        if(inp.equals("exists")){
        	System.out.print("Location:");
        	String loc=input.nextLine();
        	File f=new File(loc);
        	if(f.exists()==true) {
        		System.out.println("The file does exist.");
        	}
        	else {
        		System.out.println("The file does not exist.");
        	}
        	f=null;
        }
        if(inp.equals("restart")) {
        	System.out.println("Shutting down.");
        	Thread.sleep(4000);
        	System.out.println("\r\n"
        			+ "████████████████████████████████████████████████████████████████████████████████████████\r\n"
        			+ "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
        			+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
        			+ "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
        			+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀▄▀▄▀░░█████\r\n"
        			+ "█░░░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
        			+ "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
        			+ "█░░░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
        			+ "█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
        			+ "████████████████████████████████████████████████████████████████████████████████████████");
        	Thread.sleep(4000);
        	System.out.println("Samex 1.1 2021. Type help for a list of commands.");
        }
	}
  }    
 }
