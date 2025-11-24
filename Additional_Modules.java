/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSPAK
 */
public class Additional_Modules {
    
    public  static String hashcode(String hash){
        String output="#";
        int t=0;
        char test;
        for(int i=0;i<hash.length();i++){
            if(hash.charAt(i)>='A'&&hash.charAt(i)<='N'){
                t=hash.charAt(i)+10;
                output=output+t;
            }
            else if(hash.charAt(i)>'N'&&hash.charAt(i)<='Z'){
                t=hash.charAt(i)-6;
                test=(char)t;
                output=output+test;
            }
            else if(hash.charAt(i)>='0'&&hash.charAt(i)<='9'){
                 if(hash.charAt(i)>='0'&&hash.charAt(i)<='3'){
                    output=output+hash.charAt(i)+"S";
                }
                else if(hash.charAt(i)>='4'&&hash.charAt(i)<='6'){
                    output=output+hash.charAt(i)+"H";
                }
                if(hash.charAt(i)>='7'&&hash.charAt(i)<='9'){
                    output=output+hash.charAt(i)+"M";
                }
            }
            else if(hash.charAt(i)>='a'&&hash.charAt(i)<='b'){
                t=hash.charAt(i)+6;
                output=output+t;
            }
            else if(hash.charAt(i)>'n'&&hash.charAt(i)<='z'){
                t=hash.charAt(i)-10;
                test=(char)t;
                output=output+test;
            }
            else{
                 output=output+hash.charAt(i);
            }     
    }
         return output;
    }
    
    
     public String numGen(){
           double b;
        int a,count=0;
        char k;
        String output="",l;
            while(count<3){
            b=Math.random();
            b=b*100;
            a=(int)b;
            if(a>=65&&a<=90){
             count=count+1;
            k=(char)a;
            l=Character.toString(k);
            output=output.concat(l);
              }
            }
            count =0;
            while(count<5)
            {
            b=Math.random();
            b=b*10;
            a=(int)b;
            if(a<10){
                l=String.valueOf(a);
              output=output.concat(l);
              count=count+1;
            }
            }
        //System.out.println(output);
    return output;
    }
    
}
