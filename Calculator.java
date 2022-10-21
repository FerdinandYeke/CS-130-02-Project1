import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		char B = 'B'; 
		char S = 'S';
		
		float num1, num2, res = 0;
		char choice = 0, contin = 0;
		NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat UK = NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat FR = NumberFormat.getCurrencyInstance(Locale.FRENCH);
		NumberFormat ITY = NumberFormat.getCurrencyInstance(Locale.ITALY);
		NumberFormat GR = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		NumberFormat CA = NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat CHN = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat KR = NumberFormat.getCurrencyInstance(Locale.KOREA);
		NumberFormat JP = NumberFormat.getCurrencyInstance(Locale.JAPAN);

		System.out.println("CalCulatoR!");
		
		do 
		{	
			System.out.println("Basic Operations are: Addition, Subtraction "
					+ "Mulitplication, and Division.");
			System.out.println("");
			System.out.println("Scientific Operations contain: Exponents,"
					+ " Square root, Sine, Cosine, Tangent, \nAbsolute value,"
					+ " Arc Sine, Arc Tangent, Ceiling, Floor, Pi,"
					+ " Logarithmic, \nLogarithmic Natrual, Logarithmic base 10,"
					+ " Euler number(e), and Euler -1 ");
			System.out.println("");
			System.out.println("Some Extras are: Currency Conversion"
					+ "(Part of Scientific Operations.)");
			System.out.println("");
			System.out.println("Enter B for Basic Operations or S "
					+ "For Scientific Operations: ");
			
			char Input = scan.next().charAt(0);
			
			if(B==Input)
			{
				System.out.println("Main Menu:");
				System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication"
						+ "\n4.Division\n5.q Exit");
				System.out.println("Enter Your Choice: ");
				
				choice = scan.next().charAt(0);
				
				switch(choice) 
				{
					case '1':
						System.out.println("Enter two Numbers For Addtion: ");
						num1 = scan.nextFloat();
						num2 = scan.nextFloat();
						
						res = num1+num2;
						
					System.out.println("The Sum of "+num1+" and "+num2+" "
							+ "is: "+res);
					break;
					

					case '2':
						System.out.println("Enter two Numbers For Subtraction: ");
						num1 = scan.nextFloat();
						num2 = scan.nextFloat();
						
						res = num1-num2;
						
					System.out.println("The Difference of "+num1+" and "+num2+" "
							+ "is: "+res);
					break;
					

					case '3':
						System.out.println("Enter two Numbers For Multiplication: ");
						num1 = scan.nextFloat();
						num2 = scan.nextFloat();
						
						res = num1*num2;
						
					System.out.println("The Product of "+num1+" and "+num2+" "
							+ "is: "+res);
					break;
					

					case '4':
						System.out.println("Enter two Numbers For Division: ");
						num1 = scan.nextFloat();
						num2 = scan.nextFloat();
						
						res = num1*num2;
						
					System.out.println("The Quotient of "+num1+" and "+num2+" "
							+ "is: "+res);
					break;
					
					
					default:
						System.out.println("Invalid Input! Please Enter a "
								+ "valid input.");
					
					case 'q':
						System.exit(0);
						break;
						
					case 'Y':
						
						continue;

						
				}	System.out.println("Would you like to continue? Y to continue"
						+ ", q to discontinue.");
				contin = scan.next().charAt(0);
				if(contin == 'q') 
				{
					System.exit(0);
				}
				
			}
			
			else if(Input == S)
			{
				System.out.println("\nA.Exponent\nB.Square Root\nC.Sine"
						+ "\nD.Cosine\nE.Tangent\nF.Absolute Value"
						+ "\nG.Arc Sine\nH.Arc Tangent\nI.Ceiling"
						+ "\nJ.Floor\nK.Pi\nL.Logarithmic\nM.Logarithmic Natrual"
						+ "\nN.Logarithmic Base 10\nO.Euler Number\nP.Euler -1"
						+ "\nQ.q Exit\nR.Currency Conversion");
					char choice2 = scan.next().charAt(0);
						
					switch(choice2) 
					{
					case 'A':
						System.out.println("Enter the number and the power");
						num1 = scan.nextFloat();
						num2 = scan.nextFloat();
						
							res = (float) Math.pow(num1, num2);
						System.out.println("The result is: "+res);
					break;
					
					case 'B':
						System.out.println("Enter the number for Square Rooting: ");
						num1 = scan.nextFloat();
						
							res = (float) Math.sqrt(num1);
						System.out.println("The result is: "+res);
					break;
					
					case 'C':
						System.out.println("Enter the angle to find the "
								+ "trigonometric sine of an angle: ");
						num1 = scan.nextFloat();
						
							res = (float) Math.sin(num1);
						System.out.println("The sine of the angle is: "+res);
					break;
						
					case 'D':
						System.out.println("Enter the angle to find the "
								+ "trigonometric cosine of an angle");
						num1 = scan.nextFloat();
							res = (float) Math.cos(num1);
						System.out.println("The Cosine of the angle is: "+res);
					break;
						
					case 'E':
						System.out.println("Enter the angle to find the "
								+ "Trigonometric tangent of an angle");
						num1 = scan.nextFloat();
							res = (float) Math.tan(num1);
						System.out.println("The Tangent of the angle is: "+res);
					break;
					
					case 'F':
						System.out.println("Enter a decimal number to find"
								+ " the absoulute value: ");
						num1 = scan.nextFloat();
							res = (float) Math.abs(num1);
						System.out.println("The absolute value is: "+res);
					break;
					
					case 'G':
						System.out.println("Enter a number to find the arc"
								+ " sine value: ");
						num1 = scan.nextFloat();
							res = (float) Math.asin(num1);
						System.out.println("The Arc Sine value is: "+res);
					break;
					
					case 'H':
						System.out.println("Enter a number to find the arc"
								+ " tangent value: ");
						num1 = scan.nextFloat();
							res = (float) Math.atan(num1);
						System.out.println("The Arc Tangent Value is: "+res);
					break;
					
					case 'I':
						System.out.println("Enter a decimal number to find"
								+ " its ceiling: ");
						num1 = scan.nextFloat();
							res = (float) Math.ceil(num1);
						System.out.println("The ceiling of the number is: "+res);
					break;
					
					case 'J':
						System.out.println("Enter a decimal number to find"
								+ " its floor: ");
						num1 = scan.nextFloat();
							res = (float) Math.floor(num1);
						System.out.println("The Floor of the number is: "+res);
					break;
					
					case 'K':
						System.out.println("Enter a number to find a result with PI: ");
						num1 = scan.nextFloat();
							res = (float) Math.PI * num1;
						System.out.println("The result is: "+res);
					break;
					
					case 'L':
						System.out.println("Enter a number to find its log: ");
						num1 = scan.nextFloat();
							res = (float) Math.log(num1);
						System.out.println("The log of the number is: "+res);
					break;
					
					case 'M':
						System.out.println("Enter a number to find its natrual "
								+ "log: ");
						num1 = scan.nextFloat();
							res = (float) Math.log1p(num1);
						System.out.println("The Natrual Log of the Number "
								+ "is: "+res);
					break;
					
					case 'N':
						System.out.println("Enter a number to find its log by base"
								+ " 10: ");
						num1 = scan.nextFloat();
							res = (float) Math.log10(num1);
						System.out.println("The result of the Log by base 10 is: "+res);
					break;
					
					case 'O':
						System.out.println("Enter a number to be the powers of e and"
								+ " to find the result: ");
						num2 = scan.nextFloat();
							res = (float) Math.exp(num2);
						System.out.println("The result of Euler raised to the powers of"
								+num2+ "is: " +res);
					break;
						
					case 'P':
						System.out.println("Enter a number to be powers of e and"
								+ " to find the result subtracted by one: ");
						num2 = scan.nextFloat();
							res = (float) Math.expm1(num2);
						System.out.println("The result of Euler raised to the powers of"
								+num2+ " subtracted by one is: "+res);
					break;
					
					case 'R':
					
						System.out.println("Country Currency");
						System.out.println("\nMain Menu:\nA.United States"
								+ "\nb.United Kingdom\nC.ITALY\nD.German"
								+ "\nE.Canada\nF.China\nG.Korea\nH.Japan");
						char CONTR = scan.next().charAt(0);
						
						if(CONTR == 'A')
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in US Currency is: "
								+US.format(CONTR2));
						}
						
						else if(CONTR == 'b')
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in UK Currency is: "
								+UK.format(CONTR2));
						}
						
						else if(CONTR == 'C')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in Italy's Currency is: "
								+FR.format(CONTR2));
						}
						else if(CONTR == 'D')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in Germany's Currency is: "
								+GR.format(CONTR2));
						}
						else if(CONTR == 'E')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in Canada's Currency is: "
								+CA.format(CONTR2));
						}
						
						else if(CONTR == 'F')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in China's Currency is: "
								+CHN.format(CONTR2));
						}
						
						else if(CONTR == 'G')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in South Korea's Currency is: "
								+KR.format(CONTR2));
						}
						
						else if(CONTR == 'H')
							
						{
							System.out.println("Enter a value: ");
							double CONTR2 = scan.nextDouble();
							System.out.println("The Value in Japan's Currency is: "
								+JP.format(CONTR2));
						}
						
						else 
						{
							System.out.println("Invalid Input! Please enter"
									+ " a valid input.");
						}
						continue;
					
					case 'q':
						System.exit(0);
						break;
						
					case 'Y':
						
						continue;
					
						default:
							System.out.println("Invalid Input! Please enter a valid input.");
					}	
			}
			
			System.out.println("Would you like to continue? Y to continue"
					+ ", q to discontinue.");
			contin = scan.next().charAt(0);
			
		}while(choice != 'q');
		
		
	}

}
