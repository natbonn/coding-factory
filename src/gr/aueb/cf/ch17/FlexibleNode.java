package gr.aueb.cf.ch17;

/**
 * Περιέχει ένα {@link Object}
 * οποιοσδήποτε τύπος δεδομένων μπορεί να αποθηκευτεί
 * σε αυτό το πεδίο.
 */
public class FlexibleNode {
    private Object value;

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
