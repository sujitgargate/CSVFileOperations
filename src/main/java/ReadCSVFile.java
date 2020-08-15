import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadCSVFile {

   private static final String SAMPLE_CSV_FILE_PATH = "./testCSV.csv";

   public static void main(String[] args){

      try {
         Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
         CSVReader csvReader = new CSVReader(reader);

         String[] nextRecord;
         while ((nextRecord = csvReader.readNext()) != null) {
            System.out.println("Name : " + nextRecord[0]);
            System.out.println("Email : " + nextRecord[1]);
            System.out.println("Phone : " + nextRecord[2]);
            System.out.println("Country : " + nextRecord[3]);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}