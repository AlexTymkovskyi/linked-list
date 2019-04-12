package practick;

public class Main {

    public static void main(String[] args) {
	LinkedList list = new LinkedList();
	// element=null

		int first=5;
		list.add(first);
		//element.data=5
		//element.next=null
		//5
		int second=7;
		list.add(second);
		//element.data=5
		//element.next=element2
		//element2.data=7
		//element2.next=null
		int third=9;
		list.add(third);
		//list.get(3);
		int four=17;
		list.add(four);
		System.out.println(list.get(2));
		//System.out.println(list.delete(2));
		//System.out.println(list.size());


    }
}
