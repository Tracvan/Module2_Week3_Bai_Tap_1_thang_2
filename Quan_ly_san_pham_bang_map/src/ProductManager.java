import java.security.Key;
import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, Product> productsList = new HashMap<>();
    Map<String, Product> productsList2 = new HashMap<>();


    public void addProduct(String name, Integer id, Product product) {
        productsList.put(id, product);
        productsList2.put(name, product);

    }

    public void editProduct(int id) {
        System.out.println("Nhập id sản phẩm");
        int newId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String newName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Double newPrice = scanner.nextDouble();
        Product editedProduct = new Product(newId, newName, newPrice);
        productsList.replace(id, editedProduct);
    }

    public void deleteProduct(int id) {
        productsList.remove(id);
    }

    public void display() {
        Set<Integer> displayKey = productsList.keySet();
        for (Integer product : displayKey) {
            System.out.println(productsList.get(product));
        }
    }

    public void findById(int id) {
        if (productsList.containsKey(id)) {
            System.out.println(productsList.get(id));
        } else {
            System.err.println("Id không hợp lệ");
        }
    }

    public void findByName(String name) {
        /*et<Integer> key2 = productsList.keySet();
        for(Integer product : key2){
            String findName = name.toLowerCase().trim();
            String nameInList = productsList.get(product).getName().toLowerCase();
            if(nameInList.contains(findName)){
                System.out.println(productsList.get(product));
            }*/
        System.out.println(productsList2.get(name));
    }
}
