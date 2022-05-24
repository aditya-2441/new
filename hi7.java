import java.util.Scanner; 
public class hi7
{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); System.out.println("Enter a Word: "); String wd = sc.next().toLowerCase(); int hasc = wd.charAt(0);
int lasc = wd.charAt(0); for(int i=0;i<wd.length();i++) {
int asc = wd.charAt(i); if(asc>hasc)
{
hasc = asc; }
if(asc<lasc) {
lasc = asc; }
}
System.out.println("The letter with highest ASCII value: "+(char)hasc); System.out.println("The letter with lowest ASCII value: "+(char)lasc);
}}