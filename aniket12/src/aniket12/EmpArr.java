package aniket12;
import java.util.ArrayList;
public class EmpArr {

	
	public static void main(String[] args) {
		ArrayList<Empp> list =new ArrayList<Empp>();
		Empp emp1 = new Empp(201,"Aniket","maharashtra",22000,703857482);
		Empp emp2 =new Empp(202,"Anu","Andhra",23000,9763530194L);
		Empp emp3 =new Empp(203,"Abin","maharashtra",240000,976353019);
		Empp emp4 =new Empp(204,"Abdus","maharashtra",22000,9763530194L);
		Empp emp5 =new Empp(205,"sai","maharashtra",250000,976353052l);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		sortById sbi = new sortById();
		Collection.sort(list);
		System.out.println(list);
	//	for(Empp em:list) {
		//	System.out.println(em);
	//	}
		
	}

	

}

