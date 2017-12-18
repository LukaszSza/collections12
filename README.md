# Kolekcje 

## W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?
* Na szczycie hierarchi znajduje się interfejs Collection
* Pochodnymi interfejsu Collection są List, Set, Queue, Deque
* Interfejs Mao nie znajduje się w powyższej hierarchii
* Interfejs SortedSet, SortedMap umożliwiają przechowywanie posortowanych kolekcji

## Jakie są podstawowe implementacje poszczególnych interfejsów?
* Implementacjami interfejsu List są: LinkedList, ArrayList
* Implementacjami ingerfejsu Set są: HashSet, TreeSet, LinkedHashSet
* Implementacje interfejsu Queue: LinkedList
* Implementacje interfejsu Deque: LinkedList
* Implementacje interfejsu Set: HashMap, TreeMap, LindekHashMap

## W których kolekcjach elementy są sortowane i w jaki sposób?
* Interfejsy SortedSet i SortedMap  umożliwiają przechowywanie klolekcji uporządkowanej. Wykorzystywany jest naturalny porządek obiektów (compareTo) lub można wskazać Comparator. Implementacjami są TreeSet i TreeMap.

## Implementacje interfejsu List – złożoność operacji
* Klasa ArrayList wykorzystuje wewnętrznir implementacje tablicową
* Klasa lInkedList wykorzystuje implementację dowiązaniową
* Różnice pojawiają się podczas wykonywania operacji: odczytywanie i-tego elementu listy, zapisywanie i-tego elementu listy, dodawanie elementu na początek listy, usuwanie elementu z początku listy.

## Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy
* Zaimplementować metody: dodawaie n elementów ma początek listy, usuwanie n elementó z początku listy, odczytywanie wszystkich n elementó listy, metody przyjmują parametr typu List<Integer>
* 

## Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

## Do których kolekcji można wstawiać wartości null?