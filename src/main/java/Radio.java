public class Radio {


    private int currentRadioStationNumber;  // номер текущей радиостанции
    private int currentSound;  // номер текущей громкости

    public int getCurrentRadioStationNumber() {  // метод для передачи текущей радиостанции
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {   // метод для передачи уровня текущей громкости
        return currentSound;
    }

    // Метод 1. Получить номер текущей радиостанции.
    public void setCurrentRadioStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            newStationNumber = 0;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;
        }
        currentRadioStationNumber = newStationNumber;
    }

// Метод 2. Получить текущий уровень громкости.

    public void setSwitchSound(int newVolume) {

        if (newVolume > 100 | newVolume < 0) {
            return;
        }

        currentSound = newVolume;

    }

    // Метод 3. Увеличить радиостанцию на 1
    public void nextStation() {

        if (currentRadioStationNumber >= 9) {
            currentRadioStationNumber = 0;
            return;
        }
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    // Метод 4. Уменьшить радиостанцию на 1
    public void prevStation() {

        if (currentRadioStationNumber >= 9) {
            currentRadioStationNumber = currentRadioStationNumber - 1;

        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber <= 0) {
            currentRadioStationNumber = 9;
        }
    }

    // Метод 5. Увеличить громкость на 1 | | | |

    public void increaseVolume() {

        if (currentSound < 0 | (currentSound == 100)) {
            return;
        }

        currentSound = currentSound + 1;
    }

    // Метод 6. Уменьшить громкость на 1 | | | |

    public void decreaseVolume() {

        if (currentSound <= 0  | currentSound > 100) {
            return;
        }
        currentSound = currentSound - 1;
    }


}
