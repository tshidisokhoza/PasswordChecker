public class Password {
    public boolean passwordIsValid(String password) {
try {
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    boolean hasSpecialCharacter = false;
    int count = 0;

    if (password.length() == 0) {

        System.out.println("password should exist");
        return false;


    }
    if (password.length() < 8 && password.length() > 0) {
        System.out.println("password should be longer than than 8 characters");
        return false;
    }
    for (int i = 0; i < password.length(); i++) {
        if (Character.isLowerCase(password.charAt(i))) {
            hasLowerCase = true;
            count++;
            break;

        }

    }


    for (int i = 0; i < password.length(); i++) {
        char letter = password.charAt(i);
        if (Character.isUpperCase(letter)) {
            hasUpperCase = true;
            count++;
            break;
        }
    }

    for (int i = 0; i < password.length(); i++) {
        char ci = password.charAt(i);
        if (Character.isDigit(ci)) {
            hasDigit = true;
            count++;
            break;
        }
    }

    for (int i = 0; i < password.length(); i++) {
        char cc = password.charAt(i);
        if (!Character.isLetterOrDigit(cc)) {
            hasSpecialCharacter = true;
            count++;
            break;
        }

    }


    if (!hasUpperCase) {
        System.out.println("password should have at least one uppercase letter");


    }
    if (!hasLowerCase) {
        System.out.println("password should have at least one lowercase letter");


    }
    if (!hasDigit) {
        System.out.println("password should at least have one digit");


    }
    if (!hasSpecialCharacter) {
        System.out.println("password should have at least one special character");


    }

    if (count >= 3) {
        return true;
    }
} catch (Exception e) {
    e.printStackTrace();
}


        return false;
    }


    public boolean passwordIsOk(String password)
    {
        boolean result = passwordIsValid(password);

        if(result) {
            System.out.println("Password is Ok");
            return true;
        }

        return false;
    }

}
