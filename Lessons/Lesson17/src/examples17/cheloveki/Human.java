package examples17.cheloveki;

public class Human {
	static String[] men = { "Stiv ", "Piter ", "Bob ", "Pol ", "Gorge " };
	static String[] women = { "Pamela ", "Angelina ", "Olivia ", "Peppa ", "Odra " };
	static String[] people = { "Stiv ", "Piter ", "Bob ", "Pol ", "Gorge ", "Pamela ", "Angela ", "Olivia ", "Peppa ",
			"Odra " };
	static String[] seX = { "M ", "W " };
	String name;
	int age;
	int weight;
	String sex;

	public Human() {
		name = people[(int) (Math.random() * 10)];
		age = (int) (15 + Math.random() * 50);
		weight = (int) (30 + Math.random() * 70);
		sex = null;
		if(sex == null){///что значит иф. Он тут точно налл, ты ж его только что обнулил. 
			for(int i=0; i<men.length; i++){
				if(name==men[i]){
					sex = seX[0];
				}
			}
			if(sex==null) sex=seX[1]; ///а тут да, в тему уже проверка
		}
	}

}