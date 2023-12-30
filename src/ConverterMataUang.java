import java.util.HashMap;
import java.util.Map;

public class ConverterMataUang {
    private Map<String, Double> exchangeRates;

    public ConverterMataUang() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 0.000065);   // 1 IDR to USD (Amerika Serikat)
        exchangeRates.put("JPY", 0.00916);    // 1 IDR to JPY (Jepang)
        exchangeRates.put("PHP", 0.00360);    // 1 IDR to PHP (Filipina)
        exchangeRates.put("THB", 0.00222);    // 1 IDR to THB (Thailand)
        exchangeRates.put("EUR", 0.00006);    // 1 IDR to EUR (Eropa)
        exchangeRates.put("CNY", 0.00046);    // 1 IDR to CNY (China)
        exchangeRates.put("KRW", 0.08366);    // 1 IDR to KRW (Korea)
        exchangeRates.put("MYR", 0.00030);    // 1 IDR to MYR (Malaysia)
        exchangeRates.put("TRY", 0.00192 );   // 1 IDR to TRY (Turki)
    }

    public double convertTo(String currencyCode, double amount) {
        if (exchangeRates.containsKey(currencyCode)) {
            double exchangeRate = exchangeRates.get(currencyCode);
            return amount * exchangeRate;
        } else {
            System.out.println("Tidak ada data kurs untuk mata uang " + currencyCode);
            return -1;
        }
    }
}
