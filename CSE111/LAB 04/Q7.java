//Rename Pizza to Q7
class Q7{
 static int x;
void methodA(){
int z;
 x=5; //at home, comment/delete this line and try again
 z=x+methodB(x);
System.out.println(x+" "+z);
 z=methodB(z+2)+x;
System.out.println(x+" "+z);
methodB(x,z);
System.out.println(x+" "+z);
    }
int methodB(int y){
  x=y+x;
System.out.println(x+" "+y);
return x+3;
    }
void methodB(int z, int x){
   z=z+1;
   x=x+1;
System.out.println(z+" "+x);
    }
}
