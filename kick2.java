import java.util.Scanner;

public class kick2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("MALLA REDDY INSTITUTE OF ENGINEERING AND TECHNOLOGY");
        System.out.println("NUMBER OF STUDENTS");
        int num = Integer.parseInt(sc.nextLine());
        String[] name = new String[num];
        String[] roll = new String[num];
        String[] BRANCH = new String[num];
        String[][] subjects = new String[num][];
        int[] numsub = new int[num];
        int[][] marks = new int[num][];
        String[][] pass_fail = new String[num][];
        for (int j = 0; j < num; j++) {
            System.out.println();
            System.out.println("STUDENT "+(j+1)+" :");    
            System.out.print("NAME :");
            name[j] = sc.nextLine();
            System.out.print("ROLL NUMBER :");
            roll[j] = sc.nextLine();
            System.out.print("BRANCH :");
            BRANCH[j] = sc.nextLine();
            System.out.print("NUMBER OF SUBJECTS :");
            numsub[j] = Integer.parseInt(sc.nextLine());
            subjects[j] = new String[numsub[j]];
            marks[j] = new int[numsub[j]];
            pass_fail[j] = new String[numsub[j]];
            for (int i = 0; i< numsub[j];i++) {
                System.out.print("SUBJECT "+(i+1)+":");
                subjects[j][i] = sc.nextLine();
                System.out.print("MARKS :");
                marks[j][i] = Integer.parseInt(sc.nextLine());
                if (marks[j][i]<=35){
                    pass_fail[j][i]="FAIL";
                }
                else if (marks[j][i]>35 && marks[j][i]<50){
                    pass_fail[j][i]="D GRADE";
                }
                else if (marks[j][i]>=50 && marks[j][i]<65){
                    pass_fail[j][i]="C GRADE";
                }
                else if (marks[j][i]>=65 && marks[j][i]<80){
                    pass_fail[j][i]="B GRADE";
                }
                else if (marks[j][i]>=80 && marks[j][i]<=100){
                    pass_fail[j][i]="A GRADE";
                }
            }
    }
	    sc.close();
        System.out.println();
        System.out.println("MALLA REDDY INSTITUTE OF ENGINEERING AND TECHNOLOGY");
        for (int j = 0; j < num; j++) {
            System.out.println();
            System.out.println("____________STUDENT "+(j+1)+" DETAILS____________");
            System.out.println("NAME             :"+name[j]);
            System.out.println("ROLL NUMBER      :"+roll[j]);
            System.out.println("BRANCH           :"+BRANCH[j]);
            Double total=0.0;
            for (int i = 0; i< numsub[j];i++) {
                System.out.println("SUBJECT "+(i+1)+"        :"+subjects[j][i]);
                System.out.println("MARKS            :"+marks[j][i]);
                System.out.println("RESULT           :"+pass_fail[j][i]);
                total += marks[j][i];
            }
            System.out.println("TOTAL MARKS      :"+total);
            System.out.println("AVERAGE MARKS    :"+total/numsub[j]);
            total=0.0;
        }
	}
}
