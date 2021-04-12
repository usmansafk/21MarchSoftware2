class Division{

	public static void main (String[] args){

		int first, second, result = 0;

		try{
			first = Integer.parseInt(args[0]);
			second = Integer.parseInt(args[1]);
			result =  first / second;

		}
		catch(ArithmeticException a){
			System.out.println("You can not divide with zero");
		}
		catch(IndexOutOfBoundsException b){
			System.out.println("Please only enter two numbers");
		}
		catch(NumberFormatException c){
			System.out.println("Please only enter numerics");
		}

		System.out.println("Result: " + result);

	}
}



