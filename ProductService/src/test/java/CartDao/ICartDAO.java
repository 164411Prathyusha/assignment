package CartDao;

import java.util.List;

public interface ICartDAO {

	
	public String get(long userId);

	public List<UserTransaction> getAll();

	public int add(UserTransaction product);
                                                                                                                                                                                                     
	public long remove(UserTransaction product);

	public int update(UserTransaction product, UserTransaction quantity);
	
	public int pushIntoDB(UserTransaction userId);

}
 