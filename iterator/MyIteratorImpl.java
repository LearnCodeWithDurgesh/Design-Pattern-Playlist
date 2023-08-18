import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> list;
    private int length;

    private int position = 0;

    public MyIteratorImpl(List<User> list) {
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        if (position >= length)
            return false;
        else
            return true;

    }

    @Override
    public Object next() {
        User user = list.get(position);
        position += 1;
        return user;
    }

}
