package CartDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CartDAO implements ICartDAO{

	
private JdbcTemplate jdbcTemplate;
private static int transactionId;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	ArrayList<UserTransaction> list = new ArrayList<UserTransaction>();
	Map<Integer,ArrayList<UserTransaction>> usertran = null;
	
	
	public String get(long userId) {
		String orac = "select * from UserTransaction where userId = ?";
		/*String user = jdbcTemplate.queryForObject(orac, 
	         new Object[]{userId}, new RowMapper());*/
	      
	      return null;
	
	}

	public List<UserTransaction> getAll() {
		
		return null;
	}

	public int add(UserTransaction product) {
		 String query="insert into usertransaction values(1,'"+product.getUserId()+"','"+product.getProductId()+"','"+product.getProductName()+"','"+product.getQuantity()+"','"+product.getProductPrice()+"','"+product.getTotal()+"')";  
		    return jdbcTemplate.update(query); 
		   	
	}

	public long remove(long product) {
		String query="delete from Productid where product='"+product+"' ";    
	    return jdbcTemplate.update(query);  
	
	}

	public int update(UserTransaction product, UserTransaction quantity) {
		String query="update Product set productName='"+product.getProductName()+"',productPrice='"+product.getProductPrice()+"' where ProductId='"+product.getProductId()+"' ";  
	   String query1="update quantity set productName='"+quantity.getProductName()+"',productPrice='" + quantity.getProductPrice()+"' where ProductId='"+ quantity.getProductId()+"'";
	   return jdbcTemplate.update(query);
	}

	public int pushIntoDB(UserTransaction userId) {
		
		return 0;
	}


	public long remove(UserTransaction product) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
