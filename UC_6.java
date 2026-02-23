public class UC_6 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {

                String.join("   ", "OOOO", "OOOO", "PPPP", "SSSS"),
                String.join("   ", "O   O", "O   O", "P   P", "S"),
                String.join("   ", "O   O", "O   O", "PPPP", "SSS"),
                String.join("   ", "O   O", "O   O", "P", "S   S"),
                String.join("   ", "OOOO", "OOOO", "P", "SSSS"),
                String.join("   ", "", "", "", ""),   // optional spacing row
                String.join("   ", "----- OOPS BANNER -----")

        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}