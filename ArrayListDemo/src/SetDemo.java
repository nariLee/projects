import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		Collection<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(3);
		A.add(2);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));	//false
		System.out.println(A.containsAll(C));	//true
		//containsAll()은 A집합에 B집합의 전체 원소가 담겨있는지 알아보는 메소드
		
		
		//A.addAll(B); //A와 B의 합집합을 A에 담는다.
		//A.retainAll(B); //A와 B의 교집합을 A에 답는다.
		//A.removeAll(B);	//A-B의 차집합을 A에 담는다.
		
		Iterator hi = (Iterator)A.iterator();	//hi는 Interator타입의 객체
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
