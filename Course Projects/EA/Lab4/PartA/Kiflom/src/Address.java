public class Address {
    private String zip;
    private String st;
    private String houseNo;

    private String postal;


   public Address(String zip, String st, String houseNo) {
        this.zip = zip;
        this.st = st;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zip='" + zip + '\'' +
                ", st='" + st + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", postal='" + postal + '\'' +
                '}';
    }
}
