package AccessModifiers;

public interface Accessible {

    // Challenge:
    // In the following interface declaration, what is the visibility of:
    //
    // 1. the Accessible Interface?  A: set to package-private by default, so accessible to all classes within this package (AccessModifiers).
    // 2. the int variable SOME_CONSTANT?  A: visibility set to public. All interface variables are public static final.
    // 3. methodA?  A: "standard" public as declared explicitly
    // 4. methodB & methodC?  A: all interface methods are automatically public

    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
