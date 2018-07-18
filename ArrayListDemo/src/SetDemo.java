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
		//containsAll()�� A���տ� B������ ��ü ���Ұ� ����ִ��� �˾ƺ��� �޼ҵ�
		
		
		//A.addAll(B); //A�� B�� �������� A�� ��´�.
		//A.retainAll(B); //A�� B�� �������� A�� ��´�.
		//A.removeAll(B);	//A-B�� �������� A�� ��´�.
		
		Iterator hi = (Iterator)A.iterator();	//hi�� InteratorŸ���� ��ü
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
