package LearnJava;

import java.io.File;

public class ChaneReadMe {
    public static void main(String[] args){
        File myFile = new File("weadme.txt");
        System.out.println(myFile.canWrite());
    }
}