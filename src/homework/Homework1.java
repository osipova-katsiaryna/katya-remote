package homework;

public class Homework1 {

	
			 //Создать пустой проект в IntelliJ IDEA и прописать метод main();
				public static void main(String[] args) {
					
					//Создать переменные всех пройденных типов данных, и инициализировать их значения;
			    
					short shor= 1;
					byte byt = 2;
					int in = 23;
					long lon = 1234;
					float floa = 2.3f;
					double doubl = 5.6;
					char z = 'd';
					boolean g = true;
					String name = "Kate";
			    int year = 2020;
			    
			    result(1,2,3,4);
			    sumVerify(in, 8);
			    positiveNegative(in);
				negative(in);
			    name(name);
			    leapYear(year); 

				}
			  
			  //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
			  
			  public static double result (int a, int b, int c, int d) {
					return a * (b + (c / d));
				}
			  
			   //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
			  
				public static boolean sumVerify(int a, int b) {
					int sum = a + b;
					if (sum > 10 && sum <= 20) {
						return true;
					} else {
						return false;
					}
				}
			  
			  //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное;
			    // Замечание: ноль считаем положительным числом.
			    
			    public static void positiveNegative(int a) {
					if (a >= 0) {
						System.out.println(a + " " + "is positive");
					} else {
						System.out.println(a + " " + "is negative");

					}
				}
			  
			   //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
			   
			   public static boolean negative(int a) {
					if (a < 0) {
						return true;
					} else {
						return false;
					}
				}
			  
			  //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
			  
			  public static void name(String name) {
					System.out.println("Hello, the name you entered is" + " " + name);
				}

			//Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
			    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
			    
			public static void leapYear(int year) {
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println(year + " " + " is leap year");
					} else {
						System.out.println(year + " " + " is  not leap year");
					}
				}
	}


