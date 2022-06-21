package stream;

import stream.beautifier.PoemBeautifier;
import stream.book.Book;
import stream.book.BookDirectory;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;
import stream.iterate.NumbersGenerator;
import stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;

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


    }}
