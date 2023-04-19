package mvc.Books;

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String error) {
        this.errorMessage = error;
    }

    @Override
    public String toString() {
        return "CustomErrorType{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
