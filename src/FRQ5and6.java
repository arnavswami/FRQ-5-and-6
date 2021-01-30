public class FRQ5and6 {

    /*
    FRQ 5 Answers:

1   a) write a method for the invitation class that returns the name of the host

Public String getHostName()

{
Return hostName;
}


b) Write a method for the Invitation class that accepts a parameter and uses it to

update the address for the event.

Public String setAddress(String a)

{

address=a;

}

c)  Write a method for the Invitation class that will accept the name of a person who
will be invited as a string parameter and return a string consisting of the name of the
person being invited along with name of the host and location of the event.

Public String invite(String name)

{
Return “Dear “+name+“, please attend event at my ”+address+“. See you
then, ”+hostName+ “.”
}


 d)  A student has written the following one-parameter constructor to be included in the Invitation class.
  The method is intended to construct a new Invitation object that sets address to the value of the parameter
  and sets hostName to the default name "Host". The constructor does not work as intended.



public Invitation(String address)

{

address = new address;

hostName = "Host";

return hostName
}


2)

Write the complete PasswordGenerator class. Your implementation must
meet all specifications and conform to the example.

import java.util.Random;
public class PasswordGenerator {
private static int passwordsGenerated =0;
private static Random random = new Random();
private String prefix;
private int length;
public PasswordGenerator(int length,String prefix) {
this.prefix = prefix;
this.length = length;
   }
 public PasswordGenerator(int length) {
       this.prefix = "A";
       this.length = length;
   }
   public String pwGen(){
       String pwd= this.prefix+".";
       for(int i=1;i<=this.length;i++){
           pwd+=random.nextInt(10);
       }
       passwordsGenerated+=1;
       return pwd;
   }
    public int pwCount(){
       return passwordsGenerated;
   }

   public static void main(String[] args) {

       PasswordGenerator pw1 = new PasswordGenerator(4,"chs");
       System.out.println(pw1.pwCount());
       System.out.println(pw1.pwGen());
       System.out.println(pw1.pwGen());
       System.out.println(pw1.pwCount());
       PasswordGenerator pw2 = new PasswordGenerator(6);
       System.out.println(pw2.pwCount());
       System.out.println(pw2.pwGen());
       System.out.println(pw2.pwCount());
       System.out.println(pw2.pwCount());

       }
       }

   FRQ 6

   QUESTION #1

   Write a code segment that uses an enhanced for loop to print all elements
   of words that end with "ing". As an example, if words contains {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"},
   then the following output should be produced by the code segment.
   fading trailing batting Write the code segment as described above.
   The code segment must use an enhanced for loop to earn full credit.

   public static void main(String[] args) {
   String ing[] = {"ten","fading","post","card","thunder","hinge","trailing","batting"};
   for (String i: ing){
     if (i.endsWith("ing")){
       System.out.println(i);

 }
 }
 }


    QUESTION #2

a)
Complete the method computeBonusThreshold below, which is intended to
return the bonus threshold based on the contents of the itemsSold array.
Assume that itemsSold has been filled appropriately, and that the array
contains at least three employees.

public Payroll()

{

itemsSold = new int[] {48,50,37,62,38,70,55,37,64,60};

wages = new double[10];

}
public double computeBonusThreshold()
{
int highest = itemsSold[0];
int lowest = itemsSold[0];
int sumOfItemsSold = itemsSold[0];
double bonusThreshold =0;
for (int i = 1; i < itemsSold.length ; i++)
{
sumOfItemsSold += itemsSold[i];
if(itemsSold[i] > highest)
highest = itemsSold[i];
if(itemsSold[i] < lowest )
lowest = itemsSold[i];
}
bonusThreshold = (sumOfItemsSold - lowest - highest ) / (itemsSold.length -2.0);
return bonusThreshold;

}

b)
Write the method computeWages. Assume that itemsSold has been filled appropriately,
and there are at least three employees in the array. Assume also that the wages array
and the itemsSold array have the same length. Your solution must call computeBonusThreshold
appropriately to receive full credit.

public double computeBonusThreshold()

{

int highest = itemsSold[0];
int lowest = itemsSold[0]
int sumOfItemsSold = itemsSold[0];
double bonusThreshold =0;
//iterate over items , find sum of items sold and highest and lowest
for (int i = 1; i < itemsSold.length ; i++)
{
sumOfItemsSold += itemsSold[i];
if(itemsSold[i] > highest)
highest = itemsSold[i];
if(itemsSold[i] < lowest )
lowest = itemsSold[i];
}
bonusThreshold = (sumOfItemsSold - lowest - highest ) / (itemsSold.length -2.0);
return bonusThreshold;
}

     */

}
