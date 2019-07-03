//Student@109dfdfd
//Ei name e kono student nai
//Student ei nai, abar id :P
//Naam nai .. thikana ashbe koi theke?
//-4.0
//Tonmoy Dewanjee
//16301157
//Mirpur
//4.0
//Student@57d8e362
//Azibun Nuder
//16301045
//Uttara
//4.0
//Student@5de5bb3c
//Ei name e kono student nai
//Student ei nai, abar id :P
//Naam nai .. thikana ashbe koi theke?
//-4.0
//Tonmoy Dewanjee is now standing up!!
//Azibun Nuder is now standing up!!
//Sir, my name is Tonmoy Dewanjee
//Sir, my name is Azibun Nuder
//Tonmoy Dewanjee: Hey, Sumit Dutta, Sir is calling you!!
//Azibun Nuder: Hey, Ananya Ritu, Sir is calling you!!
//5

public class Q3Student{
public String name;
public String id;
public String add;
public double cgpa;

public Q3Student(){}
public Q3Student(String name,String id,String add,double cgpa){
this.name=name;
this.id=id;
this.add=add;
this.cgpa=cgpa;
}
public String nameDao(){
    if(name == null){
    return "Ei name e kono student nai";
    }
    return name;
}
public String boloToAmiKe(){
    if(id == null){
    return "Student ei nai, abar id :P";
    }
    return id;
}
public String addressDao(){
    if(add == null){
    return "Naam nai .. thikana ashbe koi theke?";
    }
    return add;
}
public double cgpaDao(){
    if(cgpa == 0.0){
    return -4.0;
    }
    return cgpa;
}
public void nameBoshao(String name){
this.name = name;
}
public void idBoshao(String id){
this.id = id;
}
public void addressBoshao(String add){
this.add = add;
}
public void cgpaBoshao(double cgpa){
this.cgpa = cgpa;
}
public void standUp(){
System.out.println(name+"is now standing up!!");
}
public String tellMeYourName(){
return "Sir, my name is "+name;
}
public void call(String newname){
System.out.println(name+": Hey, "+newname+", Sir is calling you!!");
}
public int add2Numbers(int a,int b){
return a+b;
}
}