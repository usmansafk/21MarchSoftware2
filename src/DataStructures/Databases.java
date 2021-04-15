package DataStructures;
//Practising logic
public class Databases {

	Record[] recs = new Record[3];

	public Databases() {

		recs[0] = new Record();
		recs[1] = new Record();
		recs[2] = new Record();

		recs[0].regno = 45;
		recs[0].name = "Usman";
		recs[0].address = "UK";
		recs[0].marks = 67;

		recs[1].regno = 145;
		recs[1].name = "Bob";
		recs[1].address = "USA";
		recs[1].marks = 98;

		recs[2].regno = 99;
		recs[2].name = "Sam";
		recs[2].address = "Japan";
		recs[2].marks = 17;
	}

	
	
	public void showAll() {
		for (int i = 0; i < recs.length; i++) {
			displayRecord(recs[i]);

		}
	}

	
	public void displayRecord(Record rec) {
		System.out.println("Reg-No: " + rec.regno);
		System.out.println("Name " + rec.name);
		System.out.println("Address: " + rec.address);
		System.out.println("Marks:" + rec.marks + "\n");
	}

	
	public void recordWithMaxMarks() {
		int maxMarks = recs[0].marks;
		int maxi = 0;

		for (int i = 1; i < recs.length; i++) {
			if (recs[i].marks > maxMarks) {
				maxMarks = recs[i].marks;
				maxi = i;
			}

		}
		displayRecord(recs[maxi]);
	}
	
	
	public void recordWithSecondHighestMarks() {
		int maxMarks = recs[0].marks;
		int secondMaxMarks = recs[0].marks;
		
		for (int i = 1; i < recs.length; i++) {
			if (recs[i].marks > maxMarks) {
				maxMarks = recs[i].marks;
				System.out.println(maxMarks);
			}
			if(maxMarks > secondMaxMarks) {
				secondMaxMarks = recs[i].marks;
				System.out.println(secondMaxMarks);
			}
				
		}
			
		
		
	}

}
