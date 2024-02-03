import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class City{

    public static void main(String args[]){
        
        List<City> cities;

        public City(){
            cities = new ArrayList<>();

            City city1 = new City(101, "Banglore");
            City city2 = new City(102, "Pune");
            City city3 = new City(103, "Mumbai");

            cities.addAll(Arrays.asList(city1,city2,city3));
        }

        public List<City> getAllCity(){
            return cities;
        }
    }
}