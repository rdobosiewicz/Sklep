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
public class Produkt {
    
    protected String nazwaProduktu;
    protected double cenaNetto, cenaBrutto, wartoscNettoProduktow, wartoscBruttoProduktow, vat;
    protected int liczbaSztuk;
    
    public Produkt(String nazwaProduktu,double cenaNetto, double vat, int liczbaSztuk)
    {
       this.nazwaProduktu=nazwaProduktu;
       this.cenaNetto=cenaNetto;
       this.liczbaSztuk=liczbaSztuk;
       this.vat=vat;
    }
    
    public double getWartoscNetto()
    {
        return this.wartoscNettoProduktow;
    }
    
    public double getWartoscBrutto()
    {
        return this.wartoscBruttoProduktow;
    }
            
    
    public void obliczWartoscNetto()
    {
        this.wartoscNettoProduktow=this.cenaNetto*this.liczbaSztuk;
    }
    
    public void obliczWartoscBrutto()
    {
        this.wartoscBruttoProduktow=this.wartoscNettoProduktow*(1+vat);
    }
    
}
