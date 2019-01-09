class SpaceAge {
    private double secondsAge;

    SpaceAge(double seconds) {
        secondsAge = seconds;
    }

    double getSeconds(double years) {
        return years * 365.25 * 24 * 60.0 * 60.0;
    }

    double onEarth() {
        return secondsAge/getSeconds(1);
    }

    double onMercury() {
        return secondsAge/getSeconds(0.2408467);
    }

    double onVenus() {
        return secondsAge/getSeconds(0.61519726);
    }

    double onMars() {
        return secondsAge/getSeconds(1.8808158);
    }

    double onJupiter() {
        return secondsAge/getSeconds(11.862615);
    }

    double onSaturn() {
        return secondsAge/getSeconds(29.447498);
    }

    double onUranus() {
        return secondsAge/getSeconds(84.016846);
    }

    double onNeptune() {
        return secondsAge/getSeconds(164.79132);
    }

}
