import java.util.*;

class ProductOfNumbers {
    List<Integer> al = new ArrayList<>();
    List<Integer> prefixProduct = new ArrayList<>();

    public ProductOfNumbers() {
        al.clear();
        prefixProduct.clear();
        prefixProduct.add(1); 
    }
    
    public void add(int num) {
        al.add(num);
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1);
        } else {
            prefixProduct.add(prefixProduct.get(prefixProduct.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int size = prefixProduct.size();
        if (k >= size) {
            return 0; 
        }
        return prefixProduct.get(size - 1) / prefixProduct.get(size - 1 - k);
    }
}
