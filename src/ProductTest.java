import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("produkty.csv");
        FileWriter fileWriter = new FileWriter("temp.csv");
        Scanner scan = new Scanner(new File("temp.csv"));
        ArrayList<Product> productArrayList = new ArrayList<>();

        int c;

        while((c=fileReader.read())!=-1) {
            if (c == 59) {
                fileWriter.append((char) 13);
                continue;
            }
            fileWriter.append((char) c);
        }
            fileReader.close();
            fileWriter.close();

            while(scan.hasNextLine()){
                String productName = scan.nextLine();
                String producerName = scan.nextLine();
                double price = Double.parseDouble(scan.nextLine());
                productArrayList.add(new Product(productName,producerName,price));
        }

        System.out.println(productArrayList.toString());

        ProductOperation.setOperation(productArrayList);

        System.out.println("Suma wszystkich cen produktów: " + ProductOperation.sumPrice);
        System.out.println("Najdroższy produkt: " + productArrayList.get(ProductOperation.maxIndexPrice).toString());
        System.out.println("Najczęściej występujący producent: " + productArrayList.get(ProductOperation.maxIndexProducer).getProducerName());

    }

}
