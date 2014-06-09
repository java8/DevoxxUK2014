/**
 * Created by raoul-gabrielurma on 14/01/2014.
 */
public  class Trader{

    private final String name;
    // not final on purpose for one exercise
    private String city;

    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public void SetCity(String city){
        this.city = city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trader trader = (Trader) o;

        if (!city.equals(trader.city)) return false;
        if (!name.equals(trader.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }
}
