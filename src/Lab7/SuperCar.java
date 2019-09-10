package Lab7;

public class SuperCar {
    //Class Attributes
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    //constructor
    public SuperCar() {
    }

    public SuperCar(String carbrand, String carcolor, String carenginesize, String maxspeed, String countryoforigin) {
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carenginesize = carenginesize;
        this.maxspeed = maxspeed;
        this.countryoforigin =
        countryoforigin;

    }

    //getter and setter methods
    public String getCarbrand() {
        return this.carbrand;
    }

    public void setCarbrand(String newcarbrand) {
        this.carbrand = newcarbrand;
    }

    public String getCarcolor() {
        return this.carcolor;
    }

    public void setCarcolor(String newcarcolor) {
        this.carbrand = newcarcolor;
    }

    public String getCarenginesize() {
        return this.carenginesize;
    }

    public void setCarenginesize(String newCarenginesize) {
        this.carenginesize = newCarenginesize;
    }

    public String getMaxspeed() {
        return this.maxspeed;
    }

    public void setMaxspeed(String newMaxspeed) {
        this.maxspeed = newMaxspeed;
    }

    public void getCountryoforigin() {
        System.out.println(carbrand+carcolor+carenginesize+maxspeed+countryoforigin);

    }


}











