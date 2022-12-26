import java.util.Scanner;
class Food{
public static void main(String[] args){
FoodCorporation ref = new FoodCorporation();
ref.baseSalary();
ref.WorkedHours();
ref.DisplayTotal();
}
}
class FoodCorporation{
float[] basePay = new float[3];
float[] hours_worked = new float[3];
void baseSalary(){
System.out.println("Enter Base Salary Of All Employees");
Scanner sc = new Scanner(System.in);
for(int i =0; i<basePay.length; i++){
System.out.println("Enter Base Pay of Employee : " + (i+1));
basePay[i] = sc.nextFloat();
}
System.out.println();
}
void WorkedHours(){
System.out.println("Enter Worked hours of all employees ");
Scanner sc = new Scanner(System.in);
for(int i = 0 ; i<hours_worked.length; i++){
System.out.println("Enter Worked Hours of Employee : " + (i+1));
hours_worked[i] = sc.nextFloat();
}
System.out.println();
}
void DisplayTotal(){
for(int i =0; i<3; i++){
System.out.print("Employee " + (i+1) + " Salary :" + (basePay[i]
* hours_worked[i]));
System.out.println();
}
System.out.println();
}
}