public class Radio {


    private int currentRadioStationNumber;  // номер текущей радиостанции
    private int currentSound;  // номер текущей громкости

    public int getCurrentRadioStationNumber() {  // метод для передачи текущей радиостанции
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {   // метод для передачи уровня текущей громкости
        return currentSound;
    }

    // Установка конкретного значения радиостанции
    public void setCurrentRadioStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            newStationNumber = 0;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;
        }
        currentRadioStationNumber = newStationNumber;
    }

// Установка конкретного значения громкости звука

    public void setSwitchSound(int newVolume) {

        if (newVolume > 100 | newVolume < 0) {
            return;
        }

        currentSound = newVolume;

    }

    // Увеличить радиостанцию
    public void nextStation(int Stantion) {

        if (Stantion >= 9) {
            currentRadioStationNumber = 0;

        }
        if (Stantion <= 0) {
            currentRadioStationNumber++;
        }
    }

    // Уменьшить радиостанцию
    public void prevStation(int nexStantion) {

        if (nexStantion > 9 | nexStantion < 0) {
            return;
        }
        currentRadioStationNumber = nexStantion - 1;
    }

    // Увеличить громкость

    public void increaseVolume(int newNextCurrentVolume) {

        if (newNextCurrentVolume < 0 | (newNextCurrentVolume > 100)) {
            return;
        }

        currentSound = newNextCurrentVolume + 1;
    }

    // Уменьшить громкость

    public void decreaseVolume(int newPrevCurrentVolume) {

        if (newPrevCurrentVolume <= 0 | newPrevCurrentVolume > 100) {
            return;
        }
        currentSound = newPrevCurrentVolume - 1;
    }


}
