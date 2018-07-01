import java.util.ArrayList;

public class ProductOperation  {
    static int maxIndexPrice = 0;
    static int maxIndexProducer = 0;
    static double sumPrice=0;


    public static void setOperation(ArrayList<Product> productArrayList){
        double maxPrice = productArrayList.get(0).getPrice();
        int maxCountProducer = 0;

        for(int i=0;i<productArrayList.size();i++) {
            sumPrice += productArrayList.get(i).getPrice();
            if (maxPrice < productArrayList.get(i).getPrice()) {
                maxPrice = productArrayList.get(i).getPrice();
                maxIndexPrice = i;
            }
            int maxCountProducerTemp = 0;
            for (int j=0;j<productArrayList.size();j++) {
                if (productArrayList.get(i).getProducerName() == productArrayList.get(j).getProducerName()) {
                    maxCountProducerTemp++;
                }
            }
            if(maxCountProducer<maxCountProducerTemp){
                maxIndexProducer=i;
            }

        }

    }
}
