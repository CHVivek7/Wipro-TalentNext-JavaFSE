import java.util.HashSet;
import java.util.Iterator;

public class Ex_1 {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        for (String country : H1) {
            if (country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Ex_1 obj = new Ex_1();
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        System.out.println("HashSet: " + obj.H1);
        System.out.println("Get Country 'USA': " + obj.getCountry("USA"));
        System.out.println("Get Country 'UK': " + obj.getCountry("UK"));
    }
}
