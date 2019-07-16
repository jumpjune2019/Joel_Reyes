public enum ThreadStatus {
    ONE(0), TWO(0), THREE(0), FOUR(0), FIVE(0);
    private int Count;
    ThreadStatus(int count){
        Count = count;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
