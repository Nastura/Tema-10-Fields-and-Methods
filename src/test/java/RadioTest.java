import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ РАДИОСТАНЦИИ.

    @Test   // Тест 1.  Получить номер текущей радиостанции. ОК

    public void giveMeTheCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. М1 Задать радиостанцию вне диапазона = - 10 OK

    public void negativeChannel() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test   // Тест 4. М1 Задать радиостанцию вне диапазона = - 1 OK

    public void valueGreaterThanMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 5. М1, М3 Увеличить радиостанцию с 0 на 1 ОК

    public void increaseStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 5. М1, М3 Увеличить радиостанцию с 9 на 10 ОК

    public void increaseStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 6. М4 Уменьшить радиостанцию с 0 на -1 ОК

    public void decreaseStationNegativeChannel() {
        Radio radio = new Radio();
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test  // Тест 2. М1 Переключить на 8 радиостанцию ОК

    public void changeTheRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test   // Тест 3. М1, М3 Переключить с 9 на 10 радиостанцию ОК

    public void changeTheRadioStationMAX() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 6. Переключить с 9 на 8 радиостанцию ОК

    public void decreaseStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }



    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ ГРОМКОСТИ.



    @Test  // Тест 2. Переключить уровень громкости на 8 OK
    public void switchSound() {
        Radio radio = new Radio();
        radio.setSwitchSound(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Увеличить громкость на 1 OK
    public void nextVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test    // Тест. Уменьшить громкость на 1 OKK / Получить текущий уровень громкости.
    public void currentSound() {
        Radio radio = new Radio();
        radio.setSwitchSound(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    // НЕГАТИВНЫЕ ТЕСТЫ


    @Test  // Тест. Переключить уровень громкости на 101 OK
    public void switchSoundMax() {
        Radio radio = new Radio();
        radio.setSwitchSound(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. Переключить уровень громкости на -1 OK
    public void switchSoundMin() {
        Radio radio = new Radio();
        radio.setSwitchSound(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест. Уменьшить громкость на 1 от 100
    public void switchSoundMinn() {
        Radio radio = new Radio();
        radio.setSwitchSound(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Получить громкость 101

    public void nextVolumeMax() {
        Radio radio = new Radio();
        radio.setSwitchSound(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест. Получить громкость -1

    public void nextVolumeMin() {
        Radio radio = new Radio();
        radio.setSwitchSound(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

