import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//Cоздаём управление для персонажа.
public class InputHandler implements KeyListener {
    //статический массив булёвок на 200 кнопок.
    private static boolean[] keys = new boolean[200];

    public static boolean isPressed(int keycode){
        return keys[keycode];
    }

    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    public void keyTyped(KeyEvent e) {

    }
}
