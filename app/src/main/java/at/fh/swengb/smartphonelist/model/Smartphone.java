package at.fh.swengb.smartphonelist.model;

import java.io.Serializable;

/**
 * Created by Markus on 22.11.2016.
 */
public class Smartphone implements Serializable {

    protected String model;
    protected int year;
    protected String color;
    protected String serialnumber;


    public Smartphone(){}

    public Smartphone(String model, int year, String color, String serialnumber){
        this.model = model;
        this.year = year;
        this.color = color;
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {

        return ""+year ;
    }

    public String getColor() {
        return color;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smartphone that = (Smartphone) o;

        if(this.hashCode() == that.hashCode()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (serialnumber != null ? serialnumber.hashCode() : 0);
        return result;
    }

    @Override public String toString(){
        return ("Smartphone{ Model=\'"+this.model+ "\', "
                +"Year="+this.year+ ", "
                +"Color=\'"+this.color+ "\', "
                +"Serialnumber=\'"+this.serialnumber+"\'}");
    }
}
