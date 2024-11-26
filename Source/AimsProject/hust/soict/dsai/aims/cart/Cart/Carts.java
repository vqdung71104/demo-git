package hust.soict.dsai.aims.cart.Cart;
//VŨ QUANG DŨNG - 20225818

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Carts {
    public static final int MAX_NUMBERS_ORDERS = 20; // Số lượng tối đa đơn hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS]; // Mảng chứa các đĩa DVD đã đặt hàng
    int qtyOrdered; // Số lượng đĩa DVD đã đặt hàng

    // Phương thức thêm đĩa DVD vào giỏ hàng
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Kiểm tra xem số lượng đã đặt hàng có nhỏ hơn số tối đa không
        if (qtyOrdered < MAX_NUMBERS_ORDERS) {
            itemsOrdered[qtyOrdered] = disc; // Thêm đĩa DVD vào mảng
            qtyOrdered++; // Tăng số lượng đĩa đã đặt
        }
    }
        /*
    public boolean addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        //add a list of DVDs to the current cart
        if(dvdList.length<MAX_NUMBERS_ORDERS){
            for(qtyOrdered = 0; qtyOrdered < dvdList.length;qtyOrdered++){
                itemsOrdered[qtyOrdered] = dvdList[qtyOrdered];
            }
            System.out.println("VUQUANGDUNG-20225818-The dvd has been added.");
            return true;
        }
        else{
            System.out.println("VUQUANGDUNG-20225818-The cart is almost full.");
            return false;
        }
    }*/
    /*
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        //add a pair of DVDs to the current cart
        if(qtyOrdered >= MAX_NUMBERS_ORDERS -1){
            System.out.println("Vu Quang Dung -20225818 -The cart is full!!!");
        }else{
            itemsOrdered[qtyOrdered] = dvd1; // Thêm đĩa DVD vào mảng
            qtyOrdered++; // Tăng số lượng đĩa đã đặt
            System.out.println("VUQUANGDUNG-20225818-The dvd has been added.");
            itemsOrdered[qtyOrdered] = dvd2; // Thêm đĩa DVD vào mảng
            qtyOrdered++; // Tăng số lượng đĩa đã đặt\
            System.out.println("VUQUANGDUNG-20225818-The dvd has been added.");
        }
    }*/

    // Phương thức xóa đĩa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        // Duyệt qua mảng để tìm đĩa DVD cần xóa
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                // Dịch chuyển các đĩa phía sau lên một vị trí
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Đặt vị trí cuối cùng thành null
                qtyOrdered--; // Giảm số lượng đĩa đã đặt
                break; // Thoát khỏi vòng lặp
            }
        }
        if(!found){
            System.out.println("Vu Quang Dung - 20225818. The disc is not in the cart!!!");
        }
    }

    // Phương thức tính tổng giá trị của các đĩa DVD trong giỏ hàng
    public float totalCost() {
        float total = 0.0f; // Khởi tạo tổng giá trị
        // Duyệt qua mảng để tính tổng giá trị
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); // Cộng dồn giá của từng đĩa DVD
        }
        return total; // Trả về tổng giá trị
    }

    public void printCart() {
        System.out.println("*****************************VuQuangDung-20225818's cart***********");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("***************************************");
    }
    
    public void searchItem(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("VuQuangDung-20225818 The disc is found.");
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("VuQuangDung-20225818 The disc is not found.");
    }
    
    public boolean isMatch(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    
    public void searchDVDByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("VUQUANGDUNG-20225818 The disc is not found.");
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("VuQuangDung-20225818 The disc '" + title + "' is not found.");
        return;
    }
    
}
