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

	public ArrayList<Contestant> searchListContestants(String priorityLevel) {

		ArrayList<Contestant> listContestants = new ArrayList<Contestant>();

		for (Contestant contestant : listContestants) {
			if (contestant.getFullName() == priorityLevel) {
				listContestants.add(contestant);
			} else {
				System.out.println("Identification number " + priorityLevel + "not exist !");
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
