package Uppgifter;

import java.util.Scanner;
import java.io.File;

public class FileCrawler {
    public static void main(String[] args) {
        try {
            File fileBase = new File("S:\\VisualStudio\\JavaTraining\\Uppgifter\\DocumentFc\\stupid.txt");
            printInfo(fileBase);

        } catch (Exception e) {
            System.out.println("oops");
        }
    }

    public static void printInfo(File file) {
        Scanner scanner = null;
        Scanner fileScanner = null;
        
        try {
            System.out.println("Hi! Enter search word:");
            scanner = new Scanner(System.in);
            String search = scanner.nextLine();

            fileScanner = new Scanner(file);
            if (file.isFile() && fileScanner.nextLine().contains(search)) {
                while (fileScanner.hasNextLine()) {
                    System.out.println("Word found in File: " + file.getName());
                    break;
                }

            } else if (file.isDirectory()) {
                System.out.println("Word not found. Try this Folder: " + file.getCanonicalPath());

                File[] folderContents = file.listFiles();
                for (int i = 0; i < folderContents.length; i++) {
                    File f = folderContents[i];
                    printInfo(f);
                }
            }

        } catch (Exception e) {
            System.err.println("oops. Something went wrong.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }

}
