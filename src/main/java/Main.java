public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Екатерина";
        post.passport = "1111 111111";
        post.patronymic = "Владимировна";
        post.phone = "+7 777 777-77-77";
        post.surname = "Владимирова";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 1;
        post.birthday.year = 1998;
        post.birthday.month = 8;
    }
}
