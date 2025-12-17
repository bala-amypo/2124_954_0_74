import com.example.demo.entity;

public class StudentEntity{
    private int id;
    private String name;
    private String email;
    public void setId(int id){
        this.id=id;
    }
     public void setName(String name){
        this.name=name;
    }
     public void setEmail(String email){
        this.email=email;
    }
    public int getId(){
        retrun id;
    }
    public String getName(){
        retrun name;
    }
    public String getEmail(){
        return email;
    }
    public StudentEntity(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public StudentEntity(){
    }
}