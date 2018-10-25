package adapter.object;

import java.util.List;

public class HibernateGenericDao<T> implements GenericDao<T> {

	@Override
	public void create(T t) {}

	@Override
	public void update(T t) {}

	@Override
	public void delete(T t) {}

	@Override
	public List<T> all() {
		return null;
	}
}
