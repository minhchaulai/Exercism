import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();
        String binary = Integer.toBinaryString(number);
        boolean reverse = false;
        int max = 5;

        for (int i=0; i < binary.length(); i++) {
            switch (max - binary.length() + i) {
                case 0:
                    reverse = true;
                    break;
                case 1:
                    if (binary.charAt(i) == '1') {
                        handshake.add(Signal.JUMP);
                    }
                    break;
                case 2:
                    if (binary.charAt(i) == '1') {
                        handshake.add(Signal.CLOSE_YOUR_EYES);
                    }
                    break;
                case 3:
                    if (binary.charAt(i) == '1') {
                        handshake.add(Signal.DOUBLE_BLINK);
                    }
                    break;
                case 4:
                    if (binary.charAt(i) == '1') {
                        handshake.add(Signal.WINK);
                    }
                    break;
            }
        }

        if (!reverse) {
            Collections.reverse(handshake);
            return handshake;
        }
        return handshake;
    }

}
