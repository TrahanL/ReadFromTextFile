/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a1_readtextfilehandleexcep;

/**
 *
 * @author Lucas
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U2A1_ReadTextFileHandleExcep {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        File file = new File("courses.txt");
        
        try {
            Scanner input = new Scanner(file);
        
            while(input.hasNextLine()) {
                String courseCode = input.next();
                int creditHours = input.nextInt();
                String title = input.nextLine();

                System.out.printf("Course Code = %s | Credit hours = %d | Course title = %s\n",courseCode,creditHours,title);
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.err.format("File Not Found\n");
        }
        }
    }
