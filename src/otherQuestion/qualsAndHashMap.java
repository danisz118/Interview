package otherQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class qualsAndHashMap {
    public static void main(String[] args) {
        Map<Foo, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            map.put(new Foo("123"), 1);
        }
        System.out.println(map.size());

    }

    public static class Foo {
        public String name;


        public Foo(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Foo foo = (Foo) o;
            return Objects.equals(name, foo.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}

