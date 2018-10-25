package adapter.object;

import java.util.ArrayList;
import java.util.List;

/**
 * DaoListAdapter adapta uma lista para que esta seja acessada como um DAO.
 */
public class DaoListAdapter<T> implements GenericDao<T> {
	private ArrayList<T> data;

	public DaoListAdapter() {
		this.data = new ArrayList<>();
	}

	@Override
	public void create(T t) {
		data.add(t);
	}
	
	/**
	 * Changes in list are don't sense
	 */
	public void update(T t) {}

	@Override
	public void delete(T t) {
		data.remove(t);
	}

	@Override
	public List<T> all() {
		return data;
	}
}
