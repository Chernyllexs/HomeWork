# Тестирование производительности коллекций

## 1. MyLinkedList vs LinkedList
Ниже представлены графики производительности основных операций для самописного и официального связного списка.
Тестирование производилось на выборках данных по 10к, 100к и 1000к. 
![График добавления одного элемента](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/add.png?raw=true)

![График большого количества элементов](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/adds.png?raw=true)

![График поиска одного элемента](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/find.png?raw=true)

![График удаления одного элемента](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/remove.png?raw=true)

Из графиков заметны довольно-таки странные зависимости времени выполннения от размера коллекции. 
Также следует заметить что почти все зависимости имеют равное значение производительности примерно на середине тестируемого интервала.
Однако на более низких объёмах данных видно преимущество в скорости работы связного списка из Java Collection Frameworks.
## 2. ArrayList vs LinkedList

На данном и следующих изображениях представлены нормированные линейчатые диаграммы с накоплением.
Их суть заключается в вычислении процентного соотношения несоразмерных величин. Более маленькое заполнение столбца говорит о наибольшей производительности.
Тестирование производилось на выборке в 100к элементов. 
![List](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/List.png?raw=true)

Как и ожидалось, операция добавления в конец ArrayList выполнилась в разы быстрее, чего не сказать об удалении и вставки из середины списка, там ArrayList 
показал себя хуже примерно на 60%. 

Таким образом, если планируется часто добавлять или удалять данные в середине списка, то следует использовать LinkedList. Эффективность достигается использованием
ссылок на следующий и предыдущий элемент, что не требует перезаписи всего списка при добавлении или удалении в середине. 
Если планируется работа со списком и хранением данных, то ArrayList, который имеет более быстрый доступ по индексу из-за непрерывного расположения элементов в памяти.

## 3. HashSet vs LinkedHashSet vs TreeSet
![Set](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/Set.png?raw=true)


Из графика видно, что явного лидера нет, поэтому рассмотрим каждую операцию по отдельности.
С удалением в два раза быстрее конкурентов справился LinkedHashSet, так как хранит элементы в виде связного списка, к тому же элементы хранятся в порядке добавления.
На операции последовательной вставки 100к элементов LinkedHashSet также оказался на лидирующей позиции из-за своей структуры.
А вот на вставку элемента у TreeSet уходит в разы меньше времени так как коллекция уже отсортирована, благодаря наличию красно-черного дерева в своей структуре.
HashSet хранит элементы в хэш-таблице и использует функцию hashCode() для определения корзины, хранящихся объектов. В основе лежит HashMap, в качестве ключа используется сам объект.

Таким образом, можно сделать следующие выводы:
* Если требуется хранить элементы упорядоченно - TreeSet;
* Если требуется хранить элементы в порядке добавления - LinkedHashSet;
* В остальных случаях - HashSet;


## 4. HashMap vs LinkedHashMap vs TreeMap
![Map](https://github.com/Chernyllexs/HomeWork/blob/master/src/com/java/october/fest/task/collections/img/Map.png?raw=true)


Если проанализировать этот график и график коллекций Set, то можно заметить схожие значения. Дело в том, что в основе Set лежат Map коллекции.
Ожидаемо, что операция удаления наиболее быстрая у LinkedHashMap, благодаря связному списку. С добавлением в данном случае быстрее справился HashMap, скорее всего,
в этой выборке данных попались наиболее разнообразные хэш-коды из-за чего возникло меньше коллизий и не пришлось перестраивать структуру бакета на красно-чёрное дерево.
Во вставке с небольшим отрывом лидирует LinkedHashMap, что еще раз подчёркивает несколько иной характер данных, так как при их генерации использовались псевдослучайные значения.

Вывод, в целом, будет аналогичен предыдущему пункту.

## 5. Выводы

* Наиболее быстрое получение элемента по индексу у ArrayList;
* LinkedList для быстрой вставки в середину или конец;
* HashMap оптимальна при работе с данными ключ-значение;
* Set подходят для хранения уникальных значений, при этом характеристики доступа такие же, как Map.

