public class example{
	public static void main(String[] args) {
		Havkers elliot = new Hackers(32, "elliot");
		System.out.printf(elliot.getName());
	}

	class Hackers{
		int age;
		String name;
		public Hackers(int a, String n){
			age = a;
			name = n;
		}
		public String getName(){
			return name;
		}
	}
}