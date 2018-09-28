/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.test;

import java.util.List;

/**
 *
 * @author Study-Development
 */
public class Practica1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiniteAutomaton a = new FiniteAutomaton();
        a.analizeSymbols("(1.2|3.5|4*2+|GO|GAR)*¬");
        System.out.println(a.parenthesisAnalyzer("(1.2|3.5|4*2+|GO|GAR)*¬"));
        List<String> raro = a.returnSymbols();
        for(int i = 0; i <raro.size();i++){
            System.out.print(raro.get(i)+" ");
        }
        String p = "1";
        System.out.println("\n"+a.verificateValidExpression("s.(s|2.*)*¬"));
        boolean esClase =  p.getClass().getName() == String.class.getName();
        System.out.println("//////////////////////////////");
        if(esClase){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        Thompson th = new Thompson();
        th.buildThompson("010*1..+10*..¬");
    }
    
}
