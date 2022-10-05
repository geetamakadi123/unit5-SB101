package com.question3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class MemberCompDate implements Comparator<Members> {

    @Override
    public int compare(Members m1, Members m2) {
        // TODO Auto-generated method stub
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d1=df.parse(m1.membershipEnddate);
            Date d2=df.parse(m2.membershipEnddate);

            return d1.after(d2)?+1:-1;




        } catch (ParseException e) {
           
            e.printStackTrace();
            return 0;
        }
    }


}
