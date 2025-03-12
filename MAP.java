public interface MAP<K, V> {
    public int size();

    public boolean isEmpty();

    public boolean containsKey(K key);
    
    public boolean containsValue(V value);

    public V get(K key);

    public V put(K key, V value);

    public V remove(K key);

    public void putAll(MAP<? extends K, ? extends V> m);

    public void clear();

    public Set<K> keySet();

    public Collection<V> values();

    public Set<Entry<K, V>> entrySet();

    public boolean equals(Object o);

    public int hashCode();
}
