package Exercises_3;

import java.util.ArrayList;

public class Admissions {
	// Create array list to save "contestant"
	private ArrayList<Contestant> listContestants;

	public Admissions() {
		listContestants = new ArrayList<Contestant>();
	}

	// Add Contestants
	public void addContestants(Contestant contestant) {
		listContestants.add(contestant);
	}

	public ArrayList<Contestant> searchListContestants(PriorityLevel priorityLevel) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		for (Contestant contestant : listContestants) {
			if (contestant.getPriorityLevel() != priorityLevel) {
				System.out.println("Identification number " + priorityLevel + " not exist !");
			} else {
				System.out.println("Identification number " + priorityLevel + " is exist !");
				list.add(contestant);
			}
		}
		return listContestants;
	}

	public void showListContestants() {
		for (Contestant contestant : listContestants) {
			contestant.show();
			System.out.println("--------------------------------------------------------------------------");
		}
	}

}
