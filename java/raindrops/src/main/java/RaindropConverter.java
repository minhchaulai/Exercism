class RaindropConverter {

    String convert(int number) {
        String threeFlag = "";
        String fiveFlag = "";
        String sevenFlag = "";

        if (number % 3 == 0) { threeFlag = "Pling"; }
        if (number % 5 == 0) { fiveFlag = "Plang"; }
        if (number % 7 ==0) { sevenFlag = "Plong"; }

        if (threeFlag.equals("") && fiveFlag.equals("") && sevenFlag.equals("")) { return Integer.toString(number); }
        return threeFlag + fiveFlag + sevenFlag;
    }

}
