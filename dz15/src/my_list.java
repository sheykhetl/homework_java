public class my_list<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    //добавляет новый элемент в список. при достижении размера внутреннего массива происходит его увеличение в два раза.
    public void add(T item) {
        if(pointer == array.length - 1)
            resize(array.length * 2); //увеличиваем в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    //возвращает элемент списка по индексу.
    public T get(int index) {
        return (T) array[index];
    }

    /*
    удаляет элемент списка по индексу. все элементы справа от удаляемого
    перемещаются на шаг налево.еЕсли после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.
    */
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2); //если элементов в CUT_RATE раз меньше длины массива,
            //то уменьшаем в два раза
    }
    //возвращает количество элементов в списке
    public int size() {
        return pointer;
    }

    //вспомогательный метод для масштабирования
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}