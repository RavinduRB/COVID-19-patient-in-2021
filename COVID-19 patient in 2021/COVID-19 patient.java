import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\tCOVID-19 patient in 2021");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------\n\n");
		System.out.println("\tJanuary   February March   April   May     June    July    August  SeptemberOctomberNovemberDecember");
		
		Random r=new Random();
		int[][] marks=new int[N][13];
		
		//--------------Read marks------------
		for(int j=1; j<N; j++){
			for(int k=1; k<13; k++){
				marks[j][k]=r.nextInt(500);
						
			}
		}
		
		for(int i=1; i<=N; i++){
			System.out.println(i);
		}
		for(int j=1; j<N; j++){
			System.out.print("\t");
			for(int k=1; k<13; k++){
				System.out.print(marks[j][k]+"\t");
			}
			System.out.println();
		}

	}
}
