package stream.forumuser;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int id, String userName, char sex, LocalDate dateOfBirth, int numerOfPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numerOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (sex != forumUser.sex) return false;
        if (numberOfPosts != forumUser.numberOfPosts) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return dateOfBirth.equals(forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + numberOfPosts;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
