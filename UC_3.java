public class UC_3 {

    public static String createRow(String... parts) {
        return String.join("   ", parts);
    }

    public static void main(String[] args) {

        System.out.println(createRow("OOOO", "OOOO", "PPPP", "SSSS"));
        System.out.println(createRow("O   O", "O   O", "P   P", "S"));
        System.out.println(createRow("O   O", "O   O", "PPPP", "SSS"));
        System.out.println(createRow("O   O", "O   O", "P", "S   S"));
        System.out.println(createRow("OOOO", "OOOO", "P", "SSSS"));
    }
}