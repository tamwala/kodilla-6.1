package stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Jan Nowak", 'M', LocalDate.of(2000 , 11 , 17), 17));
        forumUserList.add(new ForumUser(2, "Jan Kowalski", 'M', LocalDate.of(1980 , 12 , 14), 1));
        forumUserList.add(new ForumUser(3, "Anna Seweryn", 'F', LocalDate.of(2020 , 4 , 11), 55));
        forumUserList.add(new ForumUser(4, "Beata Gawin", 'F', LocalDate.of(1988 , 8 , 12), 13));
        forumUserList.add(new ForumUser(4, "Dominik Starszy", 'M', LocalDate.of(2010 , 1 , 11), 0));
    }

    public List<ForumUser> getUserList() {
        //return forumUserList;
        return new ArrayList<>(forumUserList);
    }

}
