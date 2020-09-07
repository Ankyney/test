package acazia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Category> lsp = new ArrayList<>();
        lsp.add(new Category("tu lanh", "tl"));
        lsp.add(new Category("may tinh", "mt"));
        lsp.add(new Category("abc", "abc"));


        ArrayList<Product> sp = new ArrayList<>();
        sp.add(new Product("may tinh macbook", "mt", 36.1));
        sp.add(new Product("may tinh dell", "mt", 17.1));
        sp.add(new Product("may tinh asus", "mt", 17.1));
        sp.add(new Product("may tinh lenovo", "mt", 15.1));
        sp.add(new Product("tu lanh aaaa", "tl", 8.1));
        sp.add(new Product("tu lanh cici", "tl", 5.1));

        sp.add(new Product("tu lanh xxu", "tl", 9.8));
        sp.add(new Product("tu lanh ppip", "tl", 5.8));
        sp.add(new Product("tu lanh biii", "tl", 3.8));
        sp.add(new Product("tu lanh biii", "abc", 3.8));


        Scanner timsp = new Scanner(System.in);
        System.out.println("Hãy chọn tag bạn muốn hiển thị :");
        String tag = timsp.nextLine();


        ArrayList<Product> sp1 = new ArrayList<>();
        for (Product product : sp) {
            if (product.getCategoryTag().equals(tag)) {
                sp1.add(product);
            }
        }
        for (Product product : sp1) {
            System.out.println("Dữ liệu theo tag chưa đc sắp xếp");
            product.xuat();
            System.out.println();

        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Sắp xếp theo tên sản phẩm tăng dần và giá giảm dần: ");
        Collections.sort(sp1, new SortByName());
        Collections.sort(sp1, new SortByPrice());
        for (Product x : sp1) {
            System.out.println(x);
        }



    }

}








