package it.matteocorradin.tsupportlibrarycommon.utils;

import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by matteocorradin on 15/02/18.
 */

public class RegexUtils {
    public static boolean isValidEmail(String email) {
        if (email != null) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            return pattern.matcher(email).matches();
        }else{
            return false;
        }
    }

    public static boolean validCellPhone(String number)
    {
        return Patterns.PHONE.matcher(number).matches();
    }
}
