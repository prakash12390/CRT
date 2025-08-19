class management{
    int id;
    String name;
    int age;
    String Branch;
    String address;
    void setDetails(int id,String name,int age,String branch,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.Branch=branch;
        this.address=address;
    }
    void  getDetails(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Branch:"+Branch);
        System.out.println("address:"+address);
    }
}
public class ClgManagement {
    public static void main(String[] args) {
        management obj = new management();
        obj.setDetails(1,"prakash",20,"ai&ds","kadapa");
        obj.getDetails();

    }
}
