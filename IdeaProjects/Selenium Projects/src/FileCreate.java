import java.io.File;
import java.io.FileWriter;

public class FileCreate {
    public static void main(String[] args){
        try{
//            File myFileWritle = new File("C://Users//91912//Desktop//javaCreatedFile.txt");

            FileWriter myFileWrite = new FileWriter("javaCreatedFile.txt");
            myFileWrite.write(" You Have Successfully Created Java File ");
            myFileWrite.close();

            System.out.println(" File Written Successfully ");
//            if(myFile.createNewFile()){
//                System.out.println("File Created : " + myFile.getName());
//            }else {
//                   System.out.println(" File Already Exists. ");
//            }
        }catch (Exception e){
            System.out.println("An Error Occured. ");
            System.out.println("Error:" + e);
        }

    }
}
