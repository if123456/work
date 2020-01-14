package day10.test3;

public class Reception {
    Filter filter;

    public Reception() {
    }

    public Reception(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void recep(User u) {
        if (u.getType() != null) {
            return;
        }
        if (filter != null) {
            filter.filterUser(u);
            return;
        } else {
            u.setType("A");
        }
    }
}

