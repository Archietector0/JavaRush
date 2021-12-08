/**
 * Написать три класса: Judaism(Иудаизм), Christianity(Христианство), Islam(Мусульманство).
 * Унаследовать христианство от иудаизма и мусульманство от христианства.
 */

public class Religions {
    public static void main(String[] args) {}
}

class Judaism {}
class Christianity extends Judaism {}
class Islam extends Christianity {}