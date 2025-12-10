package TypeErasure;

public class TypeErasureApp {
    public static void main(String[] args) {
        Data stringData = new Data<>("Sandy");
        Data<Integer> integerData = (Data<Integer>) stringData;
        Integer integer = integerData.getData(); // error
        System.out.println(integer);
    }

    public static class Data<T> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
