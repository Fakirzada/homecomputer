package week_10.day_1;

public class employeeinfo {

    private  int id;
    private  String name;

    public void DisplayInfo( int id, String name){
        System.out.println(id);
        System.out.println(name);
    }

    public void geterName(String name){
        this.name=name;
    }
  // getter
    public int getId() {return id;}
    public String getName() {return name;}

    //setter
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;
    }
    //sedter



}


