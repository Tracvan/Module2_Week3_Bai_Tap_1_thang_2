import java.util.*;

import java.util.Scanner;

    public class ProductManagerTest {
        public static void main(String[] args) {
            Product product1 = new Product(1, "apple", 2);
            Product product2 = new Product(2, "orange", 2.5);
            Product product3 = new Product(3, "Strawberry", 5);
            Product product4 = new Product(4, "Banana", 1);
            ProductManager productList = new ProductManager();

            productList.addProduct(product1.getName(),product1.getId(),product1);
            productList.addProduct(product2.getName(),product2.getId(),product2);
            productList.addProduct(product3.getName(),product3.getId(),product3);
            productList.addProduct(product3.getName(),product4.getId(),product4);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu");
                System.out.println("1. Hiển thị tất cả sản phẩm");
                System.out.println("2. Thêm sản phẩm");
                System.out.println("3. Sửa sản phẩm");
                System.out.println("4. Xóa sản phẩm");
                System.out.println("5. Tìm sản phẩm theo Id");
                System.out.println("6. Tìm sản phẩm theo tên");
                System.out.println("7. Hiển thị sản phẩm theo giá giảm dần");
                System.out.println("0. Thoát");


                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        productList.display();
                        break;
                    case 2:
                        System.out.println("Hãy nhập id sản phẩm");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Hãy nhập tên sản phẩm");
                        String name = scanner.nextLine();
                        System.out.println("Hãy nhập giá sản phẩm");
                        double price = scanner.nextDouble();
                        Product product = new Product(id, name, price);
                        productList.addProduct(product.getName(),product.getId(),product);
                        System.out.println("Đã thêm thành công");
                        break;
                    case 3:
                        System.out.println("Hãy nhập id sản phẩm cần sửa: ");
                        int editedId = scanner.nextInt();
                        productList.editProduct(editedId);
                        break;
                    case 4:
                        System.out.println("Hãy nhập id sản phẩm cần xóa");
                        int deletedId = scanner.nextInt();
                        scanner.nextLine();
                        productList.deleteProduct(deletedId);
                        break;
                    case 5:
                        System.out.println("Nhập id sản phẩm cần tìm");
                        int idNumber = scanner.nextInt();
                        scanner.nextLine();
                        productList.findById(idNumber);
                        break;
                    case 6:
                        System.out.println("Nhập tên cần tìm: ");
                        String findName = scanner.nextLine();
                        productList.findByName(findName);
                        break;

                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }

            }
        }
    }


