package general.delegate;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 16.12.2016.
 */

import java.util.Scanner;

/**
 * Интерфейс описывает действие, которое будет вызываться при наступлении
 * события от таймера.
 */
interface TimerAction {
    void onTime();
}

class WakeUpAction implements TimerAction {
    @Override
    public void onTime() {
        System.out.println("Пора вставать!");
    }
}

class ChickenIsReadyAction implements TimerAction {
    @Override
    public void onTime() {
        System.out.println("Цыплёнок готов!");
    }
}

/**
 * Класс таймера. При определённых условиях вызывается действие TimerAction.
 */
class Timer {
    TimerAction action;

    /**
     * Функция, которую вызывает программист для установки времени.
     */
    void run() {
        if (isTime()) {
            action.onTime();
        }
    }

    /**
     * Некоторая функция, которая берет на себя всю работу со временем. Её
     * реализация не интересна в данном контексте.
     *
     * @return
     */
    private boolean isTime() {
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Введите тип действия:");
        Scanner scanner = new Scanner(System.in);
        String actionType = scanner.nextLine();
        Timer timer = new Timer();

        if (actionType.equalsIgnoreCase("set wake up timer")) {
            timer.action = new WakeUpAction();
        } else if (actionType.equalsIgnoreCase("set chicken timer")) {
            timer.action = new ChickenIsReadyAction();
        }

        timer.run();
    }
}