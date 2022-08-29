package study.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No5 {
    public static void main(String[] args) {

        List<String> products = new ArrayList<String>();
        List<Float> productsPrices = new ArrayList<Float>();
        List<String> productSold = new ArrayList<String>();
        List<Float> soldPrice = new ArrayList<Float>();



    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        Map<String, Float> map = new HashMap<String,Float>();
        for(int i = 0; i < products.size(); i++) {
            map.put(products.get(i), productPrices.get(i));
        }
        int cnt = 0;
        for(int i = 0; i < productSold.size(); i++) {
            String soldedProduct = productSold.get(i);
            if(map.get(soldedProduct) != soldPrice.get(i)) {
                cnt++;
            }
        }
        return cnt;

    }
}
