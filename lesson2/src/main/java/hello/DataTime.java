package hello;

public class DataTime {

    private final String data;
    private final String time;

    DataTime(String data, String time) {
        this.data = data;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getData() {
        return data;
    }

}
