import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {
		super();
	}

	public OrderedArrayList(int initialCapacity) {
		super(initialCapacity);
	}


	public void add(T element) {
		for (int i = 0; i<size(); i++) {
			if (get(i)>element) {
				super.add(i-1, element);
			}
		}
	}

	public void add(int index, T element) {
		add(element);
	}
}