//White cat is sitting
//Black cat is sitting
//Brown cat is jumping
//Red cat is purring
//Blue cat is sitting
//Purple cat is jumping 

public class Q2Cat{ 
    public String color = "White"; 
    public String action = "sitting"; 
    
    public Q2Cat(){
    
    }
    public Q2Cat(String color){
    this.color = color;
    }
    public Q2Cat(String color , String action){
    this.color=color;
    this.action=action;
    }
    public void changeColor(String color){
    this.color = color;
    }
    public void printCat(){
    System.out.println(color+" cat is "+action); 
    }
} 
