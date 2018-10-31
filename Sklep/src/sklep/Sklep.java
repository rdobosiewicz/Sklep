/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep;

import java.util.Scanner;
import sklep.magazyn.Czekolada;
import sklep.magazyn.Produkt;
import sklep.magazyn.Sok;

/**
 *
 * @author Dell
 */
public class Sklep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aby utworzyć obiekt sok należy podać: Nazwae produktu (tymbark albo caprio), cenne netto, domyslny vat i liczbe sztuk 
       Sok tymbark1 = new Sok("tymbark", 2.99,0.24,240);
       Sok caprio1=new Sok("caprio",3.49,0.24,200);
     
       tymbark1.obliczWartoscNetto();
       tymbark1.obliczWartoscBrutto();
       
       caprio1.obliczWartoscNetto();
       caprio1.obliczWartoscBrutto();
       
       Czekolada goplana1=new Czekolada("goplana",3.29,0.24,500);
       Czekolada milka1=new Czekolada("milka",3.99,0.24,200);
       
       goplana1.obliczWartoscNetto();
       goplana1.obliczWartoscBrutto();
       
       milka1.obliczWartoscNetto();
       milka1.obliczWartoscBrutto();
    }}