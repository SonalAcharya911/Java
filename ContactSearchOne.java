class ContactSearchOne {
    
    public static long getMobileByEmail(String email) {
        System.out.println("Searching contact for email: " + email);

        
        if (email.equals("mahalakshmiph@gmail.com.com")) {
            return 9876543210L;
        } else if (email.equals("sharanyaph@gmail.com")) {
            return 8765432109L;
        } else if (email.equals("harips@gmail.com")) {
            return 7654321098L;
        } else if (email.equals("nalinaph.com")) {
            return 6543210987L;
        } else if (email.equals("saritha@gmail.com")) {
            return 5432109876L;
        } else if (email.equals("ashu@gmail.com")) {
            return 4321098765L;
        } else if (email.equals("mason@gmail.com")) {
            return 3210987654L;
        } else if (email.equals("mouni@gmail.com")) {
            return 2109876543L;
        } else if (email.equals("james@gmail.com")) {
            return 1098765432L;
        } else if (email.equals("sathi@gmail.com")) {
            return 1987654321L;
        } else if (email.equals("yajwin@gmail.com")) {
            return 2876543210L;
        } else if (email.equals("tanvi@gmail.com")) {
            return 3765432109L;
        } else if (email.equals("mayur@gmail.com")) {
            return 4654321098L;
        } else if (email.equals("riya@gmail.com")) {
            return 5543210987L;
        } else if (email.equals("battu@gmail.com")) {
            return 6432109876L;
        } else {
            System.out.println("Contact not found!");
            return 0; 
        }
    }
}

