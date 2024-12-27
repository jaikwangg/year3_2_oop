public class App {
    public static void main(String[] args) {
        Person dad = new Person("John");
        Person mom = new Person("Marry");
        Person olderBrother = new Person("Chris");
        Person youngerBrother = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(dad, olderBrother);
        relationships.addParentAndChild(dad, youngerBrother);
        relationships.addParentAndChild(mom, olderBrother);
        relationships.addParentAndChild(mom, youngerBrother);
        relationships.addSibling(olderBrother, youngerBrother);

        Research.research(relationships, "John", RelationshipStatus.PARENT)
        .forEach(child -> System.out.println("John has a child called " + child.name));

        Research.research(relationships, "Marry", RelationshipStatus.PARENT)
        .forEach(child -> System.out.println("Marry has a child called " + child.name));

        Research.research(relationships, "Chris", RelationshipStatus.CHILD)
        .forEach(parent -> System.out.println("Chris has a parent called " + parent.name));

        Research.research(relationships, "Matt", RelationshipStatus.SIBLING)
        .forEach(sibling -> System.out.println("Matt has a sibling called " + sibling.name));
    }
}
