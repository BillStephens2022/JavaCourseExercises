package Classes;

// the part in parentheses below is called the "record header"
// for each component in the header, JAVA generates:
//       A field name with the same name and declared type as the record component
//       The field is declared private and final.
// Java generates a toString method that prints out each attribute in a formatted string
// In addition to creating a private final field for each component, Java generates a public accessor
//    method for each component.
// This method has the same name and type of the component, but it doesn't have any kind of special
// prefix, no get, or is, for example.
// The accessor method, for id in this example, is simply id().
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {}
