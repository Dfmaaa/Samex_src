import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
public class Updates{
    public static void downloadFile(URL url, String fileName) throws Exception {
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
    }
    static String read(String location)throws IOException{
        File f=new File(location);
        String text="";
        try (FileReader fileStream = new FileReader(f);
             BufferedReader bufferedReader = new BufferedReader(fileStream)) {
            String line = null;
            while ((line = bufferedReader.readLine())!= null) {
                text=line;
            }
        }
        return text;
    }
    public static void main(String[] args) throws Exception {
        URL check=new URL("https://samexofficial.github.io/updates_ver.txt");
        try{
		File upd=new File("update_verify.txt");
        downloadFile(check,"update_verify.txt");
        String see=read("update_verify.txt");
		String ver=read("samex_version.txt");
		upd.delete();
        if(see.equals(ver)){
            System.out.println("No updates!");
        }
        else if(see.equals(ver)==false){
                System.out.println("Updating...");
                File samex=new File("Samex.class");
                File samexRun=new File("SamexRun.class");
                File uninstall=new File("Uninstall.class");
                File helphtml=new File("Samex help page.html");
                File helpy=new File("Samex Interactive Help.py");
                URL update_1=new URL("https://samexofficial.github.io/Samex.class");
                URL update_2=new URL("https://samexofficial.github.io/SamexRun.class");
                URL update_3=new URL("https://samexofficial.github.io/Uninstall.class");
                URL update_4=new URL("https://samexofficial.github.io/Samex_help_page.html");
                URL update_5=new URL("https://samexofficial.github.io/Samex_Interactive_Help.py");
                System.out.println("Updating Samex.class");
                samex.delete();
				System.out.println("old file deleted");
                downloadFile(update_1,"Samex.class");
                System.out.println("Updating SamexRun.class");
				System.out.println("old file deleted.");
                samexRun.delete();
                downloadFile(update_2,"SamexRun.class");
                System.out.println("Updating Uninstall.class");
                uninstall.delete();
				System.out.println("old file deleted.");
                downloadFile(update_3,"Uninstall.class");
                System.out.println("Updating Samex help page.html");
                helphtml.delete();
				System.out.println("old file deleted.");
                downloadFile(update_4,"Samex help page.html");
                System.out.println("Updating Samex Interactive help.py");
                helpy.delete();
				System.out.println("old file deleted.");
                downloadFile(update_5,"Samex Interactive Help.py");
                System.out.println("Finished! You can use Samex now!");
				File version=new File("samex_version.txt");
	            FileWriter verw=new FileWriter(version);
                verw.write(see);
	            verw.close();
        }
		}
		catch(Exception e){
			System.out.println("Something went wrong. Try it again a few times. If it still doesn't work, email sameerkw23@gmail.com");
		}
    }
}