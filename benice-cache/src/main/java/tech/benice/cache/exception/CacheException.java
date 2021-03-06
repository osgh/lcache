package tech.benice.cache.exception;

/**
 * <p>Title:CacheException</p>
 * <p>Description: </p>
 *
 * @author chao
 */
public class CacheException extends RuntimeException {

    public CacheException() {
        super();
    }

    public CacheException(String message) {
        super(message);
    }

    public CacheException(Throwable cause) {
        super(cause);
    }

    public CacheException(String message, Throwable cause) {
        super(message, cause);
    }
}
