class Darts {
    private double x;
    private double y;
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        int dartScore;
        if (this.x > 10 || this.y > 10) { return 0; }
        if (this.x > 5 || this.y > 5) { return 1; }
        if (this.x > 1 || this.y > 1) { return 5; }
        if (this.x >= 0 || this.y >= 0) { return 10; }
        return 0;
    }
}
