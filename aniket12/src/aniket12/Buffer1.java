package aniket12;

public class Buffer1 {
public static void main(String[] args) {
	StringBuffer b=new StringBuffer();
	 System.out.println(b.capacity());
	 System.out.println(b.append("aniketthoripakkamasss"));
	 System.out.println(b.capacity());
	 System.out.println(b.insert(5,"d"));
	 System.out.println(b.replace(2, 5, "wwww"));
	System.out.println(b.delete(7,9));

}
}
