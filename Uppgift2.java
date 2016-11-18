import java.util.*;

public class Uppgift2 {

	public static void main(String[] args) {
		List<Integer> fancy = new ArrayList<Integer>();
		fancy.add(1);
		fancy.add(2);
		fancy.add(3);
		
		print(fancy);
		reverse( fancy);
		print(fancy);

	}
	public static <T> void print(Collection<T> l){
		Iterator<T> a = l.iterator();
		System.out.print("[");
		while(a.hasNext()){
			System.out.print(a.next().toString());
			if(a.hasNext()){
				System.out.print(",");
			}
		
		}
		System.out.println("]");
	}
	public static <T> List<T> reverse(List<T> l){
		int k = l.size();
		for(int i = k-1; i >=0;i--){
			l.add(l.get(i));
			l.remove(i );

		}
		return l;
	}
}