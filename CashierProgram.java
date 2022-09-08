public class CashierProgram {
    private String[] products;

    public CashierProgram(String[] products) {
        this.products = products;
    }

    public String recommend() {
        String result = "We have ";
        for (int i = 0; i < products.length; i++) {
            result += products[i];
            if (i != products.length - 1) {
                result += ", ";
            }
        }

        return result;
    }

}
