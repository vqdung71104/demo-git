package hust.soict.dsai.aims.Aims;
//VŨ QUANG DŨNG - 20225818

import hust.soict.dsai.aims.cart.Cart.Carts;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
			// Tạo một giỏ hàng mới
			Carts anOrder = new Carts();
			
			// Tạo đĩa DVD đầu tiên và thêm vào giỏ hàng
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
			anOrder.addDigitalVideoDisc(dvd1);
			
			// Tạo đĩa DVD thứ hai và thêm vào giỏ hàng
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
			anOrder.addDigitalVideoDisc(dvd2);
			
			// Tạo đĩa DVD thứ ba và thêm vào giỏ hàng
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
			//anOrder.addDigitalVideoDisc(dvd3);

      /*final int MAX_NUMBERS_ORDERS = 3;
			DigitalVideoDisc[] dvdList = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
			dvdList[0] = dvd1;
			dvdList[1] = dvd2;
			dvdList[2] = dvd3;

			//add dvdList
			//anOrder.addDigitalVideoDisc(dvdList);

			//add dvd1 and dvd2
			anOrder.addDigitalVideoDisc(dvd1, dvd2);
      */
			
			// Xóa đĩa DVD thứ ba khỏi giỏ hàng
			anOrder.removeDigitalVideoDisc(dvd3);
			System.out.println("Vu Quang Dung - 20225818, Total cost after deleting dvd3: " + anOrder.totalCost());
			
			// In ra tổng giá trị của các đĩa DVD trong giỏ hàng
			System.out.println("Vu Quang Dung - 20225818, Total cost is: ");
			System.out.println(anOrder.totalCost());

			// Thử xóa một đĩa không tồn tại
			anOrder.removeDigitalVideoDisc(dvd3);

			
	}
}
