package P5_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            boolean isDigit = true;
            for (char symbol : number.toCharArray()) {
                if (!Character.isDigit(symbol)) {
                    sb.append("Invalid number!").append(System.lineSeparator());
                    isDigit = false;
                    break;
                }
            }
            if (!isDigit) {
                continue;
            }
            sb.append("Calling... ").append(number).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            boolean isDigit = false;
            for (char symbol : url.toCharArray()) {
                if(Character.isDigit(symbol)) {
                    sb.append("Invalid URL!").append(System.lineSeparator());
                    isDigit = true;
                    break;
                }
            }
            if (isDigit) {
                continue;
            }
            sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
        }
        return sb.toString();
    }
}
