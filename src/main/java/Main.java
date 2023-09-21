public class Main {
    public static void main(String[] args) {
        Post post = new Post();


        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1991;


        post.name = "Тимур";
        post.seriesPassport = "4518";
        post.numberPassport = "454465";
        post.patronymic = "Маратович";
        post.phone = "+7(999)-555-94-99";
        post.surname = "Руфатов";
        post.subscription = true;

        // заполните другие поля

        System.out.println(post.birthday.day);

        System.out.println(post.name);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);


    }
}