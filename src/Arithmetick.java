public class Arithmetick {
    private int i;
    private int j;
    public Arithmetick(int i,int j) {
        this.i = i;
        this.j = j;
    }
    public int sum() {
        return i + j;
    }
    public int multiplication() {
        return i * j;
    }
    public String maxMin() {
        if (i > j)
            return "Число " + i + " > " + "числа " + j;
        else if (i < j)
            return "Число " + i + " < " + "числа " + j;
        else
            return "Числа равны";
    }
}

