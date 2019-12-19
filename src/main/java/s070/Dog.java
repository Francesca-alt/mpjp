package s070;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";// abbaia una volta;
    }

    public String bark(int count) {// abbaia quante volte ti dico io;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override //è un annotazione sia per me che per il compilatore;
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}