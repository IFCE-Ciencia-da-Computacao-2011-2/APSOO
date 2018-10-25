package adapter.object;

public class Client {
	public static void main(String[] args) {
		GenericDao<People> dao = new DaoListAdapter<>();
		
		People carlos = new People("Carlos");
		dao.create(carlos);
		System.out.println(dao.all());
		
		dao.delete(carlos);
		System.out.println(dao.all());
	}
}
