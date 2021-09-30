package stepik.basiccourse.all.generics61;

import java.util.Objects;
import java.util.Optional;

public class Pair<T, E> {
    private final T valueT;
    private final E valueE;

    private Pair(T valueT, E valueE) {
        this.valueT = valueT;
        this.valueE = valueE;
    }

    public T getFirst() {
        return valueT;
    }

    public E getSecond() {
        return valueE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair<T, E> pair = (Pair) obj;
        return Objects.equals(getFirst(), pair.getFirst()) && Objects.equals(getSecond(), pair.getSecond());
    }

    //первый вариант реализации метода hashCode() /////////////
//    @Override
//    public int hashCode() {
//        Optional<T> result1 = Optional.ofNullable(getFirst()).hashCode();
//        Optional<E> result2 = Optional.ofNullable(getSecond());
//        return result1.hashCode() + result2.hashCode();
//    }


    //второй вариант реализации метода hashCode(). Более короткий чем первый /////////////
    @Override
    public int hashCode() {
        return Optional.ofNullable(getFirst()).hashCode() + Optional.ofNullable(getSecond()).hashCode();
    }


    //третий вариант реализации метода hashCode()////////////
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(getFirst()) + Objects.hashCode(getSecond());
//    }

    public static <T, E> Pair<T, E> of(T valueT, E valueE) {
        return new Pair<>(valueT, valueE);
    }
}