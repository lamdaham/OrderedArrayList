import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {
		super();
	}

	public OrderedArrayList(int initialCapacity) {
		super(initialCapacity);
	}


	public boolean add(T element) {
		if (size()==0) {
			super.add(element);
			return true;
		}
		for (int i = 0; i<size(); i++) {
			if (element.compareTo(super.get(i))<0) {
				super.add(i, element);
				return true;
			}
		}
		super.add(element);
		return true;
	}

	public void add(int index, T element) {
		add(element);
	}


	public T set(int index, T element) {
		super.remove(index);
		this.add(element);
		return element;
	}
		
}