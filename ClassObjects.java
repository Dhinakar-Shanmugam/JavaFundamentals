import java.util.Scanner;

public class ClassObjects {
    String name;
    int registerNum;
    void display(String name, int registerNum){
        System.out.println("Name: "+name);
        System.out.println("RegisterNumber: "+ registerNum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassObjects student = new ClassObjects();
        String nam = "";
        int reg,i;
        System.out.println("Enter number of students n: ");
        int n =scan.nextInt();
        scan.nextLine();
        String str[] = new String[n];
        int arr[] = new int[n];
        System.out.println("Enter"+ n + "students name: ");
        for (i = 0; i < n; i++) {
            nam = scan.nextLine();
            str[i] = nam;
        }
        System.out.println("Enter "+n+" students reg: ");
        for (i = 0; i < n; i++) {
            reg = scan.nextInt();
            arr[i] = reg;
        }
        for (i = 0; i < n; i++) {
            student.display(str[i],arr[i]);
        }
        scan.close();
    }
}
