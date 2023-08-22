
public interface IGenQ<T> { //use of <T> indicates it is now a generic interface
	void put(T ch); //accepts something of type T
	T get(); //returns something of type T
}
