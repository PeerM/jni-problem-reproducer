import org.rocksdb.RocksDB;

public class LoadRocksDB {
    public static void main(String[] args) {
        RocksDB.loadLibrary();
        System.out.println("The Reproducer Java Program ran successfully");
    }
}
