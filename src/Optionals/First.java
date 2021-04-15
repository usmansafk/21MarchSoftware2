package Optionals;

import java.util.Optional;

public class First {

	public static void main(String[] args) {
		RecordEmp R;
		RecordEmp ref = new RecordEmp();
		
		Optional<RecordEmp> opt = Optional.ofNullable(ref);
		
		if(opt.isPresent()) {
			R = opt.get();
			System.out.println(R.name);
		} else {
			System.out.println("No object present");
		}

	}

}









class RecordEmp {
	int regno;
	String name;
	
	public RecordEmp() {
		regno = 45;
		name = "Usman";
	}
	
}
