package Modelos;

public record Moedas(String base_code, String target_code, Double conversion_rate, Double conversion_result,
                     String time_last_update_utc) {
}
