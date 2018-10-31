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
public class Czekolada extends Produkt 
{
    private double marza1=1.25,marza2=1.20;
    public Czekolada(String nazwaProduktu, double cenaNetto, double vat, int liczbaSztuk) {
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
    }
    
    public void obliczWartoscBrutto()
    {
        if(this.liczbaSztuk<=200)
        {
            this.wartoscBruttoProduktow=(this.wartoscNettoProduktow*(1+this.vat))*this.marza1;
             System.out.print("Wartość brutto czekolady "+this.nazwaProduktu);
             System.out.printf(" wynosi: %.2f", this.wartoscBruttoProduktow);
             System.out.print(" złotych\n");
        }else if(this.liczbaSztuk>200){
            this.wartoscBruttoProduktow=(this.wartoscNettoProduktow*(1+this.vat))*this.marza2;
             System.out.print("Wartość brutto czekolady "+this.nazwaProduktu);
             System.out.printf(" wynosi: %.2f", this.wartoscBruttoProduktow);
             System.out.print(" złotych\n");    
        }else{
            System.out.println("Podałeś złą wartość sztuk w konstruktorze");
        }
    }
    
    
}
