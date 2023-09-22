import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ РАДИОСТАНЦИИ.


    @Test   // Тест 1. Получить номер текущей радиостанции.

    public void giveMeTheCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);


    }


    @Test  // Тест 2. Переключить на 8 радиостанцию

    public void changeTheRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. Переключить на -8 радиостанцию

    public void negativeChannel() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-8);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test   // Тест 3. Переключить на 9 радиостанцию

    public void changeTheRadioStationMAX() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test   // Тест 4. Переключить на 10 радиостанцию

    public void valueGreaterThanMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test   // Тест 5. Увеличить радиостанцию

    public void increaseStation() {
        Radio radio = new Radio();
        radio.nextStation(0);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 5. Увеличить радиостанцию

    public void increaseStationMax() {
        Radio radio = new Radio();
        radio.nextStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test   // Тест 6. Уменьшить радиостанцию от 9

    public void decreaseStationMin() {
        Radio radio = new Radio();
        radio.prevStation(2);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 6. Уменьшить радиостанцию от нуля

    public void decreaseStationNegativeChannel() {
        Radio radio = new Radio();
        radio.prevStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 6. Уменьшить радиостанцию от нуля

    public void decreaseStationNegativeChannelNull() {
        Radio radio = new Radio();
        radio.prevStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ ГРОМКОСТИ.

    @Test   // Тест 1. Получить текущий уровень громкости.

    public void currentVolumeLevel() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }


    @Test  // Тест 2. Переключить уровень громкости 8

    public void switchSound() {
        Radio radio = new Radio();
        radio.setSwitchSound(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. Переключить уровень громкости 8

    public void switchSoundMax() {
        Radio radio = new Radio();
        radio.setSwitchSound(102);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. Переключить уровень громкости 8

    public void switchSoundMin() {
        Radio radio = new Radio();
        radio.setSwitchSound(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Увеличить громкость

    public void nextVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(50);

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Увеличить громкость вне допустимого диапазона

    public void nextVolumeMax() {
        Radio radio = new Radio();

        radio.increaseVolume(102);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Увеличить громкость вне допустимого диапазона

    public void nextVolumeMin() {
        Radio radio = new Radio();

        radio.increaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test    // Тест. Уменьшить громкость

    public void currentSound() {
        Radio radio = new Radio();

        radio.decreaseVolume(50);

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Уменьшить громкость вне допустимого диапазона

    public void currentSoundMin() {
        Radio radio = new Radio();

        radio.decreaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Уменьшить громкость вне допустимого диапазона

    public void currentSoundMax() {
        Radio radio = new Radio();

        radio.decreaseVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

