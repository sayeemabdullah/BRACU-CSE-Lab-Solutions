public class Q1Test{
public static void main(String [] args){
Q1Student s1 = new Q1Student("Bob", 1);
Q1Student s2 = new Q1Student("Tom", 2);
Q1Student s3 = new Q1Student("Jack", 3);
Q1Student s4 = new Q1Student("Jill", 4);
Q1Printer pr = new Q1Printer();
pr.printDetail(s1);
pr.printDetail(s2);
pr.printDetail(s3);
pr.printDetail(s4);
}
}
