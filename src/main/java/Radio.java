public class Radio {


    private int currentRadioStation;  // номер текущей радиостанции
    private int currentVolume;  // номер текущей громкости

    public int getCurrentRadioStation() {  // метод для передачи текущей радиостанции
        return currentRadioStation;
    }

    public int getCurrentVolume() {   // метод для передачи уровня текущей громкости
        return currentVolume;
    }

    // Метод 1. Получить номер текущей радиостанции.
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

// Метод 2. Получить текущий уровень громкости.

    public void setSwitchSound(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }

        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }

        currentVolume = newCurrentVolume;

    }

    // Метод 3. Увеличить радиостанцию на 1
    public void nextRadioStation() {

        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);

        } else {
            currentRadioStation++;

        }
    }

    // Метод 4. Уменьшить радиостанцию на 1
    public void previousRadioStation() {

        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);

        } else {
            currentRadioStation--;
        }

    }

    // Метод 5. Увеличить громкость на 1 | | | |

    public void increaseVolume() {


        if (currentVolume >= 100) {
            setSwitchSound(100);
        } else {
            currentVolume++;
        }

    }

    // Метод 6. Уменьшить громкость на 1 | | | |

    public void decreaseVolume() {


        if (currentVolume <= 0) {
            setSwitchSound(0);
        } else {
            currentVolume--;
        }

    }
}
