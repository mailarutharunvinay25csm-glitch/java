import java.util.*;

public class CollectionMethodsDemo {
    public static void main(String[] args) {

        // 1. Collection Interface
        Collection<String> c = new ArrayList<>();
        c.add("Apple");
        c.add("Banana");
        c.addAll(Arrays.asList("Mango", "Orange"));

        System.out.println("Collection: " + c);
        System.out.println("Contains Mango: " + c.contains("Mango"));
        System.out.println("Size: " + c.size());
        System.out.println("Is Empty: " + c.isEmpty());

        c.remove("Orange");
        System.out.println("After remove: " + c);

        // 2. List Interface
        List<String> list = new ArrayList<>(
                Arrays.asList("Red", "Blue", "Red"));

        list.add(1, "Green");

        System.out.println("\nList: " + list);
        System.out.println("get(1): " + list.get(1));

        list.set(1, "Yellow");
        System.out.println("After set: " + list);

        System.out.println("indexOf Red: " + list.indexOf("Red"));
        System.out.println("lastIndexOf Red: " + list.lastIndexOf("Red"));
        System.out.println("subList(0, 2): " + list.subList(0, 2));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);

        list.remove(0);
        System.out.println("After remove(0): " + list);

        // 3. Set Interface
        Set<Integer> set = new HashSet<>(
                Arrays.asList(30, 10, 20, 20));

        set.add(40);

        System.out.println("\nSet (unique values): " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Set size: " + set.size());

        set.remove(10);
        System.out.println("After remove 10: " + set);

        // 4 and 5. SortedSet and NavigableSet
        NavigableSet<Integer> ns =
                new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        SortedSet<Integer> ss = ns;

        System.out.println("\nSortedSet: " + ss);
        System.out.println("First: " + ss.first());
        System.out.println("Last: " + ss.last());
        System.out.println("headSet(30): " + ss.headSet(30));
        System.out.println("tailSet(30): " + ss.tailSet(30));
        System.out.println("subSet(20, 40): " + ss.subSet(20, 40));

        System.out.println("lower(30): " + ns.lower(30));
        System.out.println("floor(30): " + ns.floor(30));
        System.out.println("ceiling(35): " + ns.ceiling(35));
        System.out.println("higher(30): " + ns.higher(30));
        System.out.println("descendingSet: " + ns.descendingSet());

        System.out.println("pollFirst: " + ns.pollFirst());
        System.out.println("pollLast: " + ns.pollLast());

        // 6. Queue Interface
        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.offer("Two");
        queue.offer("Three");

        System.out.println("\nQueue: " + queue);
        System.out.println("element: " + queue.element());
        System.out.println("peek: " + queue.peek());
        System.out.println("remove: " + queue.remove());
        System.out.println("poll: " + queue.poll());
        System.out.println("Queue after removals: " + queue);

        // 7. Deque Interface
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");
        deque.addLast("C");
        deque.offerFirst("A");
        deque.offerLast("D");

        System.out.println("\nDeque: " + deque);
        System.out.println("peekFirst: " + deque.peekFirst());
        System.out.println("peekLast: " + deque.peekLast());
        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("Deque after removals: " + deque);

        // 8. Map Interface
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println("\nMap: " + map);
        System.out.println("get(2): " + map.get(2));
        System.out.println("containsKey(1): " + map.containsKey(1));
        System.out.println("containsValue(Java): "
                + map.containsValue("Java"));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        map.remove(3);
        System.out.println("After remove key 3: " + map);

        // 9 and 10. SortedMap and NavigableMap
        NavigableMap<Integer, String> nm = new TreeMap<>();

        nm.put(10, "Ten");
        nm.put(20, "Twenty");
        nm.put(30, "Thirty");
        nm.put(40, "Forty");

        SortedMap<Integer, String> sm = nm;

        System.out.println("\nSortedMap: " + sm);
        System.out.println("firstKey: " + sm.firstKey());
        System.out.println("lastKey: " + sm.lastKey());
        System.out.println("headMap(30): " + sm.headMap(30));
        System.out.println("tailMap(20): " + sm.tailMap(20));
        System.out.println("subMap(10, 30): " + sm.subMap(10, 30));

        System.out.println("lowerKey(30): " + nm.lowerKey(30));
        System.out.println("floorKey(30): " + nm.floorKey(30));
        System.out.println("ceilingKey(25): " + nm.ceilingKey(25));
        System.out.println("higherKey(30): " + nm.higherKey(30));

        System.out.println("firstEntry: " + nm.firstEntry());
        System.out.println("lastEntry: " + nm.lastEntry());
        System.out.println("descendingMap: " + nm.descendingMap());

        System.out.println("pollFirstEntry: " + nm.pollFirstEntry());
        System.out.println("pollLastEntry: " + nm.pollLastEntry());

        // 11. Iterator Interface
        List<String> names =
                new ArrayList<>(Arrays.asList("Asha", "Bala", "Charan"));

        Iterator<String> it = names.iterator();

        System.out.print("\nIterator: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // 12. ListIterator Interface
        ListIterator<String> li = names.listIterator();

        System.out.print("ListIterator forward: ");

        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.print("\nListIterator backward: ");

        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }

        System.out.println();
    }
}
