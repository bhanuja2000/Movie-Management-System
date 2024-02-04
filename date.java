public class date {
   private int day;
   private int month;
   private int year;


date(int day,int month,int year){

    this.day=day;
    this.month=month;
    this.year=year;

}
public int getDay(){
    return day;
}
public int getMonth(){
    return month;
}
public int getYear(){
    return year;
}
public void setDay(int day){
    if(day<=1&&day>=31){
         this.day=day;
    }
    else{
        System.out.println("Day must be between 1 and 31.");
    }
   
}

public void setMonth(int month){
    if(month<=12&&month>=1){
         this. month=month;
    }
    else{
        System.out.println("Month must be between 1 and 12.\"");
    }
  
}
public void setYear(int year){
    if(year<=2079&&year>=1980){
        this.year=year;
    }
    else{
        System.out.println("Year must be between 1980 and 2079.");
    }
    
}
void setDAte(int day,int month,int year){
this.day=day;
this.month=month;
this.year=month;
}

String getDate(){
    return day+"/"+month+"/"+year;
}
public String toString() {
   return "date[date= "+day+",month="+month+",year="+year+"]";
}
    
}
