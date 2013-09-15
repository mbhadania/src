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

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\Users\\miten\\Documents\\GitHub\\src\\06\\add\\Add.asm"));
            File file = new File("C:\\Users\\miten\\Documents\\GitHub\\src\\06\\add\\Add.hack");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //        br = new BufferedReader(new FileReader("F:\\qqq.asm"));

            //C:\Users\miten\Documents\GitHub\src\06\add

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                bw.write(sCurrentLine);
                bw.write("\n");

            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
