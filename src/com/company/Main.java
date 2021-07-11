package com.company;

public class Main {
    public static void main(String[] args) {
	    long start=System.currentTimeMillis();
        long clockStart=start;
	    while (true){
        long curentTime=System.currentTimeMillis();
        long timeinSeconds=(curentTime-clockStart)/1000;
            if(curentTime-start>=1000){
                System.out.println(  getTime(timeinSeconds));
                start=curentTime;
           }
	    }
    }

    public static String getTime(long time){
        String hour = time/3600 + "";
        String minute =(time - Integer.parseInt(hour)*3600)/60 +"";
        String second = time%60 +"";

        if (Integer.parseInt(hour)<=9){ hour="0"+hour;}
        if (Integer.parseInt(minute)<=9){ minute="0"+minute;}
        if (Integer.parseInt(second)<=9){ second="0"+second;}

        return hour + ":" +minute+ ":" + second;
    }
}
