package Exercises_3;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("PROGRAM MANAGER INFORMATION OF CONTESTANTS");
		Admissions admissions = new Admissions();
		Contestant_Block_A contestant_Block_A = new Contestant_Block_A("SICT1", "Kenneth", "Vietnam", Block.block_A,
				PriorityLevel.AREA_1, "Math", "Phycical", "Chemistry");
		Contestant_Block_B contestant_Block_B = new Contestant_Block_B("SICT2", "Chị 7", "Vietnam", Block.block_A,
				PriorityLevel.AREA_1, "Math", "Chemistry", "Biological");
		Contestant_Block_C contestant_Block_C = new Contestant_Block_C("SICT3", "Trung Kỳ", "Vietnam", Block.block_A,
				PriorityLevel.AREA_1, "Literature", "History", "Geography");
		
		admissions.addContestants(contestant_Block_A);
		admissions.addContestants(contestant_Block_B);
		admissions.addContestants(contestant_Block_C);
		admissions.showListContestants();
		System.out.println("Result search !");
		System.out.println(admissions.searchListContestants(PriorityLevel.AREA_1));
	}
	
}
