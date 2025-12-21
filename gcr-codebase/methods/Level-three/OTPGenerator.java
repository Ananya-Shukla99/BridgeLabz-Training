// a program to generate a six-digit OTP number 
public class OTPGenerator {

    // method to generate a 6-digit OTP 
    public static int generateOTP() {

        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        //generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        //display generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        //check uniqueness of OTP
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("OTPs are not unique.");
        }
    }
}
