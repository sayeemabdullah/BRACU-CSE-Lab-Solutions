public class Q2Test{ 
public static void main(String [] args){ 
Q2Cat c1 = new Q2Cat(); 
Q2Cat c2 = new Q2Cat("Black"); 
Q2Cat c3 = new Q2Cat("Brown", "jumping"); 
Q2Cat c4 = new Q2Cat("Red", "purring"); 
c1.printCat(); 
c2.printCat(); 
c3.printCat(); 
c4.printCat(); 
c1.changeColor("Blue"); 
c3.changeColor("Purple"); 
c1.printCat(); 
c3.printCat(); 
} 
} 
