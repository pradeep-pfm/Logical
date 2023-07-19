package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateCompare {
    public static void main(String[] args) {
        String s1="10-11-2022";
        String s2="11-10-2023";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date1=sdf.parse(s1);
            Date date2=sdf.parse(s2);
        if(date1.compareTo(date2)>0){
            System.out.println("Date 1 is greater");
        } else if (date1.compareTo(date2)<0) {
            System.out.println("Date 2 is greater");

        }else {
            System.out.println("Both are equals");
        }
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
