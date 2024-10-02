package ekralik.wortTrainerReloaded;

public class Test {
    public static void main(String[] args) {
        String[] urls = { "google.be", "0dd.-0", "asdfaslkdf.com", "https://www.duden.de/synonyme/durchdacht#google_vignette",
        "https://www.canva.d/search?q=homepage%20app", "https://elearning.tgm.ac.at/pluginfile.php/170599/mod_resource/content/0/RDP%20Info.pdf"};

        // false, false, true, true, false, true

        Model model = new Model();

        for (String url : urls) {
            System.out.println(url + "\nist "+model.regexChecker(url));
        }

        for (String url : urls) {
            System.out.println(url + "\nist "+model.checker(url));
        }

    }
}
