package tho.dev;
import java.sql.Connection;
import java.sql.DriverManager;

import tho.dev.data.CategoryImpl;
import tho.dev.data.OrderImpl;
import tho.dev.data.OrderItemImpl;
import tho.dev.data.ProductImpl;
import tho.dev.data.UserImpl;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		CategoryImpl categoryImpl = new CategoryImpl(conn);
		UserImpl userImpl = new UserImpl(conn);
		ProductImpl productImpl = new ProductImpl(conn);
		OrderImpl orderImpl = new OrderImpl(conn);
		OrderItemImpl orderItemImpl = new OrderItemImpl(conn);
//		categoryImpl.insert();
//		categoryImpl.update();
//		categoryImpl.delete();
		categoryImpl.select();
//		userImpl.insert();
//		userImpl.update();
//		userImpl.delete();
		userImpl.select();
//		userImpl.find(3);
//		productImpl.insert();
//		productImpl.update();
//		productImpl.delete();
		productImpl.select();
//		orderImpl.insert();
//		orderImpl.update();
//		orderImpl.delete(4);
        orderImpl.select();
//		orderImpl.find(3);
//      orderItemImpl.insert();
//      orderItemImpl.update();
//      orderItemImpl.delete(6);
        orderItemImpl.select();
//      orderItemImpl.find(5);
     
	}
	private static Connection getConnection() {
        // Tên cơ sở dữ liệu
        String DB_URL = "jdbc:mysql://localhost:3306/shop";
        // Tên ngư�?i dùng
        String DB_USER = "root";
        // Mật khẩu
        String DB_PASS = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
