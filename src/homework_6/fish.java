package homework_6;


	
		public class fish extends Animal{
			boolean isAngry;
			
			public fish (String name ,int age,String breed ) {
				super(name,age,breed);
			}
			
			public void swim() {
				System.out.println("swim");
			}

}