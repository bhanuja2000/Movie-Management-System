


public class director {
    

private String name;
private String surname;
private int numDirectedMove;
date dob; 
public director(String name,String surname){
this.name=name;
this.surname=surname;
}
public String getName(){
    return name;
}
void setbod(date dob){
this.dob=dob;
}
public String getSurname(){
    return surname;
}
public String getDob(){
    return dob.getDay()+"/"+dob.getMonth()+'/'+dob.getYear();
}

 void setNumberOfMove(int nMove){
numDirectedMove=nMove;
}
int getNumberOfMove(){
    return numDirectedMove;
}
public String toString() {
    return "Director[ name = " + name + ", Surname = " + surname + ", dob = " + dob .getDay()+"/"+ dob.getMonth()+"/"+dob.getYear()+",Movies directed= "+numDirectedMove+ "]";

}
}
