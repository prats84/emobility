
package ocpp.cp._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="HashError"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="VersionMismatch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateStatus")
@XmlEnum
public enum UpdateStatus {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("HashError")
    HASH_ERROR("HashError"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("VersionMismatch")
    VERSION_MISMATCH("VersionMismatch");
    private final String value;

    UpdateStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateStatus fromValue(String v) {
        for (UpdateStatus c: UpdateStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
