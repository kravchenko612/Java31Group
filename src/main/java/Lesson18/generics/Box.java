package Lesson18.generics;

    public class Box<T> {
        private T content;

        public Box(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

    // Пример использования
    Box<Integer> integerBox = new Box<>(42);
    Box<String> stringBox = new Box<>("Hello, Generics!");

    Integer intValue = integerBox.getContent();
    String stringValue = stringBox.getContent();
}
