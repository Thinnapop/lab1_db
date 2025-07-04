import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        
        String line;
        try 
            (BufferedReader br = new BufferedReader(new FileReader("2024 QS World University Rankings 1.1 (For qs.com).csv"))) {
                line = br.readLine();
            
            while (line != null){
                
                line = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        } 

        String filePath = "2024 QS World University Rankings 1.1 (For qs.com).csv";
        String data = "=571,601-650,Chiang Mai University,TH,Thailand,XL,FC,HI,4,A,33.8,256,19.3,466,16.4,701+,3.9,701+,5.1,701+,4.1,701+,20.9,538,17.1,495,59.2,252=,20.7";

        try {
            try (FileWriter fileWriter = new FileWriter(filePath,true)) {
                fileWriter.write("\n"+data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}

        
        
    
