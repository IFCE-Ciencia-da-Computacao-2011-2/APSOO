package adapter.object;

import java.util.List;

public interface GenericDao<T> {
	public void create(T t);
	public void update(T t);
	public void delete(T t);
	public List<T> all();
}
