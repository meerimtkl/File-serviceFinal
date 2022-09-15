package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class Demo4Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
//        try {
//            Path path = Paths.get("Datatest");
//            if (Files.exists(path)) {
//                System.out.println("exist");
//            } else {
//                Path pathReady = Files.createDirectory(path);
//                System.out.println("created");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Path path = Paths.get("Datatest/test.txt");
//            if (Files.exists(path)) {
//                System.out.println("File is already exists");
//            } else {
//                Path pathCreate = Files.createFile(path);
//                System.out.println("File is created:" + pathCreate);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

     //   FileOutputStream fos = null;
    //    FileWriter writer=null;

     //   String text = " and Python";
//        FileInputStream fis=null;
//        int symbol=0;
//
//        try {
//          //  fos = new FileOutputStream("Datatest/test.txt");
//            //fos.write(text.getBytes());
//         //   writer=new FileWriter("Datatest/test.txt",true);
//         //   writer.write(text);
//            fis=new FileInputStream("Datatest/test.txt");
//            while((symbol=fis.read())!=-1){
//                System.out.println((char)symbol);
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            try {
//              //  fos.close();
//             //   writer.close();
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

}
