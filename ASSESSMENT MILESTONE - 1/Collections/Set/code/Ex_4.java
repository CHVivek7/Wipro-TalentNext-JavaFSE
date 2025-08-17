import java.util.TreeSet;
import java.util.Iterator;

public class Ex_4 {
    private TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String CountryName) {
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
        Ex_4 obj = new Ex_4();
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        System.out.println("TreeSet: " + obj.H1);
        System.out.println("Get Country 'USA': " + obj.getCountry("USA"));
        System.out.println("Get Country 'UK': " + obj.getCountry("UK"));
    }
}
