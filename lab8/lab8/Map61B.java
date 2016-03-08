package lab8;
import java.util.Set;
/* Your implementation BSTMap should implement this interface. To do so, 
 * append "implements Map61B<K,V>" to the end of your "public class..."
 * declaration, though you can use other formal type parameters if you'd like.
 */ 
public interface Map61B<K, V> extends Iterable<K> {
    /** Removes all of the mappings from this map. */
<<<<<<< HEAD
    public void clear();

    /* Returns true if this map contains a mapping for the specified key. */
    public boolean containsKey(K key);
=======
    void clear();

    /* Returns true if this map contains a mapping for the specified key. */
    boolean containsKey(K key);
>>>>>>> beta deployment

    /* Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key. 
     */
<<<<<<< HEAD
    public V get(K key);

    /* Returns the number of key-value mappings in this map. */
    public int size();

    /* Associates the specified value with the specified key in this map. */
    public void put(K key, V value);

    /* Returns a Set view of the keys contained in this map. */
    public Set<K> keySet();    
=======
    V get(K key);

    /* Returns the number of key-value mappings in this map. */
    int size();

    /* Associates the specified value with the specified key in this map. */
    void put(K key, V value);

    /* Returns a Set view of the keys contained in this map. */
    Set<K> keySet();    
>>>>>>> beta deployment

    /* Removes the mapping for the specified key from this map if present.
     * Not required for Lab 8. If you don't implement this, throw an 
     * UnsupportedOperationException. */
<<<<<<< HEAD
    public V remove(K key);
=======
    V remove(K key);
>>>>>>> beta deployment

    /* Removes the entry for the specified key only if it is currently mapped to
     * the specified value. Not required for Lab 8. If you don't implement this,
     * throw an UnsupportedOperationException.*/
<<<<<<< HEAD
    public V remove(K key, V value);
=======
    V remove(K key, V value);
>>>>>>> beta deployment
}
