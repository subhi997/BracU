public class Date{
  private int day,month,year;
  Date(){
  }
  Date(int day,int month,int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  void setDay(int day){
    this.day = day;
  }
  void setMonth(int month){
    this.month = month;
  }
  void setYear(int year){
    this.year = year;
  }
  int getDay(){
    return day;
  }
  int getMonth(){
    return month;
  }
  int getYear(){
    return year;
  }
  void displayDate(){
    System.out.println(day+"/"+month+"/"+year);
  }
}