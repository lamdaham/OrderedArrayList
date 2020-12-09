import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
	public NoNullArrayList() {
		super();
	}

	public NoNullArrayList(int initialCapacity) {
		super(initialCapacity);
	}


	public T set(int index, T value){
		if (value==null) {
			throw new IllegalArgumentException();
		}
		return super.set(index, element);
	}


	public T add(T value) {
		if (value==null) {
			throw new IllegalArgumentException();
		}
		return super.add(value);
	} 


	public T add(int index,T value) {
		if (value==null) {
			throw new IllegalArgumentException();
		}
		return super.add(index, value);
	}

}