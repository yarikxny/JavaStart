package program;

/**
 * Created by yarik on 30.11.2016.
 */
public class PhotoProduct extends Product {
    private double megapx;
    private boolean digital;

    /**
     * Override discount
     * */
    @Override
    protected int calcDiscount(){
        int def = super.calcDiscount();
        if(!digital){
            def += 20;
        }
        return def;
    }

    public double getMegapx(){
        return megapx;
    }

    public void setMegapx (double newMegapx){
        this.megapx = newMegapx;
    }

    public boolean getDigital(){
        return digital;
    }

    public void setDigital(boolean newDigitalValue){
        this.digital = newDigitalValue;
    }
}
