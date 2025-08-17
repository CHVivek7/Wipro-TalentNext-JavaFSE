import java.util.*;

public class Ex_6 {
    private Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Hashtable<String, String> swapKeyValue() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Ex_6 obj = new Ex_6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of country-capital pairs:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name: ");
            String country = sc.nextLine();
            System.out.print("Enter capital: ");
            String capital = sc.nextLine();
            obj.saveCountryCapital(country, capital);
        }
        System.out.println("\nHashtable M1: " + obj.M1);
        System.out.print("\nEnter country to get capital: ");
        String c = sc.nextLine();
        System.out.println("Capital: " + obj.getCapital(c));
        System.out.print("\nEnter capital to get country: ");
        String cap = sc.nextLine();
        System.out.println("Country: " + obj.getCountry(cap));
        System.out.println("\nHashtable M2 (Capital->Country): " + obj.swapKeyValue());
        System.out.println("\nAll countries: " + obj.getAllCountries());
        sc.close();
    }
}
