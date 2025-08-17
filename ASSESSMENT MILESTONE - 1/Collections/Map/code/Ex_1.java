import java.util.*;

public class Ex_1 {
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Save country and capital
    public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    // 2. Get capital by country
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    // 3. Get country by capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create M2 with capital as key and country as value
    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Get ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Ex_1 obj = new Ex_1();
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
        System.out.println("\nMap M1: " + obj.M1);
        System.out.print("\nEnter country to get capital: ");
        String c = sc.nextLine();
        System.out.println("Capital: " + obj.getCapital(c));
        System.out.print("\nEnter capital to get country: ");
        String cap = sc.nextLine();
        System.out.println("Country: " + obj.getCountry(cap));
        System.out.println("\nMap M2 (Capital->Country): " + obj.swapKeyValue());
        System.out.println("\nAll countries: " + obj.getAllCountries());
        sc.close();
    }
}
