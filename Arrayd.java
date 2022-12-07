package ArrayPractice;

import java.util.Scanner;

public class Arrayd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayd ar = new Arrayd();
		//ar.add();
		//ar.program1();
		//ar.program2();
		//ar.program3();
		//ar.mark_quartely();
		//ar.mark_half();
		//ar.finalmark();
	//	ar.total_mark();
		//ar.ebill();
		//ar.delivery();
		//ar.delivery_expenses();
		//ar.part_time_working_hours(); 
		//ar.zomato();
		
		

	}


	private void zomato() {
		
		System.out.println("total working hour: "+part_time_working_hours()+" hours");
		int f_amount=delivery()-delivery_expenses();
		System.out.println("ramaining:"+f_amount);
	}


	private int part_time_working_hours() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter working hour  day length: ");
				int day=sc.nextInt();
				int[] hour=new int[day];
				int total_hour=0;
				for(int i=0;i<hour.length;i++) {
					System.out.println("Enter working hour in per day: "+i);
					
					hour[i]=sc.nextInt();
					total_hour=total_hour+hour[i];
				}
				//System.out.println("Total working hour: "+total_hour);	
				return total_hour;
	}


	private int delivery_expenses() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter expense day length: ");
				int expense=sc.nextInt();
				int[] outcome=new int[expense];
				int total_expense=0;
				for(int i=0;i<outcome.length;i++) {
					System.out.println("Enter expenses day: "+i);
					
					outcome[i]=sc.nextInt();
					total_expense=total_expense+outcome[i];
				}
				System.out.println("total expense: "+total_expense);
				return total_expense;
		
	}


	private int delivery() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary  day length: ");
		int day=sc.nextInt();
		int[] income=new int[day];
		int total_income=0;
		for(int i=0;i<income.length;i++) {
			System.out.println("Enter salary day: "+i);
			
			income[i]=sc.nextInt();
			total_income=total_income+income[i];
		}
		System.out.println("total income: "+total_income);
		return total_income;
		
	}


	private void ebill() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total bill");
		int bill_length=sc.nextInt();
		int[] bill=new int[bill_length];
		int total=0;
		for(int i=0;i<bill.length;i++) {
			System.out.println("Enter month: "+i);
			bill[i]=sc.nextInt();
		    total=total+bill[i];	
		}
		System.out.println("one year total bill: "+ total);
		System.out.println("average of:"+total/bill_length);
		
		
	}


	private void total_mark() {
		// TODO Auto-generated method stub
		int total=0;
		total=mark_quartely()+mark_half()+finalmark();
		System.out.println("all exam total marks:"+ total);
		System.out.println("percentege:"+total/3);
		
	}


	private int finalmark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the final marks length:");
		int final_mark=sc.nextInt();
		int[] final_ly=new int[final_mark];
		int total3=0;
		for(int i=0;i<final_ly.length;i++) {
			System.out.println("Enter final yearly mark sub: "+i);
			final_ly[i]=sc.nextInt();
			total3=total3+final_ly[i];
			
		}
		return total3;
		
		
	}


	private int mark_half() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the half marks length:");
		int half=sc.nextInt();
		int[] halfly=new int[half];
		int total2=0;
		for(int i=0;i<halfly.length;i++) {
			System.out.println("Enter half yearly mark sub: "+i);
			halfly[i]=sc.nextInt();
			total2=total2+halfly[i];
			
		}
		return total2;
		
	}


	private int mark_quartely() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quartly marks length:");
		int quart=sc.nextInt();
		int[] quartly=new int[quart];
		int total1=0;
		for(int i=0;i<quartly.length;i++) {
			System.out.println("Enter Quartly mark sub: "+i);
			quartly[i]=sc.nextInt();
			total1=total1+quartly[i];
			
		}
		return total1;
	}


	private void mark_calculation() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks length:");
		int quartely =sc.nextInt();
		int[] quart=new int [quartely];
		
		int halfearly =sc.nextInt();
		int[] half=new int [halfearly];
		
		int finalyear =sc.nextInt();
		int[] finalmark=new int [finalyear];
		int total=0;
		for(int i=1;i<quart.length;i++) {
			
			quart[i]=sc.nextInt();
		}
			for(int j=1;j<half.length;j++) {
				System.out.println("Enter Half yearly marks:");
				half[j]=sc.nextInt();
			}
				for(int k=1;k<finalmark.length;k++) {	
					System.out.println("Enter final marks:");
					finalmark[k]=sc.nextInt();		
					}
				
	}


	private void program3() {
		// TODO Auto-generated method stub
		for(int row=5;row>0;row--) {
			for(int col=6-row;col<=5;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}


	private void program2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=6-row;col>0;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}


	private void program1() {
	  for(int row=1;row<=5;row++) {
		  for(int col=1;col<row;col++) {
			  System.out.print("  ");
		  }
		  for(int star=1;star<=6-row;star++) {
			  System.out.print("* ");
		  }
		 
		  System.out.println();
	  }
		 
	}


	private void add() {
		// Scanner sc=new S canner(System.in);
		// System.out.println ("Enter The Length:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int len = sc.nextInt();
		int[] marks = new int[len];
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter Marks: "+i);
			marks[i] = sc.nextInt();
			total = total + marks[i];

		}
		System.out.println("Total is " + total);
		System.out.println("Percentage is " + total / len);

	}

}
