import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ РАДИОСТАНЦИИ.

    @Test   // Тест 1.  Получить номер текущей радиостанции. ОК

    public void giveMeTheCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест 2. М1 Задать радиостанцию вне диапазона = - 10 OK

    public void shouldNotSetRadioStationAboveLastStation10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test   // Тест 3. М1 Задать радиостанцию вне диапазона = - 1 OK

    public void valueGreaterThanMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 4. М1, М3 Увеличить радиостанцию с 0 на 1 ОК

    public void switchNextRadioStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 5. М1, М3 Увеличить радиостанцию с 9 на 10 ОК

    public void switchNextRadioStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 6. Уменьшить радиостанцию с 0 на 9

    public void switchPreviousRadioStationIfBelowMin() {
        Radio radio = new Radio();
        radio.previousRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  // Тест 7. М1 Переключить на 8 радиостанцию ОК

    public void changeTheRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test   // Тест 8. М1, М3 Переключить с 9 на 10 радиостанцию ОК

    public void changeTheRadioStationMAX() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Тест 9. Переключить с 9 на 8 радиостанцию ОК

    public void decreaseStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.previousRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    // ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ ГРОМКОСТИ.



    @Test  // Тест 10. Переключить уровень громкости на 8 OK
    public void switchSound() {
        Radio radio = new Radio();
        radio.setSwitchSound(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест 11. Увеличить громкость на 1 OK
    public void nextVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test    // Тест 12. Уменьшить громкость на 1 OKK / Получить текущий уровень громкости.
    public void currentSound() {
        Radio radio = new Radio();
        radio.setSwitchSound(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test  // Тест 13. Переключить уровень громкости на 101 OK
    public void switchSoundMax() {
        Radio radio = new Radio();
        radio.setSwitchSound(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест 14. Переключить уровень громкости на -1 OK
    public void switchSoundMin() {
        Radio radio = new Radio();
        radio.setSwitchSound(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  // Тест 15. Уменьшить громкость на 1 от 100
    public void switchSoundMinn() {
        Radio radio = new Radio();
        radio.setSwitchSound(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест 16. Получить громкость 101

    public void nextVolumeMax() {
        Radio radio = new Radio();
        radio.setSwitchSound(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test    // Тест 17. Получить громкость -1

    public void nextVolumeMin() {
        Radio radio = new Radio();
        radio.setSwitchSound(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

