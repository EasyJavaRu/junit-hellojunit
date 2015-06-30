package ru.easyjava.junit;

/**
 * Генератор приветствий.
 */
public class Greeter {
    /**
     * Создаёт простое приветствие.
     *
     * @param name Имя персоны, с которой мы хотим поздороваться или null.
     * @return Сформированное приветствие.
     */
    public final String greet(final String name) {
        if (name == null) {
            return "Hello Anonymous!";
        }
        return "Hello " + name + '!';
    }
}
