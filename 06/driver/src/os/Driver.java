/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author miten
 */
public class Driver {

    public static void main(String[] args) {







        BufferedReader br = null;

        try {

            String cl; // current line... cl is easy to write so...

            br = new BufferedReader(new FileReader("C:\\Users\\miten\\Documents\\GitHub\\src\\06\\add\\Add.asm")); // BufferReader to read file

            File file = new File("C:\\Users\\miten\\Documents\\GitHub\\src\\06\\add\\Add.hack"); // file to write
            if (!file.exists()) { //if file doesnt exist then it will create a new file
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile()); // Filewriter object to write file 
            BufferedWriter bw = new BufferedWriter(fw); // created object for bufferwriter to write
            //        br = new BufferedReader(new FileReader("F:\\qqq.asm"));

            //C:\Users\miten\Documents\GitHub\src\06\add

            while ((cl = br.readLine()) != null) { // this whille loop will fetch or read line by line
                System.out.println(cl);
                // checking whether is it instrution A or C or commented line or null line.

                if (cl.equals("")) {
                    System.out.println("null");
                } else {

                    if (cl.startsWith("@")) {
                        System.out.println("This is A instruction");
                    } else {
                        if (cl.startsWith("//")) {
                            System.out.println("This is commented line.. ");
                        } else {
                            System.out.println("This is C instruction");
                        }
                    }
                }










                bw.write(cl); // writing to destination file
                bw.write("\n"); // new line

            }
            bw.close(); // closing file after writing

        } catch (IOException e) { // handles exception
            e.printStackTrace();
        } finally { // final block
            try { // another try catch block to catch exception of close method of buffer reader.
                if (br != null) {
                    br.close(); // read buffer closing
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
