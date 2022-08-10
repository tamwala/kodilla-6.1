package stream;

import java.util.Map;
import java.util.stream.Collectors;

import stream.forumuser.Forum;
import stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfBooks = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 2002)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
