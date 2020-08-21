package generics;

public interface StackInterface<T> {
	void push(T newEntry);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void clear();

}
