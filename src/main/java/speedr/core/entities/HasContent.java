package speedr.core.entities;

/**
 *
 * This interface represents a source of data. A data source implements a "getContent" method.
 *
 * The SpeedReaderStream takes a HasContent implementation.
 *
 */

public interface HasContent {

    public String getContent();

}
