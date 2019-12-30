package Exercises_1;

public class Engineer extends Officials {
		private int career ;

		public Engineer(String name, int age, Gender genDer, String add, int career) {
			super(name, age, genDer, add);
			this.career = career;
		}

		public int getCareer() {
			return career;
		}

		public void setCareer(int career) {
			this.career = career;
		}
		
		
}
