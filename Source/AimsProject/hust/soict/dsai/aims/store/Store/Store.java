package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
  public static final int MAX_NUMBERS_ORDERS = 20; // Số lượng tối đa đơn hàng
  private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS]; // Mảng chứa các đĩa DVD đã đặt hàng
  int qtyOrdered; // Số lượng đĩa DVD đã đặt hàng


  //add DVDs
  public void addDVD(DigitalVideoDisc disc) {
    // Kiểm tra xem số lượng đã đặt hàng có nhỏ hơn số tối đa không
    if (qtyOrdered < MAX_NUMBERS_ORDERS) {
        itemOrdered[qtyOrdered] = disc; // Thêm đĩa DVD vào mảng
        qtyOrdered++; // Tăng số lượng đĩa đã đặt
    }
}


  //remove DVDs
  public void removeDVD(DigitalVideoDisc disc) {
    boolean found = false;
    // Duyệt qua mảng để tìm đĩa DVD cần xóa
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemOrdered[i] == disc) {
            found = true;
            // Dịch chuyển các đĩa phía sau lên một vị trí
            for (int j = i; j < qtyOrdered - 1; j++) {
                itemOrdered[j] = itemOrdered[j + 1];
            }
            itemOrdered[qtyOrdered - 1] = null; // Đặt vị trí cuối cùng thành null
            qtyOrdered--; // Giảm số lượng đĩa đã đặt
            break; // Thoát khỏi vòng lặp
        }
    }
    if(!found){
        System.out.println("Vu Quang Dung - 20225818. The disc is not in the store!!!");
    }
  }
}
