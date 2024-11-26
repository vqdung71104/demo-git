package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.cart.Cart.Carts;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class CartTest {
  public static void main(String[] args) {
      // Create a new cart
      Carts cart = new Carts();

      // Create new dvd objects and add them to the cart
      DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
      cart.addDigitalVideoDisc(dvd1);

      DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
      cart.addDigitalVideoDisc(dvd2);

      DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
      cart.addDigitalVideoDisc(dvd3);

      // Test the print method
      cart.printCart();

      // To-do: Test the search methods here
      cart.searchDVDByTitle("abc");

      //test Store class
      //create a new Store
      Store store = new Store();
      //add DVDs
      store.addDVD(dvd2);
      store.addDVD(dvd3);
      //remove DVDs
      store.removeDVD(dvd3);
      store.removeDVD(dvd3);
  }
}
