/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Aldhinafy
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p1,p2,nilai_s;
        
        anealing an=new anealing();
        an.temp=99;
        an.x1=an.random();
        an.x2=an.random();
        an.nilai=an.fungsi(an.x1,an.x2);
        System.out.println("Temp : "+an.temp);
        while (an.temp>0){
            p1=an.random();
            p2=an.random();
            nilai_s=an.fungsi(p1, p2);
            if(nilai_s<an.nilai){
                an.x1=p1;
                an.x2=p2;
                an.nilai=nilai_s;
            }else{
                double e=nilai_s-an.nilai;
                if(Math.exp(-e/an.temp)>an.randomprobability()){
                    an.x1=p1;
                    an.x2=p2;
                    an.nilai=nilai_s;
                }
            }
            an.temp-=0.00001;
        }
        System.out.println("x1 : "+an.x1);
        System.out.println("x2 : "+an.x2);
        System.out.println("Nilai : "+an.nilai);
      //  System.out.println("Temp : "+an.temp);
    }
}
