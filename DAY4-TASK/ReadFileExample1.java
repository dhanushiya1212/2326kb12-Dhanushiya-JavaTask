package task.corejava;


import java.io.*;
class ReadFileExample1 {
    public static void main(String[] args) {
        String filename="example.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            String Line;
            if((Line=br.readLine()) !=null) {
            System.out.println(Line);    
            }
        }
        catch(Exception e) {
            System.out.println("FileNotfound");
        }
    }
}