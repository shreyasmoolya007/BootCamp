import java.io.IOException;
import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File f1=new File("student.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("File"+f1.getName()+"Created Successfully");
            }
        }
        catch(IOException e){
            System.out.println("Thank You");
            e.printStackTrace();
        }
    }
}
