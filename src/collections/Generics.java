package collections;

class StoreData<T>
{
	T data;
	void add(T data)
	{
		this.data=data;
	}
}
public class Generics {

	public static void main(String[] args) {
		
		StoreData<String> st=new StoreData<String>();
		st.add("ABC");
		System.out.println(st.data);

	}

}
