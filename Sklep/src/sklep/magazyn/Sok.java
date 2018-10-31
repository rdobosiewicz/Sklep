/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep.magazyn;

/**
 *
 * @author Dell
 */
public class Sok extends Produkt
{
    private double vatS1=0.08, vatS2=0.24;
    
    public Sok(String nazwaProduktu, double cenaNetto, double vat, int liczbaSztuk) {
        super(nazwaProduktu, cenaNetto, vat, liczbaSztuk);
    }
    
    @Override
    public double getWartoscNetto()
    {
        return super.getWartoscNetto();
    }
            
    @Override
    public double getWartoscBrutto()
    {
        return super.getWartoscBrutto();
    }
    
    @Override
    public void obliczWartoscNetto()
    {
        super.obliczWartoscNetto();
        System.out.print("Wartość netto soku "+this.nazwaProduktu);
        System.out.printf(" wynosi: %.2f", this.wartoscNettoProduktow);
        System.out.print(" złotych\n");
    }
    
    public void obliczWartoscBrutto()
    {
        //Dwa rodzaje soków Tymbark i Caprio
        if(this.nazwaProduktu.length()==7)
        {
             this.wartoscBruttoProduktow=this.wartoscNettoProduktow*(1+this.vatS1);
             System.out.print("Wartość brutto soku "+this.nazwaProduktu);
             System.out.printf(" wynosi: %.2f", this.wartoscBruttoProduktow);
             System.out.print(" złotych\n");
             
        }
        else if(this.nazwaProduktu.length()==6)
        {
             this.wartoscBruttoProduktow=this.wartoscNettoProduktow*(1+this.vatS1);
             System.out.print("Wartość brutto soku "+this.nazwaProduktu);
             System.out.printf(" wynosi: %.2f", this.wartoscBruttoProduktow);
             System.out.print(" złotych\n");
        }else
        {
             System.out.println("Nie ma takiego soku w magazynie. Wybierz Tymbark lub Caprio");
        }
        }       
        
    }
