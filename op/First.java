 package op;

 public class First {
    public static void main(String[] args) {
    Employee E1 = new Employee();
     E1.set("XYZ",50000);
    Employee E2 = new Employee();
    E2. set("ABC",100000);
    if (E1.getsal()>E2.getsal()){
        System.out.println(E1.getname());
    }
    else{
        System.out.println(E2.getname());
    }

    }
}

    class Employee {
        String name;
        private int salary;
    public void set(String a, int b){
        name = a;
        salary = b;
    }
    public int getsal(){
        return salary;
    }
    public String getname(){
        return name;
    }
 }
