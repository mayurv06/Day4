class student{
    int id;
    String name;
    int age;
    student(int a,String b,int c){
        id=a;
        name=b;
        age=c;
    }
    void display(){
        System.out.println(id+""+name+""+age);
    }
}
    
    public class Name{
        public static void main(String[] args){
            student s1=new student(1,"Manu",20);
            student s2=new student(2,"Likhi",30);
            s1.display();
            s2.display();
        }
    }

