package Uppgifter;

import java.util.Scanner;
import java.io.File;

public class FileCrawler {
    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            File fileBase = new File("Uppgifter/DocumentFc/");

            System.out.println("Hi! Enter search word:");
            scanner = new Scanner(System.in);
            String search = scanner.nextLine();

            printInfo(fileBase, search);

        } catch (Exception e) {
            System.out.println("oops");
        }
    }

    public static void printInfo(File file, String search) {
        try {
            if (file.isFile()) {
                check(file, search);

            } else if (file.isDirectory()) {
                File[] folderContents = file.listFiles();
                for (int i = 0; i < folderContents.length; i++) {
                    File f = folderContents[i];
                    printInfo(f, search);
                }
            }
        } catch (Exception e) {
            System.out.println("Holymoly");
        }
    }

    public static void check(File file, String search) {

        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                if (fileScanner.next().equals(search)) {
                    System.out.println(search + " found in file: " + file.getName());
                    break;
                }
            }

        } catch (Exception e) {
            System.err.println("oops. Something went wrong.");

        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }

}
