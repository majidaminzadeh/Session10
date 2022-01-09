package com.tosan.example2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;

public class Example2 {
    public static void main(String[] args) {
//        login();
        System.out.println(showBrowseFile());
//        String selectMenu = userSelectOption();
//        if(selectMenu.equals("File")){
//            showBrowseFile();
//        } else if(selectMenu.equals("exit")){
//            return;
//        }
    }

    private static int showBrowseFile() {
//        showForm();
//        letUserSelectFile();
        try {
            print();
            System.exit(0);
            return 0;
//            String file = loadFile("file.txt");
//            showFileInForm(file);
        } catch (Exception exception){
            System.out.println("Catch Exception");
            throw exception;
//            showMessage();
        } finally {
            System.out.println("Finally block");
            return 1;
        }
//        System.out.println("out of try catch");
    }

    private static void print(){
//        System.out.println("Try Block");
//        throw new Error("");
    }


    private static void showFileInForm(String file) {
    }

    private static String loadFile(String fileName) throws AccessException, FileNotFoundException, ClassNotFoundException {
        String file = fileName;
        checkIfFileHealth(file);
        checkFileFormat(file);
        checkFileSize(file);
        return file;
    }

    private static void checkFileSize(String file) throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    private static void checkFileFormat(String file) throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    private static void checkIfFileHealth(String file) throws AccessException {
        throw new AccessException("");
    }

    private static void letUserSelectFile() {
    }

    private static void showForm() {
    }

    private static String userSelectOption() {
        return "File";
    }

    private static void showMenu() {
    }

    private static void login() {
    }
}
