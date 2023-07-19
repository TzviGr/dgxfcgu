public class Client {
    private String firstName;
    private String lastName;
    private int purchases;
    private int firstPurchaseYear;
    private boolean isClubMember;

    public Client(String firstName, String lastName, int firstPurchaseYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstPurchaseYear = firstPurchaseYear;
        this.purchases = 0;
        this.isClubMember = false;
    }

    public int discount(int purchaseYear) {
        int yearsOfSeniority = purchaseYear - firstPurchaseYear;
        int pastPurchasesDiscount = Math.min(purchases, 5);
        int seniorityDiscount = Math.min(yearsOfSeniority / 2, 3);
        int totalDiscount = (pastPurchasesDiscount + seniorityDiscount);

        if (isClubMember) {
            totalDiscount *= 2;
        }
        return totalDiscount;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFirstPurchaseYear() {
        return firstPurchaseYear;
    }

    public int getPurchases() {
        return purchases;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isClubMember() {
        return isClubMember;
    }
}
