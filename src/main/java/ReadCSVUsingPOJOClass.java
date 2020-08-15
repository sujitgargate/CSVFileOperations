import com.opencsv.bean.CsvBindByName;

public class ReadCSVUsingPOJOClass {

   @CsvBindByName
   private String name;

   @CsvBindByName
   private String email;

   @CsvBindByName
   private String phoneNo;

   @CsvBindByName
   private String country;

   @Override
   public String toString() {
      return "ReadCSVUsingPOJOClass{" +
              "name='" + name + '\'' +
              ",email='" + email + '\'' +
              ",phoneNo='" + phoneNo + '\'' +
              ",country='" + country + '\'' +
              '}';
   }
}
