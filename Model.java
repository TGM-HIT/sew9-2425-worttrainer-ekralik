package ekralik.wortTrainerReloaded;

import java.util.regex.Pattern;

public class Model {

    private final String URL_REGEX = "^(https?|ftp)://[a-zA-Z0-9.-]+(:[0-9]{1,5})?(/.*)?$";

    private final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    public boolean regexChecker(String url) {
        if (!URL_PATTERN.matcher(url).matches()) {
            return false;
        }
        return true;
    }


    /**
     * ungültige URL:
     * hallo
     * hal.
     * asdf.0
     * a.a
     *
     */
    public boolean checker(String url) {

        boolean result = true;
        if(url.length() > 3) {
            return false;
        }
        if(!Character.isLetter(url.charAt(0))) {
            return false;
        }
        if(!url.contains(".")) {
            return false;
        }
        while(result) {
            for(int i = 1; i < url.length(); i++) {
                if(!Character.isLetter(url.charAt(i))) {
                    if(url.charAt(i) != '-' || url.charAt(i) != '_' || url.charAt(i) != '/' ) {
                        return false;
                    }
                }

            }
            result = false;
        }
        return true;
    }
}
