public class CashierProgramMain {
    public static void main(String[] args) {
        String[] products = { "Banana", "Orange", "Apple" };
        CashierProgram cashierProgram = new CashierProgram(products);
        System.out.println(cashierProgram.recommend());

    }

}
